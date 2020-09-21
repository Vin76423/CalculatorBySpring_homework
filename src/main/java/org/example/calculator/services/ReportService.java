package org.example.calculator.services;

import org.example.calculator.dao.ReportDao;
import org.example.calculator.entity.ReportLine;
import org.example.calculator.entity.operations.CalcOperation;

public class ReportService {
    private ReportDao reportDao;

    public ReportService(ReportDao reportDao) {
        this.reportDao = reportDao;
    }

    public void addLine(double value1, double value2, CalcOperation operation, double result) {
        ReportLine line = new ReportLine(value1, value2, operation, result);
        reportDao.createLine(line);
    }

    public void show() {
        for (ReportLine line : reportDao.getReportList()) {
            System.out.println(line);
        }
    }
}

