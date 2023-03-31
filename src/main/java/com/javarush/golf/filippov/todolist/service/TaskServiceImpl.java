package com.javarush.golf.filippov.todolist.service;

import com.javarush.golf.filippov.todolist.dao.TaskDAO;
import com.javarush.golf.filippov.todolist.domain.Task;
import com.javarush.golf.filippov.todolist.dto.TaskDTO;
import com.javarush.golf.filippov.todolist.error.TaskNotFoundException;
import com.javarush.golf.filippov.todolist.mapper.TaskMapper;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor

@Service
@Transactional(readOnly = true)
public class TaskServiceImpl implements TaskService {

    private final TaskDAO taskDAO;
    private final TaskMapper taskMapper;

    @Override
    public TaskDTO findById(Integer id) {
        return taskDAO.findById(id)
                .map(taskMapper::mapToTaskDTO)
                .orElseThrow(() -> new TaskNotFoundException("Not found task with ID - " + id));
    }

    @Override
    public Page<TaskDTO> findAll(PageRequest pageRequest) {
        return taskDAO.findAll(pageRequest)
                .map(taskMapper::mapToTaskDTO);
    }

    @Transactional
    @Override
    public void save(TaskDTO taskDTO) {
        Task task = taskMapper.mapToTask(taskDTO);
        taskDAO.save(task);
    }

    @Transactional
    @Override
    public void update(TaskDTO taskDTO) {
        Task task = taskMapper.mapToTask(taskDTO);
        taskDAO.save(task);
    }

    @Transactional
    @Override
    public void delete(TaskDTO taskDTO) {
        Task task = taskMapper.mapToTask(taskDTO);
        taskDAO.delete(task);
    }
}
