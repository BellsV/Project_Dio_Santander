package me.dio.Project_Dio_Santander.ToDoList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public Task createTask(@RequestBody String description) {
        return taskService.createTask(description);
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PutMapping("/{taskId}/complete")
    public Task markTaskAsCompleted(@PathVariable Long taskId) {
        return taskService.markTaskAsCompleted(taskId);
    }
}
