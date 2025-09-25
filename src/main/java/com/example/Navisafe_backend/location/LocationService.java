package com.example.Navisafe_backend.location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class LocationService {
    @Autowired
    private LocationRepository repository;
    public Location save(Location location) {
        return repository.save(location);
    }
    public List<Location> getByTourist(String touristId) {
        return repository.findByTouristId(touristId);
    }}
