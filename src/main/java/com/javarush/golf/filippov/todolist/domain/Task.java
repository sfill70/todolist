package com.javarush.golf.filippov.todolist.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(max = 100, message = "description should be max 100 characters")
    private String description;

    @Enumerated
    private Status status;

}
