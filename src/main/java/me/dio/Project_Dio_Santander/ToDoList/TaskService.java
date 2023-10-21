package me.dio.Project_Dio_Santander.ToDoList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task createTask(String description) {
        Task task = new Task();
        task.setDescription(description);
        return taskRepository.save(task);
    }

    public Task markTaskAsCompleted(Long taskId) {
        Optional<Task> taskOptional = taskRepository.findById(taskId);
        if (taskOptional.isPresent()) {
            Task task = taskOptional.get();
            task.setCompleted(true);
            return taskRepository.save(task);
        } else {
            throw new TaskNotFoundException("Tarefa não encontrada com o ID: " + taskId);
        }
    }
}

