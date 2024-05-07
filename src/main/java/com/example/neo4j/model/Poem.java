package com.example.neo4j.model;

import org.springframework.data.neo4j.core.schema.*;

import java.util.List;
public class Poem {
    @Id @GeneratedValue
    private Long id;
    @Property("title")
    private String title;
    @Property("content")
    private String content;
    @Property("year")
    private Integer year;
    @Property("theme")
    private String theme;
    @Property("background")
    private String background;
    @Relationship(type = "相关", direction = Relationship.Direction.OUTGOING)
    private List<Location> relatedLocations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public List<Location> getRelatedLocations() {
        return relatedLocations;
    }

    public void setRelatedLocations(List<Location> relatedLocations) {
        this.relatedLocations = relatedLocations;
    }
}
