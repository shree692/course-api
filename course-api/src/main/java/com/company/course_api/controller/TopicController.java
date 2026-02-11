package com.company.course_api.controller;

import com.company.course_api.model.Topic;
import com.company.course_api.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;
    // private TopicService topicService = new TopicService();

    // localhost:8080/
    @RequestMapping(value = "/")
    public String home() {
        return "Welcome to Course-API!";
    }

    // localhost:8080/topics
    @RequestMapping(value = "/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping(value = "/topics/{id}")
    public Topic getTopicById(@PathVariable String id) {
        return topicService.getTopicById(id);
    }

    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public void save(@RequestBody Topic topic) {
        topicService.save(topic);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
    public Topic setTopicById(@PathVariable String id, @RequestBody Topic topic) {
        return topicService.setTopicById(id, topic);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
    public void deleteTopicById(@PathVariable String id) {
        topicService.deleteTopicById(id);
    }
}