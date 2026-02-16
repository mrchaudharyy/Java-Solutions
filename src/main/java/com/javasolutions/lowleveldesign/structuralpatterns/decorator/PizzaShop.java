package com.javasolutions.lowleveldesign.structuralpatterns.decorator;

// Step 5: Client Demonstration
public class PizzaShop {
    public static void main(String[] args) {
        System.out.println("======= Decorator Design Pattern ======");
        // Create a plain pizza
        BasePizza pizza1 = new PlainPizza();
        System.out.println("Order 1: " + pizza1.getDescription() + " = Rs." + pizza1.getCost());

        // Add toppings to the PlainPizza - Extra Cheese Only
        BasePizza pizza2 = new ExtraCheeseTopping(new PlainPizza());
        System.out.println("Order 2: " + pizza2.getDescription() + " = Rs." + pizza2.getCost());

        // Add toppings to the PlainPizza - Extra Cheese and Veggies
        BasePizza pizza3 = new VeggiesTopping(new ExtraCheeseTopping(new PlainPizza()));
        System.out.println("Order 3: " + pizza3.getDescription() + " = Rs." + pizza3.getCost());

        // Add toppings to the PlainPizza - Extra Cheese and Pepperoni
        BasePizza pizza4 = new PepperoniTopping(new ExtraCheeseTopping(new PlainPizza()));
        System.out.println("Order 4: " + pizza4.getDescription() + " = Rs." + pizza4.getCost());

        // Add toppings to the PlainPizza - Extra Cheese, Mushroom and Pepperoni
        BasePizza pizza5 = new MushroomTopping(new PepperoniTopping(new ExtraCheeseTopping(new PlainPizza())));
        System.out.println("Order 5: " + pizza5.getDescription() + " = Rs." + pizza5.getCost());

        // Farmhouse Pizza
        BasePizza pizza6 = new Farmhouse();
        System.out.println("Order 6: " + pizza6.getDescription() + " = Rs." + pizza6.getCost());

        // Farmhouse Pizza with Extra Cheese and Mushroom
        BasePizza pizza7 = new MushroomTopping(new ExtraCheeseTopping(new Farmhouse()));
        System.out.println("Order 7: " + pizza7.getDescription() + " = Rs." + pizza7.getCost());

        // Tandoori Paneer Delight Pizza
        BasePizza pizza8 = new TandooriPaneerDelight();
        System.out.println("Order 8: " + pizza8.getDescription() + " = Rs." + pizza8.getCost());

        // Chicken Dominator
        BasePizza pizza9 = new ChickenDominator();
        System.out.println("Order 9: " + pizza9.getDescription() + " = Rs." + pizza9.getCost());

        // Chicken Dominator with Mushroom
        BasePizza pizza10 = new MushroomTopping(new ChickenDominator());
        System.out.println("Order 10: " + pizza10.getDescription() + " = Rs." + pizza10.getCost());
    }
}
