package com.example.backend.model;

import java.util.List;

public class SyncState {
    private List<RegisteredUser> registeredUsers;
    private List<Student> students;

    public SyncState() {}

    public List<RegisteredUser> getRegisteredUsers() { return registeredUsers; }
    public void setRegisteredUsers(List<RegisteredUser> registeredUsers) { this.registeredUsers = registeredUsers; }

    public List<Student> getStudents() { return students; }
    public void setStudents(List<Student> students) { this.students = students; }
}
