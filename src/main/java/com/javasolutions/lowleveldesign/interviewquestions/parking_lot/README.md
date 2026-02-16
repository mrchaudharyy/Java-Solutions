# Parking Lot System

## Entities Identification

1. Entry Gate -> Look for the spot -> If multiple gates check for locking
2. Exit Gate -> Cost Computation -> Can be Card, Cash, UPI
3. Building 3.1 Level 1 -> Only for 2 wheelers, 4 wheelers 3.2 Level 2 -> Only for 4 wheelers and Long Vehicles
4. Vehicle -> vehicleNumber , type (TWO_WHEELER, FOUR_WHEELER)
5. Ticket -> entryTime, vehicle, spot, level
6. Parking Spot -> spotId, isFree
7. Payment -> Cash, Card, Online

8. ParkingSpotManager -> Can be TWO_WHEELER manager or FOUR_WHEELER.

## Design Patterns Used

### 1. **Strategy Pattern**

- **ParkingSpotLookupStrategy**: Allows different algorithms for selecting parking spots (e.g., Random, Nearest, etc.)
- **PricingStrategy**: Enables flexible pricing models (e.g., Fixed, Hourly, Dynamic)
- **Payment**: Supports multiple payment methods (Cash, UPI, etc.)

### 2. **Factory Pattern (Implicit)**

- Different `ParkingSpotManager` implementations for different vehicle types

### 3. **Composition Pattern**

- `ParkingLot` is composed of `ParkingBuilding`, `EntranceGate`, and `ExitGate`
- `ParkingBuilding` contains multiple `ParkingLevel` instances
- `ParkingLevel` manages multiple `ParkingSpotManager` instances

### 4. **Template Method Pattern (Implicit)**

- `ParkingSpotManager` provides common functionality with thread-safe operations
- Subclasses (`TwoWheelerSpotManager`, `FourWheelerSpotManager`) specialize for vehicle types

## Key Features

### Thread Safety

- `ParkingSpotManager` uses `ReentrantLock` to ensure thread-safe parking operations

### Separation of Concerns

- **Entity**: Core domain objects (`Vehicle`, `ParkingSpot`)
- **Parking Lot**: Main system components
- **Spot Managers**: Manage parking spots by vehicle type
- **Lookup Strategy**: Spot selection algorithms
- **Pricing**: Cost calculation logic
- **Payment**: Payment processing

### Extensibility

- Easy to add new vehicle types by creating new `ParkingSpotManager` subclasses
- New pricing strategies can be added by implementing `PricingStrategy`
- New payment methods via `Payment` interface
- New spot selection algorithms via `ParkingSpotLookupStrategy`

## System Flow

1. **Vehicle Entry**:
    - Vehicle arrives → `ParkingLot.vehicleArrives()`
    - `EntranceGate.enter()` → `ParkingBuilding.allocate()`
    - Find available level → Get appropriate `ParkingSpotManager`
    - Select spot using `ParkingSpotLookupStrategy`
    - Return `Ticket` with entry time

2. **Vehicle Exit**:
    - Vehicle exits → `ParkingLot.vehicleExits()`
    - `ExitGate.completeExit()` → Calculate cost using `CostComputation`
    - Process payment via `Payment` interface
    - Release spot → `ParkingBuilding.release()`

## Class Diagram

