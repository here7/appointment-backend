package com.pckg.appointment.model;

import java.util.Date;

public class Task {

    private Integer id;
    private String name;
    private String description;
    private Date dateCreation;
    private Date dateTask;
    /**
     * Future:
     * created by user X
     */
    public Task(Integer id, String name, String description, Date dateCreation, Date dateTask) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dateCreation = dateCreation;
        this.dateTask = dateTask;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateTask() {
        return dateTask;
    }

    public void setDateTask(Date dateTask) {
        this.dateTask = dateTask;
    }
}
