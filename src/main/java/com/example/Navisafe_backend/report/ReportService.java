package com.example.Navisafe_backend.report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ReportService {
    @Autowired
    private ReportRepository repository;
    public Report submitReport(Report report) {
        return repository.save(report);
    }
    public List<Report> getByTourist(String touristId) {
        return repository.findByTouristId(touristId);
    }
    public List<Report> getByAuthority(String authorityId) {
        return repository.findByAssignedAuthorityId(authorityId);
    }
    public Report updateStatus(String reportId, String status) {
        Report report = repository.findById(reportId).orElseThrow();
        report.setStatus(status);
        return repository.save(report);
    }
    public Report assignAuthority(String reportId, String authorityId) {
        Report report = repository.findById(reportId).orElseThrow();
        report.setAssignedAuthorityId(authorityId);
        return repository.save(report);
    }

    public List<Report> getAllReports() {
        return repository.findAll();
    }
}