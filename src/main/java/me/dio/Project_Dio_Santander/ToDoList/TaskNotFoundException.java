package me.dio.Project_Dio_Santander.ToDoList;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(String message) {
        super(message);
    }
}
