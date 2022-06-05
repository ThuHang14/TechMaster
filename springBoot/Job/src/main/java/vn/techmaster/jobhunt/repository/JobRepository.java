package vn.techmaster.jobhunt.repository;

import org.springframework.stereotype.Repository;
import vn.techmaster.jobhunt.model.City;
import vn.techmaster.jobhunt.model.Job;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class JobRepository {
    private ConcurrentHashMap<String,Job> jobs;

    public JobRepository() {
        jobs = new ConcurrentHashMap<>();
        jobs.put("job1",new Job("job1","em_1","back end","blabla",City.DaNang,LocalDateTime.now(),LocalDateTime.now()));

    }

    public List<Job> listjob(){
        return jobs.values().stream().toList();
    }

    public Job getById(String id){
        return jobs.get(id);
    }

    public void addJob(Job job) {
        jobs.put(job.getId(),job);
    }

    public void deleteJobById(String id){
        jobs.remove(id);
    }

    public void updateJob(Job job){
        jobs.put(job.getId(),job);
    }
}
