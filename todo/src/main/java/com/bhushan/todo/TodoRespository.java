package com.bhushan.todo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRespository extends MongoRepository<Todo, Integer> {
}
