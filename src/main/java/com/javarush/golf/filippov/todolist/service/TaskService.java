package com.javarush.golf.filippov.todolist.service;

import com.javarush.golf.filippov.todolist.dto.TaskDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface TaskService {

    TaskDTO findById(Integer id);

    Page<TaskDTO> findAll(PageRequest pageRequest);

    void save(TaskDTO taskDTO);

    void update(TaskDTO taskDTO);

    void delete(TaskDTO taskDTO);

}
