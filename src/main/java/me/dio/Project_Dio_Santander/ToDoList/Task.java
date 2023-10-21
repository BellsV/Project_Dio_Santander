package me.dio.Project_Dio_Santander.ToDoList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private boolean completed;

    // Getter para o campo "id"
    public Long getId() {
        return id;
    }

    // Setter para o campo "id"
    public void setId(Long id) {
        this.id = id;
    }

    // Getter para o campo "description"
    public String getDescription() {
        return description;
    }

    // Setter para o campo "description"
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter para o campo "completed"
    public boolean isCompleted() {
        return completed;
    }

    // Setter para o campo "completed"
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
