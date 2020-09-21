package org.example.calculator.dao;

import org.example.calculator.entity.ReportLine;

import java.util.List;

public interface ReportDao {
    void createLine(ReportLine line);
    List<ReportLine> getReportList();
}
