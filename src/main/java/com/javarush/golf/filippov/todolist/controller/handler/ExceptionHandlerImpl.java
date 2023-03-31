package com.javarush.golf.filippov.todolist.controller.handler;

import com.javarush.golf.filippov.todolist.error.TaskNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@ControllerAdvice
public class ExceptionHandlerImpl {

    @ExceptionHandler
    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Task not found")
    public void handleTaskNotFoundException(TaskNotFoundException e){
        log.error(e.getMessage());
    }
}
