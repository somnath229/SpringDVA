package com.example.assignment.Repo;

import com.example.assignment.Entity.Data;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DataRepo extends MongoRepository<Data, String> {
}
