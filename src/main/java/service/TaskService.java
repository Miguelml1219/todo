package service;

import model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TaskRepository;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    public Task createTask(Task task){
        return taskRepository.save(task);
    }
}
