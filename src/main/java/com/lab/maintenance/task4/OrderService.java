package com.lab.maintenance.task4;

public class OrderService {

    private final VipDiscount vipDiscount;

    // Injected, so tests can pass a stub instead of a real DB-backed discount
    public OrderService(VipDiscount vipDiscount) {
        this.vipDiscount = vipDiscount;
    }

    public double calculateTotal(double subtotal, boolean isVip) {
        double discount = isVip ? vipDiscount.discountFor(subtotal) : 0.0;
        return subtotal - discount;
    }
}