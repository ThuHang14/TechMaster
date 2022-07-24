package com.example.test32;

import com.example.test32.entity.Topic;
import com.example.test32.repository.TopicRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Test32ApplicationTests {


    @Autowired
    private TopicRepository topicRepository;

    @Test
    void getTopicByName() {
        Topic topic = topicRepository.getTopicByName("lavender");
        System.out.println(topic);
    }

}
