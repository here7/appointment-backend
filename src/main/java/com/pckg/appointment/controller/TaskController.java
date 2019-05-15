package com.pckg.appointment.controller;

import com.pckg.appointment.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TaskController {
    private Task task = new Task();

    @GetMapping("/tasks")
    public Map<String, Object> getTasks(){
        HashMap<String, Object> resultTask = new HashMap<>();

        task.setId(1);
        task.setName("Look trip");
        task.setDescription("We will check different places to visit");
        task.setDateCreation(new Date());
        task.setDateTask(new Date());

        resultTask.put("id",task.getId());
        resultTask.put("name",task.getName());
        resultTask.put("description",task.getDescription());
        resultTask.put("dateCreation",task.getDateCreation());
        resultTask.put("dateTask",task.getDateTask());

        return resultTask;
    }

    @GetMapping("/task/{id}")
    public Map<String, Object> getTasks(@PathVariable("id") Integer id){
        HashMap<String, Object> resultTask = new HashMap<>();

        task.setId(1);
        task.setName("Look trip");
        task.setDescription("We will check different places to visit");
        task.setDateCreation(new Date());
        task.setDateTask(new Date());

        task.setId(2);
        task.setName("Salesforce Meeting");
        task.setDescription("Arrive 30min. before");
        task.setDateCreation(new Date());
        task.setDateTask(new Date());


        return resultTask;
    }
}
