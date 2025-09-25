package com.example.Navisafe_backend.authority;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/authority")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthorityController {
    @Autowired
    private AuthorityService service;
    @GetMapping("/{id}")
    public Authority getById(@PathVariable String id) {
        return service.getById(id);}
    @GetMapping("/all")
    public List<Authority> getAll() {
        return service.getAll();}
    @PutMapping("/{id}")
    public Authority update(@PathVariable String id, @RequestBody Authority authority) {
        return service.update(id, authority);
    }}
