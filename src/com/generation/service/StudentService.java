package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService {
    private final Map<String, Student> students = new HashMap<>();


    public void subscribeStudent(Student student) {
        students.put(student.getId(), student);
    }

    public Student findStudent(String studentId) {
        if (students.containsKey(studentId)) {
            return students.get(studentId);
        }
        return null;
    }

    public boolean isSubscribed(String studentId) {
        //TODO implement this method
        // Checks if student is registered

        return students.containsKey(studentId);

    }

    public void showSummary() {
        //TODO implement
        System.out.println(students.toString());

        //TODO implement challenge
        // Show each student's course(s)taken, and grade (if graded)


    }

    public void enrollToCourse(String studentId, Course course) {
        if (students.containsKey(studentId)) {
            students.get(studentId).enrollToCourse(course);
        }
    }


}
