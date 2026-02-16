package com.javasolutions.lowleveldesign.behavioralpatterns.observer.notifymefeature;

import com.javasolutions.lowleveldesign.behavioralpatterns.observer.notifymefeature.observable.IphoneProductObservable;
import com.javasolutions.lowleveldesign.behavioralpatterns.observer.notifymefeature.observable.StockAvailabilityObservable;
import com.javasolutions.lowleveldesign.behavioralpatterns.observer.notifymefeature.observer.EmailNotificationObserver;
import com.javasolutions.lowleveldesign.behavioralpatterns.observer.notifymefeature.observer.PushNotificationObserver;
import com.javasolutions.lowleveldesign.behavioralpatterns.observer.notifymefeature.observer.StockNotificationObserver;

public class ECommerceStockNotificationApp {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("###### E-commerce Store - Stock Availability Notification Feature Demo ######");

        // Create an iPhone product - stock available = 10 units
        StockAvailabilityObservable iphoneProduct = new IphoneProductObservable("ip15", "iphone 15", 1250, 10);

        // Create observers
        StockNotificationObserver John_PUSH = new PushNotificationObserver("John123", "JohnDeviceP1");
        StockNotificationObserver Katy_PUSH = new PushNotificationObserver("Katy678", "KatyDeviceP2");
        StockNotificationObserver Jane_EMAIL = new EmailNotificationObserver("Jane783", "jane783@gmail.com");
        StockNotificationObserver George_EMAIL = new EmailNotificationObserver("George993", "george993@gmail.com");

        // Black Friday Sale - Purchase all 10 units
        iphoneProduct.purchase(10);

        // Stock unavailability leads to users subscribing for notifications
        boolean success = iphoneProduct.purchase(1); // Failed purchase
        if (!success) {
            // Register observers - John, Katy, Jane, George subscribe to notifications upon stock availability
            iphoneProduct.addStockObserver(John_PUSH); // John
            iphoneProduct.addStockObserver(Katy_PUSH); // Katy
            iphoneProduct.addStockObserver(Jane_EMAIL); // Jane
            iphoneProduct.addStockObserver(George_EMAIL); // George
        }

        // Restock 20 units of iPhone 15
        iphoneProduct.restock(20); // All 4 observers are notified

        // Users purchase upon receiving notifications
        iphoneProduct.purchase(1); // John purchases 1 unit
        iphoneProduct.purchase(1); // Katy purchases 1 unit

        // John & Katy unsubscribe from notifications
        iphoneProduct.removeStockObserver(John_PUSH);
        iphoneProduct.removeStockObserver(Katy_PUSH);

        // NYE Sale - All 18 units sold
        iphoneProduct.purchase(18);
        iphoneProduct.restock(5); // Only Jane & George are notified

        iphoneProduct.purchase(1); // Jane purchases 1 unit
        iphoneProduct.purchase(1); // George purchases 1 unit

        // Jane & George unsubscribe from notifications
        iphoneProduct.removeStockObserver(Jane_EMAIL);
        iphoneProduct.removeStockObserver(George_EMAIL);
    }
}
