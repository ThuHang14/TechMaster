package com.example.demojpa;

import com.example.demojpa.model.Employer;
import com.example.demojpa.model.Job;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@SpringBootApplication
@Transactional
public class DemoJpaApplication implements ApplicationRunner {

    @Autowired
    private EntityManager em;

    public static void main(String[] args) {
        SpringApplication.run(DemoJpaApplication.class, args);
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Faker fake = new Faker();

        for (int i = 0; i < 100; i++) {
            var employer = Employer.builder()
                    .name(fake.name().fullName())
                    .email(fake.internet().emailAddress())
                    .website("https://" + fake.internet().domainName().toString())
                    .build();

            em.persist(employer);

        }

        for (int i = 0; i < 50; i++) {
            var job = Job.builder()
                    .title(fake.company().name())
                    .description(fake.country().name())
                    .build();

            em.persist(job);

        }

        em.flush();


    }


}
