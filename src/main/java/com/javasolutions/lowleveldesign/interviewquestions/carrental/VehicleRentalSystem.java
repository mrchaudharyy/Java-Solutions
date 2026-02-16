package com.javasolutions.lowleveldesign.interviewquestions.carrental;

import java.util.ArrayList;
import java.util.List;

/*
we can also create, StoreManager class which takes
Care of managing List of Stores, and this VehicleRentalSystem has StoreManager

similarly we can also create UserManager, which takes
care of managing list of Users, and this VehicleRentalSystem has UserManager

for now for simplicity i am putting list of stores and list of Users in VehicleRentalSystem class.
 */
public class VehicleRentalSystem {

    List<Store> storeList;
    List<User> userList;

    public VehicleRentalSystem() {

        storeList = new ArrayList<>();
        userList = new ArrayList<>();
    }

    public Store getStore(int storeId) {
        return storeList.stream().filter(store -> store.getStoreId() == storeId).findFirst().get();
    }

    public User getUser(int userId) {
        return userList.get(userId);
    }

    public void addStore(Store store) {
        storeList.add(store);
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void removeStore(int storeId) {
        storeList.remove(storeId);
    }

    public void removeUser(int userId) {
        userList.remove(userId);
    }

}