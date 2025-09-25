package com.example.Navisafe_backend.emergency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
@Service
public class EmergencyService {
    @Autowired
    private EmergencyRepository repository;
    public Emergency triggerEmergency(Emergency emergency) {
        emergency.setStatus("active");
        emergency.setTimestamp(new Date());
        return repository.save(emergency);
    }
    public List<Emergency> getByTourist(String touristId) {
        return repository.findByTouristId(touristId);
    }
    public List<Emergency> getActiveEmergencies() {
        return repository.findByStatus("active");
    }
    public Emergency assignAuthority(String emergencyId, String authorityId) {
        Emergency e = repository.findById(emergencyId).orElseThrow();
        e.setAssignedAuthorityId(authorityId);
        e.setStatus("responding");
        return repository.save(e);
    }
    public Emergency resolveEmergency(String emergencyId) {
        Emergency e = repository.findById(emergencyId).orElseThrow();
        e.setStatus("resolved");
        e.setResolvedAt(new Date());
        return repository.save(e);
    }

    public List<Emergency> getAllEmergencies() {
        return repository.findAll();
    }
}
