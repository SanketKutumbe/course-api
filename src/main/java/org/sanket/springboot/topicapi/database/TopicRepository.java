package org.sanket.springboot.topicapi.database;

import org.sanket.springboot.topicapi.dao.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
}
