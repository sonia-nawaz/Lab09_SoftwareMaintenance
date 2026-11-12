package com.lab.maintenance.task1;

public class PdfFormatter implements ReportFormatter {
    @Override
    public String format(String content) {
        return "Writing PDF: " + content;
    }
}