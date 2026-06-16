package com.drivesmart.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MRPC
 */
import java.io.Serializable;

public class SessionBean implements Serializable {

    private int sessionId;
    private String studentName;
    private String branchLocation;
    private String lessonType;
    private String status;

    public SessionBean() {
    }

    public SessionBean(int sessionId, String studentName, String branchLocation, String lessonType, String status) {
        this.sessionId = sessionId;
        this.studentName = studentName;
        this.branchLocation = branchLocation;
        this.lessonType = lessonType;
        this.status = status;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public String getLessonType() {
        return lessonType;
    }

    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
