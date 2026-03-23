package com.example.blood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // This is vital so your HTML files can connect
public class BloodController {

    @Autowired
    private BloodRepository repository;

    @GetMapping("/requests")
    public List<BloodRequest> getAllRequests() {
        return repository.findAll();
    }

    @PostMapping("/request")
    public BloodRequest createRequest(@RequestBody BloodRequest request) {
        return repository.save(request);
    }
    @PutMapping("/request/accept/{id}")
    public BloodRequest acceptRequest(@PathVariable Long id, @RequestParam String donorName) {
        BloodRequest request = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Request not found"));

        request.setStatus("ACCEPTED");
        request.setAcceptedBy(donorName);
        return repository.save(request); // This updates the existing row in MySQL
    }

}