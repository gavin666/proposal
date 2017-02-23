package com.insiap.webapp.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * Created by Gavin.Gao on 2017/2/22.
 */
@Document
public class MongoPerson {
    @Id
    private String id;
    private String name;
    private Integer age;
    @Field("locs")
    private Collection<Location> Locations = new LinkedHashSet<Location>();
    public MongoPerson(String name, Integer age){
        super();
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Collection<Location> getLocations() {
        return Locations;
    }

    public void setLocations(Collection<Location> locations) {
        Locations = locations;
    }
}
