package com.example.Navisafe_backend.authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class AuthorityService {
    @Autowired
    private AuthorityRepository repository;
    public Authority getById(String id) {
        return repository.findById(id).orElse(null);
    }
    public List<Authority> getAll() {
        return repository.findAll();
    }
    public Authority update(String id, Authority authority) {
        Authority existing = repository.findById(id).orElseThrow();
        existing.setName(authority.getName());
        existing.setDepartment(authority.getDepartment());
        existing.setRole(authority.getRole());
        existing.setBadgeNumber(authority.getBadgeNumber());
        existing.setEmail(authority.getEmail());
        existing.setIsActive(authority.getIsActive());
        return repository.save(existing);
    }
}
