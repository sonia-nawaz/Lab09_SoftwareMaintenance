package com.lab.maintenance.task1;

import java.util.List;

public class Lab09_SoftwareMaintenance {
    public static void main(String[] args) {
        // Fake notifier (lambda) just prints, so no real email is needed
        Notifier consoleNotifier = (to, msg) ->
                System.out.println("Email sent to " + to + ": " + msg);

        ReportManager manager = new ReportManager(consoleNotifier);
        List<String> data = List.of("Alice", "Bob", "Charlie");

        manager.generate("PDF", data, true);
        manager.generate("CSV", data, false);
    }
}