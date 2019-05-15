package com.pckg.appointment.controller;

import com.pckg.appointment.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class TaskController {

    private List<Task> buildTasksList(Integer size){
        List<Task> listTasks = new ArrayList<>();
        for (Integer i = 0; i < size; i++){
            Task task = new Task();
            task.setId(i);
            task.setName("Task " + i);
            task.setDescription("Task Description " + i);
            task.setDateCreation(new Date());
            task.setDateTask(new Date());
            listTasks.add(task);
        }

        return listTasks;
    }

    @GetMapping("/tasks")
    public Map<Integer,  HashMap<String, Object>> getTasks(){
        HashMap<Integer,  HashMap<String, Object>> resultMapTask = new HashMap<Integer,  HashMap<String, Object>>();
        List<Task> listTasks = new ArrayList<>();
        Integer cont = 0;

        listTasks = buildTasksList(2);
        for(Task task : listTasks){
            HashMap<String, Object> tempMapTask = new HashMap<String, Object>();
            tempMapTask.put("id",task.getId());
            tempMapTask.put("name",task.getName());
            tempMapTask.put("description",task.getDescription());
            tempMapTask.put("dateCreation",task.getDateCreation());
            tempMapTask.put("dateTask",task.getDateTask());
            resultMapTask.put(cont,tempMapTask);
            cont++;
        }

        return resultMapTask;
    }

    @GetMapping("/task/{id}")
    public Map<String, Object> getTasks(@PathVariable("id") Integer id){
        HashMap<Integer,  HashMap<String, Object>> tempMapTask = new HashMap<Integer,  HashMap<String, Object>>();
        HashMap<String, Object> resultTask = new HashMap<String, Object>();

        List<Task> listTasks = new ArrayList<>();
        listTasks = buildTasksList(5);
        Task mytask = new Task();
        mytask = listTasks.get(id);

        resultTask.put("id",mytask.getId());
        resultTask.put("name",mytask.getName());
        resultTask.put("description",mytask.getDescription());
        resultTask.put("dateCreation",mytask.getDateCreation());
        resultTask.put("dateTask",mytask.getDateTask());

        return resultTask;
    }
}
