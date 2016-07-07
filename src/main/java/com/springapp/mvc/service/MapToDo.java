package com.springapp.mvc.service;

import java.util.HashMap;
import java.util.Map;


public class MapToDo {

    private Map<String, Task> map;


    public MapToDo() {
        map = new HashMap<String, Task>();
        Task task = new Task();
        Task task1 = new Task();
        task.setTaskCategory("_");
        task.isComplete();
        map.put("Name", task);
        map.put("d", task1);
    }

    public Map<String, Task> getMap() {
        return map;
    }







    public class Task {
        private String TaskCategory;
        private boolean Complete;

        public String getTaskCategory() {
            return TaskCategory;
        }

        public void setTaskCategory(String taskCategory) {
            TaskCategory = taskCategory;
        }

        public boolean isComplete() {
            return Complete;
        }

        public void setComplete(boolean complete) {
            Complete = complete;
        }
    }
}
