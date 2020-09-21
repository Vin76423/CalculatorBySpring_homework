package org.example.calculator.dao;

import org.example.calculator.entity.ReportLine;
import java.util.ArrayList;
import java.util.List;

public class ReportInMemoryDao implements ReportDao {
    private final List<ReportLine> REPORT = new ArrayList<>();

    @Override
    public void createLine(ReportLine line) {
        REPORT.add(line);
    }

    @Override
    public List<ReportLine> getReportList() {
        return REPORT;
    }
}
