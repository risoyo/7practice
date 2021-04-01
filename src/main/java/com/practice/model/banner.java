package com.practice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class banner {
    private long id;
    private String name;
    private String description;
    private String img;
    private String title;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
