package com.insiap.webapp.dao;

import com.insiap.webapp.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by Gavin.Gao on 2017/2/22.
 */
public interface PersonMongoRepository extends MongoRepository<Person,String> {
    Person findByName(String Name);

    @Query("{'age':?0}")
    List<Person> withQueryFindByAge(Integer age);
}
