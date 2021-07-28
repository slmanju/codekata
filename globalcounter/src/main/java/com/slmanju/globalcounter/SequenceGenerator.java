package com.slmanju.globalcounter;

import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Component @AllArgsConstructor
public class SequenceGenerator {

  private final MongoTemplate mongoTemplate;

  public long findNext() {
    Query query = query(where("_id").is("url_shortner"));
    Update update = new Update().inc("sequence", 1);
    Counter counter = mongoTemplate.findAndModify(query, update, options().returnNew(true), Counter.class);
    return counter.getSequence();
  }

}
