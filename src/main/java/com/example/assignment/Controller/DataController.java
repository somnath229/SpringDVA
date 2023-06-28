package com.example.assignment.Controller;

import com.example.assignment.Entity.Data;
import com.example.assignment.Repo.DataRepo;
import com.example.assignment.Services.DataServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/data")
public class DataController {

    private DataRepo dataRepo;
    private DataServices dataServ;

    public DataController(DataRepo dataRepo, DataServices dataServ) {
        this.dataRepo = dataRepo;
        this.dataServ = dataServ;
    }

    @GetMapping("/getCsv")
    public List<Data> getAllData() {
        return dataRepo.findAll();
    }

//    @GetMapping("/intensity")
//    public ResponseEntity<Set<String>> getAllIntensities() {
//        List<Data> allData = dataRepo.findAll();
//        Set<String> intensities = allData.stream()
//                .map(Data::getIntensity)
//                .collect(Collectors.toSet());
//
//        if (intensities.isEmpty()) {
//            return ResponseEntity.noContent().build();
//        }
//
//        return ResponseEntity.ok(intensities);
//    }
@GetMapping("/{fieldName}")
public ResponseEntity<Set<String>> getAllDistinctValues(@PathVariable String fieldName) {
    List<Data> allData = dataRepo.findAll();
    Set<String> distinctValues = allData.stream()
            .map(data -> getValueByFieldName(data, fieldName))
            .filter(Objects::nonNull)
            .map(Object::toString)
            .collect(Collectors.toSet());

    if (distinctValues.isEmpty()) {
        return ResponseEntity.noContent().build();
    }

    return ResponseEntity.ok(distinctValues);
}

    private Object getValueByFieldName(Data data, String fieldName) {
        try {
            Field field = Data.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(data);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
