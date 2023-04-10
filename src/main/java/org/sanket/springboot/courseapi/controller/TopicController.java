package org.sanket.springboot.courseapi.controller;

import org.sanket.springboot.courseapi.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.web.bind.annotation.*;

import org.sanket.springboot.courseapi.dao.Topic;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method=RequestMethod.POST, value = "/topic")
    public void addTopic(@RequestBody Topic t){
        topicService.addTopic(t);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/topic/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/topic/{id}")
    public void updateTopic(@RequestBody Topic t, @PathVariable String id){
        topicService.updateTopic(t,id);
    }
}
