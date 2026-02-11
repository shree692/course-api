package com.company.course_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "topics")
public class Topic {
    @Id
    private String id;
    private String name;
    private String desc;

    public Topic(){}
    public Topic(String id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
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



    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getDesc() {
        return desc;
    }


}