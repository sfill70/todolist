package com.javarush.golf.filippov.todolist.mapper;

import com.javarush.golf.filippov.todolist.domain.Task;
import com.javarush.golf.filippov.todolist.dto.TaskDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper{
    TaskDTO mapToTaskDTO(Task task);
    Task mapToTask(TaskDTO taskDTO);
}
