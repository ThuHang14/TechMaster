package com.example.test32.service;

import com.example.test32.dto.CourseDto;
import com.example.test32.entity.Course;
import com.example.test32.entity.Topic;
import com.example.test32.repository.CourseRepository;
import com.example.test32.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private TopicRepository topicRepository;


    public List<CourseDto> getAllCourse() {
        return courseRepository.getAllCourseDto();
    }

//    public List<CourseDto> getAllCourseOnline() {
//        return courseRepository.getAllCourseDto("online");
//    }

    public List<Course> getAllCourseOnline() {
        return courseRepository.getCoursesByType("online");
    }


    public List<Course> getAllCourseOnlab() {
        return courseRepository.getCoursesByType("onlab");
    }

    public Course findCourseById(Long id) {
        return courseRepository.getCourseById(id);
    }

    public List<Course> getAllCourseOnlab(String name, String topic) {
        if (!name.equals("")) {
            return getAllCourseOnlab()
                    .stream()
                    .filter(course -> course.getName().toLowerCase().contains(name.toLowerCase()))
                    .collect(Collectors.toList());

        } else if (!topic.equals("")) {
            Topic topic1 = topicRepository.getTopicByName(topic);
            return getAllCourseOnlab().stream().filter(course -> course.getTopics().contains(topic1)).collect(Collectors.toList());
        } else {
            return getAllCourseOnlab();
        }
    }

    public List<Course> getAllCourseOnline(String name, String topic) {
        if (!name.equals("")) {
            return getAllCourseOnline()
                    .stream()
                    .filter(course -> course.getName().toLowerCase().contains(name.toLowerCase()))
                    .collect(Collectors.toList());

        } else if (!topic.equals("")) {
            Topic topic1 = topicRepository.getTopicByName(topic);
            return getAllCourseOnline().stream().filter(course -> course.getTopics().contains(topic1)).collect(Collectors.toList());
        } else {
            return getAllCourseOnline();
        }
    }

    public List<Course> getAllCourse(String name, String topic) {
        if (!name.equals("")) {
            return courseRepository.getCoursesByNameContainingIgnoreCase(name);
        } else if (!topic.equals("")) {
            return courseRepository.getByTopics_Name(topic);
        } else {
            return courseRepository.findAll();
        }
    }
}
