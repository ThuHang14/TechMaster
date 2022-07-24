package com.example.demo.Controller;

import com.techmaster.demo.dto.JobRequest;
import com.techmaster.demo.model.JOB;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/job")
public class helloJob {

  private ConcurrentHashMap<String, JOB> job;
  String uuid = UUID.randomUUID().toString();

  public helloJob() {
    job = new ConcurrentHashMap<>();
    job.put(
      uuid,
      new JOB(
        "1",
        "Nhân Viên Kiểm Tra Đơn Hàng",
        "Nhận đơn hàng qua mail, theo dõi kiểm tra đơn hàng , tính định mức nguyên phụ liệu Theo dõi đôn đốc tiến độ sản xuất",
        "HaiPhong",
        2000000,
        5000000,
        "abc@gmail.com"
      )
    );
    job.put(
      uuid,
      new JOB(
        "2",
        "Nhân Viên Kiểm Tra Đơn Hàng",
        "Nhận đơn hàng qua mail, theo dõi kiểm tra đơn hàng , tính định mức nguyên phụ liệu Theo dõi đôn đốc tiến độ sản xuất",
        "DaNang",
        2000000,
        6000000,
        "abc@gmail.com"
      )
    );
    job.put(
      uuid,
      new JOB(
        "3",
        "Nhân Viên Sale",
        "Nhận đơn hàng, Tư vấn sản phẩm thực phẩm cho khách hàng trên website",
        "HoChiMinh",
        5000000,
        10000000,
        "abc@gmail.com"
      )
    );
    job.put(
      uuid,
      new JOB(
        "4",
        "Thủ Kho",
        "Thực hiện giao nhận, kiểm đếm, bảo quản vật tư thiết bị theo đúng chủng loại, số lượng, chất lượng.",
        "HaNoi",
        10000000,
        15000000,
        "abc@gmail.com"
      )
    );
    job.put(
      uuid,
      new JOB(
        "5",
        "Nhân Viên Tư Vấn",
        "Tư vấn, thiết kế các giải pháp bảo hiểm tối ưu theo nhu cầu của khách hàng.",
        "HaiPhong",
        8000000,
        12000000,
        "abc@gmail.com"
      )
    );
    job.put(
      uuid,
      new JOB(
        "6",
        "Nhân Viên Kỹ Thuật",
        "Thực hiện lắp đặt, bảo hành, bảo trì thiết bị giám sát hành trình ",
        "HoChiMinh",
        20000000,
        30000000,
        "abc@gmail.com"
      )
    );
  }

  @GetMapping
  public List<JOB> getJob() {
    return job.values().stream().toList();
  }

  @PostMapping
  public JOB createJob(@RequestBody JobRequest job1) {
    job = new ConcurrentHashMap<>();
    JOB newJobs = new JOB(
      uuid,
      job1.title(),
      job1.description(),
      job1.location(),
      job1.min_salary(),
      job1.max_salary(),
      job1.email_to()
    );
    job.put(uuid, newJobs);
    return newJobs;
  }

  @PutMapping(value = "/{id}")
  public JOB updateById(
    @PathVariable("id") String id,
    @RequestBody JobRequest jobRequest
  ) {
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
  public JOB delateById(@PathVariable("id") String id) {
    JOB removeJob = job.remove(id);
    return removeJob;
  }
}
