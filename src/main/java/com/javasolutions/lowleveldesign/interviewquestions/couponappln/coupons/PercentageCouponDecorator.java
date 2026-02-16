package com.javasolutions.lowleveldesign.interviewquestions.couponappln.coupons;

import com.javasolutions.lowleveldesign.interviewquestions.couponappln.product.Product;

public class PercentageCouponDecorator extends CouponDecorator {

    public PercentageCouponDecorator(Product product, int percentage) {
        super(product, percentage);
    }

    @Override
    public double getPrice() {
        double price = this.product.getPrice();
        double priceAfterDiscount = price - (price * discountPercentage) / 100;
        System.out.println("Applying percentage coupon of " + discountPercentage + "% on " + product.getName() + ", original price : " + price + ", price after discount : " + priceAfterDiscount);
        return priceAfterDiscount;
    }
}
