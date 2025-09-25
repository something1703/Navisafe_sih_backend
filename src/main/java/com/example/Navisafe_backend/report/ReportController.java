package com.example.Navisafe_backend.report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/reports")
@CrossOrigin(origins = "http://localhost:3000")
public class ReportController {
    @Autowired
    private ReportService service;
    @PostMapping("/create")
    public Report submitReport(@RequestBody Report report) {
        return service.submitReport(report);
    }
    @GetMapping("/tourist/{touristId}")
    public List<Report> getByTourist(@PathVariable String touristId) {
        return service.getByTourist(touristId);
    }
    @GetMapping("/authority/{authorityId}")
    public List<Report> getByAuthority(@PathVariable String authorityId) {
        return service.getByAuthority(authorityId);
    }
    @PutMapping("/{id}/status")
    public Report updateStatus(@PathVariable String id, @RequestParam String status) {
        return service.updateStatus(id, status);
    }
    @GetMapping
    public List<Report> getAllReports() {
        return service.getAllReports();
    }
    @PutMapping("/{id}/assign/{authorityId}")
    public Report assignAuthority(@PathVariable String id, @PathVariable String authorityId) {
        return service.assignAuthority(id, authorityId);
    }
}