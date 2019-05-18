package com.pckg.appointment.controller;

import com.pckg.appointment.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class TaskController {

    private HashMap<Integer,  HashMap<String, Object>> mapTasks = new HashMap<Integer,  HashMap<String, Object>>();

    @GetMapping("/tasks")
    public Map<Integer,  HashMap<String, Object>> getTasks(){
        return mapTasks;
    }

    @GetMapping("/task/{id}")
    public Map<String, Object> getTask(@PathVariable("id") Integer id){
        HashMap<String, Object> resultTask = new HashMap<>();

        if(mapTasks.size() > 0) {
            resultTask = mapTasks.get(id);
        }
        return resultTask;
    }

    @PostMapping("/task")
    public Map<String, Object> createTask(@RequestBody Task task){
        HashMap<String, Object> resultTask = new HashMap<>();

        resultTask.put("id",task.getId());
        resultTask.put("name",task.getName());
        resultTask.put("description",task.getDescription());
        resultTask.put("dateCreation",task.getDateCreation());
        resultTask.put("dateTask",task.getDateTask());

        mapTasks.put(task.getId(), resultTask);

        return resultTask;
    }

    @PutMapping("/task")
    public Map<String, Object> updateTask(@RequestBody Task task){
        HashMap<String, Object> resultTask = new HashMap<String, Object>();

        if(mapTasks.size() > 0) {
            resultTask = mapTasks.get(task.getId());
            resultTask.put("id", task.getId());
            resultTask.put("name", task.getName());
            resultTask.put("description", task.getDescription());
            resultTask.put("dateCreation", task.getDateCreation());
            resultTask.put("dateTask", task.getDateTask());
            mapTasks.put(task.getId(), resultTask);
        }

        return resultTask;
    }
}
