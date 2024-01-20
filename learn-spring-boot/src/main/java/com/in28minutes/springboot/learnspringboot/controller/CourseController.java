package com.in28minutes.springboot.learnspringboot.controller;

import com.in28minutes.springboot.learnspringboot.entity.Course;

import java.util.Arrays;
import java.util.List;

//@RestController
public class CourseController {
   // @GetMapping("/courses")
    public List<Course> retrieveAllCourse(){
        return Arrays.asList(
                new Course(1,"Spring-Boot","Charl Davis"),
                new Course(2,"JAVA", "Tim B.")
        );

    }

}
