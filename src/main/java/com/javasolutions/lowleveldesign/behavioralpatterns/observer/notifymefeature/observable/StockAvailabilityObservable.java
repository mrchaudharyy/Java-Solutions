package com.javasolutions.lowleveldesign.behavioralpatterns.observer.notifymefeature.observable;

import com.javasolutions.lowleveldesign.behavioralpatterns.observer.notifymefeature.observer.StockNotificationObserver;

// Observable interface
public interface StockAvailabilityObservable {
    void addStockObserver(StockNotificationObserver observer);

    void removeStockObserver(StockNotificationObserver observer);

    void notifyStockObservers();

    boolean purchase(int quantity);

    void restock(int quantity);
}
