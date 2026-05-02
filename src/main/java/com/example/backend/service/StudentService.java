package com.example.backend.service;

import com.example.backend.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final SyncService syncService;

    @Autowired
    public StudentService(SyncService syncService) {
        this.syncService = syncService;
    }

    // Get all students
    public List<Student> getAllStudents() {
        return syncService.getStudents();
    }

    // Get student by ID
    public Student getStudentById(String id) {
        return syncService.getStudents().stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
    }

    // Add student
    public Student addStudent(Student student) {
        syncService.getStudents().add(student);
        return student;
    }

    // Update student by id (replace fields)
    public Student updateStudent(String id, Student updated) {
        List<Student> list = syncService.getStudents();
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getId() != null && s.getId().equals(id)) {
                // keep id consistent
                updated.setId(id);
                list.set(i, updated);
                return updated;
            }
        }
        // not found; add as new
        updated.setId(id);
        list.add(updated);
        return updated;
    }
}