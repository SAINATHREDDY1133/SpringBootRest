package com.example.spring_boot_rest;

import com.example.spring_boot_rest.model.JobPost;
import com.example.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@CrossOrigin(origins = "http://localhost:3000/")
public class JobRestController {
    @Autowired
    JobService service;


    @GetMapping("Posts")


    public List<JobPost> viewJobs()
    {
        return service.getAllJobs();
    }

    @GetMapping("Post/{postid}")
    //@ResponseBody
    public JobPost getJob(@PathVariable("postid") int postId)
    {
        return service.getJob(postId);
    }

    @PostMapping("Post")
    public void addJob(@RequestBody JobPost jobPost)
    {
        service.addJob(jobPost);
    }

    @PutMapping("Post")
    public void updateJob(@RequestBody JobPost jobPost)
    {
        service.updateJob(jobPost);
    }

    @DeleteMapping("Post/{postId}")
    public void deleteJob(@PathVariable int postId)
    {
        service.deleteJob(postId);
    }
}
