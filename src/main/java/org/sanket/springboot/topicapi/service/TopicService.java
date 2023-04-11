package org.sanket.springboot.topicapi.service;

import org.sanket.springboot.topicapi.dao.Topic;
import org.sanket.springboot.topicapi.database.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;


    public List<Topic> getAllTopics(){

        List<Topic> result = new ArrayList<>();
        topicRepository.findAll().forEach(result::add);
        return result;
    }

    public Topic getTopic(String id){
        return topicRepository.findById(id).get();
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
