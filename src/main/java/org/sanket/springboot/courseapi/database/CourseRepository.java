package org.sanket.springboot.courseapi.database;

import org.sanket.springboot.courseapi.dao.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    List<Course> findByTopicId(String topicId);
}
