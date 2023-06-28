package com.example.assignment.Services;

import com.example.assignment.Repo.DataRepo;
import org.springframework.stereotype.Service;

@Service
public class DataServices {
    private final DataRepo repo;

    public DataServices(DataRepo repo) {
        this.repo = repo;
    }

}
