package com.juceliocoelho.backendtodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.juceliocoelho.backendtodolist.entity.Todo;;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
