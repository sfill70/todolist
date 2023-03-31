package com.javarush.golf.filippov.todolist.dto;

import com.javarush.golf.filippov.todolist.domain.Status;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class TaskDTO {

    private Integer id;
    private String description;
    private Status status;

}
