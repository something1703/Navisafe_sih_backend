package com.example.Navisafe_backend.emergency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/emergencies")
@CrossOrigin(origins = "http://localhost:3000")
public class EmergencyController {
    @Autowired
    private EmergencyService service;
    @PostMapping("/sos")
    public Emergency triggerEmergency(@RequestBody Emergency emergency) {
        return service.triggerEmergency(emergency);
    }
    @GetMapping("/tourist/{touristId}")
    public List<Emergency> getByTourist(@PathVariable String touristId) {
        return service.getByTourist(touristId);
    }
    @GetMapping("/active")
    public List<Emergency> getActive() {
        return service.getActiveEmergencies();
    }
    @PutMapping("/{id}/respond/{authorityId}")
    public Emergency assignAuthority(@PathVariable String id, @PathVariable String authorityId) {
        return service.assignAuthority(id, authorityId);
    }
    @GetMapping
    public List<Emergency> getAll() {
        return service.getAllEmergencies();
    }
    @PutMapping("/{id}/resolve")
    public Emergency resolve(@PathVariable String id) {
        return service.resolveEmergency(id);
    }
}