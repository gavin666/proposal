package com.insiap.webapp.dao;

import com.insiap.webapp.domain.MongoPerson;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by Gavin.Gao on 2017/2/22.
 */
public interface PersonMongoRepository extends MongoRepository<MongoPerson,String> {
    MongoPerson findByName(String Name);

    @Query("{'age':?0}")
    List<MongoPerson> withQueryFindByAge(Integer age);
}
