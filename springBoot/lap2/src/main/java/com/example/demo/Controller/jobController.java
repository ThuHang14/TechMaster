package com.example.demo.Controller;

import com.example.demo.Model.JOB;
import com.example.demo.dto.JobRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/job")
public class jobController {

    private ConcurrentHashMap<String, JOB> job;

    public jobController() {
        job = new ConcurrentHashMap<>();
        job.put("1", new JOB("1", "Nhân Viên Kiểm Tra Đơn Hàng",
                "Nhận đơn hàng qua mail, theo dõi kiểm tra đơn hàng , tính định mức nguyên phụ liệu Theo dõi đôn đốc tiến độ sản xuất",
                "HaiPhong", 2000000, 5000000, "abc@gmail.com"));
        job.put("2", new JOB("2", "Nhân Viên Kiểm Tra Đơn Hàng",
                "Nhận đơn hàng qua mail, theo dõi kiểm tra đơn hàng , tính định mức nguyên phụ liệu Theo dõi đôn đốc tiến độ sản xuất",
                "DaNang", 2000000, 6000000, "abc@gmail.com"));
        job.put("3", new JOB("3", "Nhân Viên Sale",
                "Nhận đơn hàng, Tư vấn sản phẩm thực phẩm cho khách hàng trên website",
                "HoChiMinh", 5000000, 10000000, "abc@gmail.com"));
        job.put("4", new JOB("4", "Thủ Kho",
                "Thực hiện giao nhận, kiểm đếm, bảo quản vật tư thiết bị theo đúng chủng loại, số lượng, chất lượng.",
                "HaNoi", 10000000, 15000000, "abc@gmail.com"));
        job.put("6", new JOB("6", "Nhân Viên Tư Vấn",
                "Tư vấn, thiết kế các giải pháp bảo hiểm tối ưu theo nhu cầu của khách hàng.",
                "HaiPhong", 8000000, 12000000, "abc@gmail.com"));
        job.put("5", new JOB("5", "Nhân Viên Kỹ Thuật",
                "Thực hiện lắp đặt, bảo hành, bảo trì thiết bị giám sát hành trình ",
                "HoChiMinh", 20000000, 30000000, "abc@gmail.com"));
    }

    @GetMapping
    public List<JOB> getJob() {
        return job.values().stream().toList();
    }

    @PostMapping
    public JOB createJob(@RequestBody JobRequest job1) {
        String uui = UUID.randomUUID().toString();
        JOB newJobs = new JOB(
                uui,
                job1.title(),
                job1.description(),
                job1.location(),
                job1.min_salary(),
                job1.max_salary(),
                job1.email_to()
        );
        job.put(uui, newJobs);
        return newJobs;
    }


    @PutMapping(value = "/{id}")
    public JOB updateById(
            @PathVariable("id") String id,
            @RequestBody JobRequest jobRequest) {
        JOB jobUpdate = new JOB(
                id,
                jobRequest.title(),
                jobRequest.description(),
                jobRequest.location(),
                jobRequest.min_salary(),
                jobRequest.max_salary(),
                jobRequest.email_to()
        );
        job.replace(id, jobUpdate);
        return jobUpdate;
    }

    @DeleteMapping(value = "/{id}")
    public JOB deleteById(@PathVariable("id") String id) {
        return job.remove(id);
    }


    @GetMapping("/sortbylocation")
    public List<JOB> sortLocation() {
        return job.values().stream()
                .sorted(((o1, o2) -> o2.getLocation().compareTo(o1.getLocation()))).toList();
    }


    @GetMapping("/salary/{salary}")
    public List<JOB> salary(@PathVariable("salary") int salary) {
        return job.values()
                .stream()
                .filter(job1 -> job1.getMin_salary() <= salary && salary <= job1.getMax_salary()).toList();
    }

    @GetMapping("/keyword/{keyword}")
    public List<JOB> key(@PathVariable("keyword") String keyword) {
        return job.values()
                .stream()
                .filter(job1 -> job1.getDescription().toLowerCase().contains(keyword.toLowerCase()) || job1.getTitle().toLowerCase().contains(keyword.toLowerCase())).toList();
    }

    @GetMapping("/query")
    public List<JOB> key(@RequestParam("location") String location, @RequestParam("keyword") String keyword) {

        return job.values()
                .stream()
                .filter(job1 -> job1.getLocation().equalsIgnoreCase(location))
                .filter(job1 -> job1.getDescription().toLowerCase().contains(keyword.toLowerCase()) || job1.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
    }
}
