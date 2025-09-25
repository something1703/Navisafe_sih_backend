package com.example.Navisafe_backend.tourist;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TouristService {

    private final TouristRepository touristRepository;

    public Tourist registerTourist(Tourist tourist) {
        return touristRepository.save(tourist);
    }

    public Optional<Tourist> getTouristById(String id) {
        return touristRepository.findById(id);
    }

    public List<Tourist> getAllTourists() {
        return touristRepository.findAll();
    }

    public Tourist updateTourist(String id, Tourist updatedTourist) {
        return touristRepository.findById(id)
                .map(existing -> {
                    existing.setFullName(updatedTourist.getFullName());
                    existing.setGender(updatedTourist.getGender());
                    existing.setAge(updatedTourist.getAge());
                    existing.setCountryOfOrigin(updatedTourist.getCountryOfOrigin());
                    existing.setPassportOrAadharNumber(updatedTourist.getPassportOrAadharNumber());
                    existing.setPhoneNumber(updatedTourist.getPhoneNumber());
                    existing.setEmail(updatedTourist.getEmail());
                    return touristRepository.save(existing);
                })
                .orElseThrow(() -> new RuntimeException("Tourist not found"));
    }

    public void deleteTourist(String id) {
        touristRepository.deleteById(id);
    }
}
