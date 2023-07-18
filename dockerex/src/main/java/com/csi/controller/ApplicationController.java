package com.csi.controller;

import com.csi.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("welcome to fintech csi");

    }

    @GetMapping("/listofemployee")
    public ResponseEntity<List<Employee>> getAllData() {
        return ResponseEntity.ok(Stream.of(new Employee(1, "SURAJ", 96520),
                new Employee(2, "RAHUL", 65210),
                new Employee(3, "PREETI", 78510)).collect(Collectors.toList()));


    }

}
