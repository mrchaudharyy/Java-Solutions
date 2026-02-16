package com.javasolutions.lowleveldesign.behavioralpatterns.observer.notifymefeature.observer;

// Observer interface for stock availability notifications
public interface StockNotificationObserver {
    void update();

    String getNotificationMethod();

    String getUserId();
}
