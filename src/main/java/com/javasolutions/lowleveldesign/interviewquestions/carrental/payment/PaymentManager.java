package com.javasolutions.lowleveldesign.interviewquestions.carrental.payment;

import com.javasolutions.lowleveldesign.interviewquestions.carrental.Bill.Bill;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;


public class PaymentManager {

    private PaymentStrategy paymentStrategy;
    private final Map<Integer, Payment> payments = new ConcurrentHashMap<>();

    public PaymentManager(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public Payment makePayment(Bill bill, double paymentAmount) {

        Payment payment = paymentStrategy.processPayment(bill, paymentAmount);
        payments.put(payment.getPaymentId(), payment);
        return payment;
    }

    public List<Payment> getPaymentsForBill(int billId) {
        return payments.values().stream()
                .filter(p -> p.getBillId() == billId)
                .toList();
    }

    public Optional<Payment> getPayment(int paymentId) {
        return Optional.ofNullable(payments.get(paymentId));
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
