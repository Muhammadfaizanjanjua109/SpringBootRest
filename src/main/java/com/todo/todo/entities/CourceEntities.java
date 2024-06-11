package com.todo.todo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.EntityGraph;

@Entity
public class CourceEntities {
    public CourceEntities() {
    }
    public CourceEntities(String name, int id, String description) {
        this.name = name;
        this.id = id;
        this.description = description;
    }

    private String name;
    @Id
    private  int id;
    private  String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CourceEntities{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
