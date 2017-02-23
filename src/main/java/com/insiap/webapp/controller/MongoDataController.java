package com.insiap.webapp.controller;

import com.insiap.webapp.dao.PersonMongoRepository;
import com.insiap.webapp.domain.Location;
import com.insiap.webapp.domain.MongoPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Created by Gavin.Gao on 2017/2/22.
 */
@RestController
public class MongoDataController {
    @Autowired
    PersonMongoRepository personMongoRepository;

    @RequestMapping("/save")
    public MongoPerson save(){
        MongoPerson person = new MongoPerson("test",33);
        Collection<Location> locations = new LinkedHashSet<Location>();
        Location loc1 = new Location("上海","1");
        locations.add(loc1);
        Location loc2 = new Location("北京","2");
        locations.add(loc2);
        Location loc3 = new Location("即墨","3");
        locations.add(loc3);
        person.setLocations(locations);
        return personMongoRepository.save(person);
    }

    @RequestMapping("/q1")
    public MongoPerson q1(String name){
        return personMongoRepository.findByName(name);
    }

    @RequestMapping("/q2")
    public List<MongoPerson> q2(Integer age){
        return personMongoRepository.withQueryFindByAge(age);
    }
}
