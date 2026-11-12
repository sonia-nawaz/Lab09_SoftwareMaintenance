package com.lab.maintenance.task1;

public class CsvFormatter implements ReportFormatter {
    @Override
    public String format(String content) {
        return "Writing CSV: " + content;
    }
}