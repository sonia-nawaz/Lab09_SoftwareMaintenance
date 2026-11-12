package com.lab.maintenance.task4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderServiceTest {

    @Test
    void calculateTotal_appliesVipDiscount_withoutTouchingDatabase() {
        // Arrange: stub VipDiscount gives a flat 20.0 off, no database involved
        VipDiscount stubDiscount = subtotal -> 20.0;
        OrderService service = new OrderService(stubDiscount);

        // Act
        double total = service.calculateTotal(100.0, true);

        // Assert
        assertEquals(80.0, total);
    }
}