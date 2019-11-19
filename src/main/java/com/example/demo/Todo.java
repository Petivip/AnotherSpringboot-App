package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private long id;

    @NotNull
    @Size(min=2)
     private String name;
    @NotNull
    @Size(min=3)
     private String dutDate;
    @NotNull
    @Min(2)
     private int priority;

    public Todo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDutDate() {
        return dutDate;
    }

    public void setDutDate(String dutDate) {
        this.dutDate = dutDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
