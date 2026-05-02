package com.example.backend.model;

public class Student {
    private String id;
    private String name;
    private String email;
    private String password;
    private String grade;
    private String enrollmentDate;
    private String phone;
    private String parentEmail;
    private String registeredDate;
    private boolean isActive;
    private double attendance;
    private double overallGPA;
    private java.util.List<java.util.Map<String, Object>> performance;
    private java.util.List<String> strengths;
    private java.util.List<String> weaknesses;
    private java.util.List<java.util.Map<String, Object>> trend;

    public Student() {}

    public Student(String id, String name, String email, double attendance, double overallGPA) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.attendance = attendance;
        this.overallGPA = overallGPA;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    public String getEnrollmentDate() { return enrollmentDate; }
    public void setEnrollmentDate(String enrollmentDate) { this.enrollmentDate = enrollmentDate; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getParentEmail() { return parentEmail; }
    public void setParentEmail(String parentEmail) { this.parentEmail = parentEmail; }

    public String getRegisteredDate() { return registeredDate; }
    public void setRegisteredDate(String registeredDate) { this.registeredDate = registeredDate; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }

    public double getAttendance() { return attendance; }
    public void setAttendance(double attendance) { this.attendance = attendance; }

    public double getOverallGPA() { return overallGPA; }
    public void setOverallGPA(double overallGPA) { this.overallGPA = overallGPA; }

    public java.util.List<java.util.Map<String, Object>> getPerformance() { return performance; }
    public void setPerformance(java.util.List<java.util.Map<String, Object>> performance) { this.performance = performance; }

    public java.util.List<String> getStrengths() { return strengths; }
    public void setStrengths(java.util.List<String> strengths) { this.strengths = strengths; }

    public java.util.List<String> getWeaknesses() { return weaknesses; }
    public void setWeaknesses(java.util.List<String> weaknesses) { this.weaknesses = weaknesses; }

    public java.util.List<java.util.Map<String, Object>> getTrend() { return trend; }
    public void setTrend(java.util.List<java.util.Map<String, Object>> trend) { this.trend = trend; }
}