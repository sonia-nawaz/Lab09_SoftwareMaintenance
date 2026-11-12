package com.lab.maintenance.task1;

import com.lab.maintenance.task1.ReportFormatter;
import com.lab.maintenance.task1.PdfFormatter;
import com.lab.maintenance.task1.Notifier;
import com.lab.maintenance.task1.CsvFormatter;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ReportManager {

    private final Notifier notifier;
    private final Map<String, ReportFormatter> formatters = Map.of(
            "PDF", new PdfFormatter(),
            "CSV", new CsvFormatter()
    );

    // Smell 4 fix: dependency injected via constructor
    public ReportManager(Notifier notifier) {
        this.notifier = Objects.requireNonNull(notifier, "notifier must not be null");
    }

    public void generate(String type, List<String> data, boolean sendEmail) {
        Objects.requireNonNull(type, "type must not be null");   // Smell 2 fix
        Objects.requireNonNull(data, "data must not be null");

        // Smell 1 fix: String.join instead of += in a loop
        String output = String.join(",", data);

        // Smell 3 fix: lookup replaces if/else chain
        ReportFormatter formatter = formatters.get(type.toUpperCase());
        if (formatter == null) {
            throw new IllegalArgumentException("Unsupported report type: " + type);
        }
        System.out.println(formatter.format(output));

        if (sendEmail) {
            notifier.notify("admin@company.com", output);
        }
    }
}