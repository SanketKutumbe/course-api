package org.sanket.springboot.courseapi.database;

import org.sanket.springboot.courseapi.dao.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface TopicRepository extends CrudRepository<Topic, String> {
}
