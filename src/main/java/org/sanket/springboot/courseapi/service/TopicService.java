package org.sanket.springboot.courseapi.service;

import org.sanket.springboot.courseapi.dao.Topic;
import org.sanket.springboot.courseapi.database.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;
    private List<Topic> list = new ArrayList<>(Arrays.asList(
            new Topic("1", "Java", "Computer programming language"),
            new Topic("2", "Javascript", "Computer scripting language"),
            new Topic("1", "HTML", "Computer markup language")
    ));

    public List<Topic> getAllTopics(){

        List<Topic> result = new ArrayList<>();
        topicRepository.findAll().forEach(result::add);
        return result;
    }

    public Topic getTopic(String id){
        return list.stream().filter( t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic t){

        topicRepository.save(t);
    }

    public void deleteTopic(String id){

        topicRepository.deleteById(id);
    }

    public void updateTopic(Topic t, String id){

        topicRepository.save(t);
    }
}
