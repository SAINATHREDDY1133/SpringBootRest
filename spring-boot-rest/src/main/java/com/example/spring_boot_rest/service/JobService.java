package com.example.spring_boot_rest.service;

import com.example.spring_boot_rest.model.JobPost;
import com.example.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class JobService {

    @Autowired
    JobRepo repo;
    public List<JobPost> getAllJobs()
    {
        return repo.getJobs();
    }

    public JobPost getJob(int i) {
        return repo.getJob(i);
    }

    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);
    }

    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteJob(postId);
    }
}
