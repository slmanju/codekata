package com.slmanju.globalcounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Service
public class CounterService {

  @Autowired
  private MongoTemplate mongoTemplate;

  public long findNext() {
    Query query = query(where("_id").is("url_shortner"));
    Update update = new Update().inc("sequence", 1);
    Counter counter = mongoTemplate.findAndModify(query, update, Counter.class);
    assert counter != null;
    return counter.getSequence();
  }

}
