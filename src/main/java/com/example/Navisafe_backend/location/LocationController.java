package com.example.Navisafe_backend.location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/locations")
@CrossOrigin(origins = "http://localhost:3000")
public class LocationController {
    @Autowired
    private LocationService service;
    @PostMapping("/update")
    public Location updateLocation(@RequestBody Location location) {
        return service.save(location);
    }
    @GetMapping("/tourist/{touristId}")
    public List<Location> getLocations(@PathVariable String touristId) {
        return service.getByTourist(touristId);}
}
