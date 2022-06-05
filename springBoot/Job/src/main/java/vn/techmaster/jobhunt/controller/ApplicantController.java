package vn.techmaster.jobhunt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.techmaster.jobhunt.repository.ApplicantRepository;

@Controller
@RequestMapping("/applicant")
public class ApplicantController {

    @Autowired
    private ApplicantRepository repo;

  @GetMapping("/list")
    public String listAppli(Model model){
      model.addAttribute("allAppli",repo.applicantList());
      return "applicant";
  }

    @GetMapping("/add")
    public String addAppli(Model model){
        return "createApplicant";
    }

}
