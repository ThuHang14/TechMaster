package com.example.test32;

import com.example.test32.entity.Course;
import com.example.test32.entity.Image;
import com.example.test32.entity.Topic;
import com.example.test32.entity.User;
import com.example.test32.repository.CourseRepository;
import com.example.test32.repository.ImageRepository;
import com.example.test32.repository.TopicRepository;
import com.example.test32.repository.UserRepository;
import com.github.javafaker.Faker;
import com.github.slugify.Slugify;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

@SpringBootTest
public class initData {


    @Autowired
    private TopicRepository topicRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private Faker faker;
    @Autowired
    private Random random;
    @Autowired
    private Slugify slugify;


    @Test
    void dataImage() {
        for (int i = 0; i < 20; i++) {
            Image image = Image.builder()
                    .link(faker.internet().image())
                    .build();

            imageRepository.save(image);
        }
    }

    @Test
    void dataUser() {
        for (int i = 0; i < 3; i++) {
            User user = User.builder()
                    .name(faker.name().fullName())
                    .email(faker.internet().emailAddress())
                    .phone(faker.number().digits(10))
                    .avatar(faker.internet().url())
                    .build();

            userRepository.save(user);
        }
    }

    @Test
    void dataTopic() {
        for (int i = 0; i < 5; i++) {
            Topic topic = Topic.builder()
                    .name(faker.color().name())
                    .build();

            topicRepository.save(topic);
        }
    }


    @Test
    void dataCourse() {
        List<User> userList = userRepository.findAll();
        List<Topic> topicList = topicRepository.findAll();

        for (int i = 0; i < 20; i++) {
            User userRd = userList.get(random.nextInt(userList.size()));
            String name = faker.leagueOfLegends().rank();

            Set<Topic> topicsRd = new HashSet<>();

            for (int j = 0; j < 5; j++) {
                Topic topic = topicList.get(random.nextInt(topicList.size()));
                topicsRd.add(topic);
            }

            Course course = Course.builder()
                    .name(name)
                    .slug(slugify.slugify(name))
                    .type(random.nextInt(2)==0 ? "online" : "onlab")
                    .description(faker.lorem().sentence())
                    .thumbnail(faker.company().logo())
                    .user(userRd)
                    .topics(topicsRd)
                    .build();

            courseRepository.save(course);
        }

    }
}
