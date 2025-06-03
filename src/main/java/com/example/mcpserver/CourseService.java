package com.example.mcpserver;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    private static Logger logger = LoggerFactory.getLogger(CourseService.class);
    private List<Course> courseList = new ArrayList<>();

    @Tool(name = "getCourseList", description = "Get course list")
    public List<Course> getCourseList() {
        return courseList;
    }

    @Tool(name = "getCourse", description = "Get a course by title")
    public List<Course> getCourse(String title) {
        return courseList;
    }


    @PostConstruct
    public void init() {
        courseList.addAll(List.of(
                new Course("Java", "Java is a programming language", "https://www.java.com"),
                new Course("Python", "Python is a programming language", "https://www.python.org"),
                new Course("JavaScript", "JavaScript is a programming language", "https://www.javascript.com")
        ));
    }
}
