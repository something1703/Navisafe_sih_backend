package com.example.Navisafe_backend.tourist;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tourists")
@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
public class TouristController {

    private final TouristService touristService;

    @PostMapping("/register")
    public Tourist register(@RequestBody Tourist tourist) {
        return touristService.registerTourist(tourist);
    }

    @GetMapping("/{id}")
    public Tourist getTourist(@PathVariable String id) {
        return touristService.getTouristById(id)
                .orElseThrow(() -> new RuntimeException("Tourist not found"));
    }

    @GetMapping("/all")
    public List<Tourist> getAll() {
        return touristService.getAllTourists();
    }

    @PutMapping("/{id}")
    public Tourist updateTourist(@PathVariable String id, @RequestBody Tourist tourist) {
        return touristService.updateTourist(id, tourist);
    }

    @DeleteMapping("/{id}")
    public void deleteTourist(@PathVariable String id) {
        touristService.deleteTourist(id);
    }
}