```mermaid
classDiagram
    %% Enums
    class VehicleType {
        <<enumeration>>
        TWO_WHEELER
        FOUR_WHEELER
    }

    %% Entity Classes
    class Vehicle {
        -String vehicleNumber
        -VehicleType vehicleType
        +Vehicle(String, VehicleType)
        +getVehicleNumber() String
        +getVehicleType() VehicleType
    }

    class ParkingSpot {
        -String spotId
        -boolean isFree
        +ParkingSpot(String)
        +isSpotFree() boolean
        +occupySpot() void
        +releaseSpot() void
        +getSpotId() String
    }

    class Ticket {
        -Vehicle vehicle
        -ParkingLevel level
        -ParkingSpot spot
        -LocalDateTime entryTime
        +Ticket(Vehicle, ParkingLevel, ParkingSpot)
        +getVehicle() Vehicle
        +getLevel() ParkingLevel
        +getSpot() ParkingSpot
        +getEntryTime() LocalDateTime
    }

    %% Parking Lot Core Classes
    class ParkingLot {
        -ParkingBuilding building
        -EntranceGate entranceGate
        -ExitGate exitGate
        +ParkingLot(ParkingBuilding, EntranceGate, ExitGate)
        +vehicleArrives(Vehicle) Ticket
        +vehicleExits(Ticket, Payment) void
    }

    class ParkingBuilding {
        -List~ParkingLevel~ levels
        +ParkingBuilding(List~ParkingLevel~, CostComputation)
        +allocate(Vehicle) Ticket
        +release(Ticket) void
    }

    class ParkingLevel {
        -int levelNumber
        -Map~VehicleType, ParkingSpotManager~ managers
        +ParkingLevel(int, Map)
        +hasAvailability(VehicleType) boolean
        +park(VehicleType) ParkingSpot
        +unPark(VehicleType, ParkingSpot) void
        +getLevelNumber() int
    }

    class EntranceGate {
        +enter(ParkingBuilding, Vehicle) Ticket
    }

    class ExitGate {
        -CostComputation costComputation
        +ExitGate(CostComputation)
        +completeExit(ParkingBuilding, Ticket, Payment) void
        -calculatePrice(Ticket) double
    }

    %% Spot Manager Classes
    class ParkingSpotManager {
        <<abstract>>
        #List~ParkingSpot~ spots
        #ParkingSpotLookupStrategy strategy
        -ReentrantLock lock
        #ParkingSpotManager(List~ParkingSpot~, ParkingSpotLookupStrategy)
        +park() ParkingSpot
        +unPark(ParkingSpot) void
        +hasFreeSpot() boolean
    }

    class TwoWheelerSpotManager {
        +TwoWheelerSpotManager(List~ParkingSpot~, ParkingSpotLookupStrategy)
    }

    class FourWheelerSpotManager {
        +FourWheelerSpotManager(List~ParkingSpot~, ParkingSpotLookupStrategy)
    }

    %% Lookup Strategy
    class ParkingSpotLookupStrategy {
        <<interface>>
        +selectSpot(List~ParkingSpot~) ParkingSpot
    }

    class RandomLookupStrategy {
        +selectSpot(List~ParkingSpot~) ParkingSpot
    }

    %% Pricing Classes
    class PricingStrategy {
        <<interface>>
        +calculate(Ticket) double
    }

    class FixedPricingStrategy {
        +calculate(Ticket) double
    }

    class CostComputation {
        -PricingStrategy pricingStrategy
        +CostComputation(PricingStrategy)
        +compute(Ticket) double
    }

    %% Payment Classes
    class Payment {
        <<interface>>
        +pay(double) boolean
    }

    class CashPayment {
        +pay(double) boolean
    }

    class UPIPayment {
        +pay(double) boolean
    }

    %% Relationships
    Vehicle --> VehicleType : uses
    Ticket --> Vehicle : contains
    Ticket --> ParkingLevel : references
    Ticket --> ParkingSpot : references

    ParkingLot --> ParkingBuilding : has
    ParkingLot --> EntranceGate : has
    ParkingLot --> ExitGate : has

    ParkingBuilding --> ParkingLevel : contains
    ParkingLevel --> ParkingSpotManager : manages
    ParkingLevel --> VehicleType : uses

    ParkingSpotManager <|-- TwoWheelerSpotManager : extends
    ParkingSpotManager <|-- FourWheelerSpotManager : extends
    ParkingSpotManager --> ParkingSpot : manages
    ParkingSpotManager --> ParkingSpotLookupStrategy : uses

    ParkingSpotLookupStrategy <|.. RandomLookupStrategy : implements

    PricingStrategy <|.. FixedPricingStrategy : implements
    CostComputation --> PricingStrategy : uses
    ExitGate --> CostComputation : uses

    Payment <|.. CashPayment : implements
    Payment <|.. UPIPayment : implements
    ExitGate --> Payment : uses
    ParkingLot --> Payment : uses

    EntranceGate --> ParkingBuilding : interacts
    EntranceGate --> Vehicle : processes
    ExitGate --> ParkingBuilding : interacts
    ExitGate --> Ticket : processes
```