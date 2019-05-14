package com.pckg.appointment.controller;

import com.pckg.appointment.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TaskController {
    private Task task;

    @GetMapping("/task")
    public Map<String, Object> getTask(){
        HashMap<String, Object> resultTask = new HashMap<>();
        task.setId(new Long(0));
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
}
