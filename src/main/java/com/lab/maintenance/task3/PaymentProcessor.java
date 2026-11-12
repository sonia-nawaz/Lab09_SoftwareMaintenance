package com.lab.maintenance.task3;

public class PaymentProcessor {

    // Simulated MDC: a tiny stand-in for SLF4J's MDC.put("traceId", ...) / MDC.clear()
    private static String currentTraceId;

    private static void putTraceId(String txId) {
        currentTraceId = txId;
    }

    private static void clearTraceId() {
        currentTraceId = null;
    }

    public void charge(String txId, double amount) {
        putTraceId(txId);  // inject trace context
        try {
            System.out.println("[TraceID: " + currentTraceId + "] Processing payment...");
            System.out.println("[TraceID: " + currentTraceId + "] Charging amount: " + amount);

            if (amount <= 0) {
                throw new IllegalArgumentException("Invalid amount: " + amount);
            }

            System.out.println("[TraceID: " + currentTraceId + "] Payment successful.");
        } finally {
            // Always runs, even if an exception is thrown, so context never leaks
            clearTraceId();
            System.out.println("Context Cleared (TraceID removed for txId=" + txId + ")");
        }
    }
}