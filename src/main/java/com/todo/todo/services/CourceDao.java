package com.todo.todo.services;

import com.todo.todo.entities.CourceEntities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourceDao extends JpaRepository<CourceEntities , Long> {

}
