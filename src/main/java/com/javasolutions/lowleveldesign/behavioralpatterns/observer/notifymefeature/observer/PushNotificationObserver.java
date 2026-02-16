package com.javasolutions.lowleveldesign.behavioralpatterns.observer.notifymefeature.observer;

// Concrete observer for push notifications
public class PushNotificationObserver implements StockNotificationObserver {
    private final String userId;
    private final String deviceToken;

    public PushNotificationObserver(String userId, String deviceToken) {
        this.userId = userId;
        this.deviceToken = deviceToken;
    }

    @Override
    public void update() {
        sendPushNotification();
    }

    private void sendPushNotification() {
        System.out.println("!! PUSH NOTIFICATION SENT to: " + deviceToken + " - " + "Product is back in stock! Hurry Up!!");
    }

    @Override
    public String getNotificationMethod() {
        return "Push Notification";
    }

    @Override
    public String getUserId() {
        return userId;
    }
}
