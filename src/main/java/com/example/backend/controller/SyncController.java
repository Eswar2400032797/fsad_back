package com.example.backend.controller;

import com.example.backend.model.RegisteredUser;
import com.example.backend.model.Student;
import com.example.backend.model.SyncState;
import com.example.backend.service.SyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sync")
public class SyncController {

    private final SyncService syncService;

    @Autowired
    public SyncController(SyncService syncService) {
        this.syncService = syncService;
    }

    @GetMapping("/state")
    public SyncState getState() {
        SyncState state = new SyncState();
        state.setRegisteredUsers(syncService.getRegisteredUsers());
        state.setStudents(syncService.getStudents());
        return state;
    }

    @PostMapping("/state")
    public SyncState setState(@RequestBody SyncState state) {
        List<RegisteredUser> users = state.getRegisteredUsers();
        List<Student> students = state.getStudents();
        syncService.setRegisteredUsers(users);
        syncService.setStudents(students);
        return getState();
    }
}
