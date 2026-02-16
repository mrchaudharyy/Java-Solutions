package com.javasolutions.lowleveldesign.behavioralpatterns.observer.notifymefeature.observer;

// Concrete observer for email notifications
public class EmailNotificationObserver implements StockNotificationObserver {
    private final String userId;
    private final String emailAddress;

    public EmailNotificationObserver(String userId, String emailAddress) {
        this.userId = userId;
        this.emailAddress = emailAddress;
    }

    @Override
    public void update() {
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("!! EMAIL SENT to: " + emailAddress + " - " + "Product is back in stock! Hurry Up!!");
    }

    @Override
    public String getNotificationMethod() {
        return "Email";
    }

    @Override
    public String getUserId() {
        return userId;
    }
}
