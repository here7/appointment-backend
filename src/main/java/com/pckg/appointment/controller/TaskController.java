package com.pckg.appointment.controller;

import com.pckg.appointment.model.Task;

import java.util.Date;

public class TaskController {
    private Task task;

    public String getTask(){
        String resultTask = "";

        task.setId(1);
        task.setName("Look trip");
        task.setDescription("We will check different places to visit");
        task.setDateCreation(new Date());
        task.setDateTask(new Date());

        return resultTask;
    }
}
