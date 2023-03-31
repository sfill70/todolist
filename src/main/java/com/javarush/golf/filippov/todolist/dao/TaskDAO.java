package com.javarush.golf.filippov.todolist.dao;

import com.javarush.golf.filippov.todolist.domain.Task;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDAO extends PagingAndSortingRepository<Task, Integer> {

}
