package com.tracker.jobtracker.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/jobs")
@CrossOrigin(origins = "http://localhost:3000")
public class JobController {

    private final List<String> jobs = new ArrayList<>();

    @GetMapping
    public List<String> getAllJobs() {
        return jobs;
    }

    @PostMapping
    public String addJob(@RequestBody String jobDetails) {
        jobs.add(jobDetails);
        return "Job application saved successfully!";
    }

    @PostMapping("/parse-ai")
    public String parseJobDescriptionWithGroq(@RequestBody String description) {
        // Mock integration call for Groq AI API skill extraction
        return "Extracted Skills: [Java, Spring Boot, React, PostgreSQL]";
    }
}
