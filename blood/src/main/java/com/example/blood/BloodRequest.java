package com.example.blood;

import jakarta.persistence.*;

@Entity
@Table(name = "blood_requests")
public class BloodRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "blood_group")
    private String bloodGroup;

    private String status = "OPEN";
    private String accepted_by;

    // --- ADD THESE NOW ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getBloodGroup() { return bloodGroup; }
    public void setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getAcceptedBy() { return accepted_by; }
    public void setAcceptedBy(String accepted_by) { this.accepted_by = accepted_by; }
}