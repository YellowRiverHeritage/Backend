package com.example.neo4j.model;


import org.springframework.data.neo4j.core.schema.*;

import java.util.List;
@Node("Location")
public class Location {
    @Id @GeneratedValue
    private Long id;
    @Property("name")
    private String name;
    @Property("description")
    private String description;
    @Property("importance")
    private String importance;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

}
