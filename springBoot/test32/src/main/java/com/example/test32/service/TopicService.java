package com.example.test32.service;

import com.example.test32.entity.Topic;
import com.example.test32.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {


    @Autowired
    private TopicRepository topicRepository;

   public List<Topic> getAllTopics(){
        return topicRepository.findAll();
    }
}
