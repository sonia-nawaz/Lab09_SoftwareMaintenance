package com.lab.maintenance.task2;

import com.lab.maintenance.task2.BankTransfer;
import java.math.BigDecimal;

public class BankTransferMain {
    public static void main(String[] args) {
        // Valid transfer works fine
        BankTransfer ok = new BankTransfer("ACC-001", "ACC-002", new BigDecimal("500.00"));
        System.out.println("Valid transfer created: " + ok);

        // Test 1: null account
        try {
            new BankTransfer(null, "ACC-002", new BigDecimal("100"));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        // Test 2: negative amount
        try {
            new BankTransfer("ACC-001", "ACC-002", new BigDecimal("-50"));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}