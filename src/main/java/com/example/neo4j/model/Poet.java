package com.example.neo4j.model;

import org.springframework.data.neo4j.core.schema.*;

import java.util.List;
@Node("Poet")
public class Poet {
    @Id @GeneratedValue
    private Long id;
    @Property("name")
    private String name;
    @Property("birthYear")
    private Integer birthYear;
    @Property("deathYear")
    private Integer deathYear;
    @Property("bio")
    private String bio;
    @Property("worksCount")
    private String worksCount;
    @Property("influence")
    private String influence;

    @Relationship(type = "创作", direction = Relationship.Direction.OUTGOING)
    private List<Poem> poems;

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

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(Integer deathYear) {
        this.deathYear = deathYear;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getWorksCount() {
        return worksCount;
    }

    public void setWorksCount(String worksCount) {
        this.worksCount = worksCount;
    }

    public String getInfluence() {
        return influence;
    }

    public void setInfluence(String influence) {
        this.influence = influence;
    }

    public List<Poem> getPoems() {
        return poems;
    }

    public void setPoems(List<Poem> poems) {
        this.poems = poems;
    }

// 其他属性和getter/setter省略
}
