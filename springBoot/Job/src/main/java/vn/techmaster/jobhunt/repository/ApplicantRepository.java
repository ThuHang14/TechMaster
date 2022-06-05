package vn.techmaster.jobhunt.repository;

import org.springframework.stereotype.Repository;
import vn.techmaster.jobhunt.model.Applicant;
import vn.techmaster.jobhunt.model.Skill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Repository
public class ApplicantRepository {
    private ArrayList<Applicant> applicant;
    private List<Skill> skill = new ArrayList<>();


    public ApplicantRepository(){
        skill.addAll(List.of(Skill.values()));

        applicant = new ArrayList<>(List.of(
                new Applicant("1","id job","name","email","phone", Collections.singletonList(skill.get(new Random().nextInt(skill.size())))),
                new Applicant("1","id job","name","email","phone", Collections.singletonList(skill.get(new Random().nextInt(skill.size())))),
                new Applicant("1","id job","name","email","phone", Collections.singletonList(skill.get(new Random().nextInt(skill.size())))),
                new Applicant("1","id job","name","email","phone", Collections.singletonList(skill.get(new Random().nextInt(skill.size())))) ));
    }

    public List<Applicant> applicantList(){
        return applicant;
    }
}
