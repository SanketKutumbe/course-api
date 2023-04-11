package org.sanket.springboot.courseapi.service;

import org.sanket.springboot.courseapi.dao.Course;
import org.sanket.springboot.courseapi.database.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId){

        List<Course> result = new ArrayList<>();
        result.addAll(courseRepository.findByTopicId(topicId));
        return result;
    }

    public Course getCourse(String id){
        return courseRepository.findById(id).get();
    }

    public void addCourse(Course t){
        courseRepository.save(t);
    }

    public void deleteCourse(String id){
        courseRepository.deleteById(id);
    }

    public void updateCourse(Course t){
        courseRepository.save(t);
    }
}
