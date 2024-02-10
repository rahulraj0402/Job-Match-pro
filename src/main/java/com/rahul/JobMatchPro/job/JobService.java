package com.rahul.JobMatchPro.job;

import java.util.List;

public interface JobService {
    List<Job> findAll();
    void createJob(Job job);

    Job getJobByJobId(long id);

    boolean deleteById(long id);
}
