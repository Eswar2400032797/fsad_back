package com.example.backend.service;

import com.example.backend.model.RegisteredUser;
import com.example.backend.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SyncService {
    private final List<RegisteredUser> registeredUsers = new ArrayList<>();
    private final List<Student> students = new ArrayList<>();

    public List<RegisteredUser> getRegisteredUsers() {
        return registeredUsers;
    }

    public void setRegisteredUsers(List<RegisteredUser> users) {
        registeredUsers.clear();
        if (users != null) registeredUsers.addAll(users);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> studentsList) {
        students.clear();
        if (studentsList != null) students.addAll(studentsList);
    }
}
