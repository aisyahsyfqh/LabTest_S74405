package com.drivesmart.dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MRPC
 */

import com.drivesmart.model.SessionBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SessionDAO {
    
    // Connection Method
    public Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/drivesmart_db";
            String user = "root";      
            String password = ""; 
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    // Insert Method
    public void BookSession(SessionBean session) {
        String sql = "INSERT INTO Training_Sessions (student_name, branch_location, lesson_type, status) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, session.getStudentName());
            pstmt.setString(2, session.getBranchLocation());
            pstmt.setString(3, session.getLessonType());
            pstmt.setString(4, session.getStatus());
            
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Retrieve Method
    public List<SessionBean> getAllSessions() {
        List<SessionBean> sessionList = new ArrayList<>();
        String sql = "SELECT * FROM Training_Sessions ORDER BY branch_location ASC";
        
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            
            while (rs.next()) {
                SessionBean session = new SessionBean();
                session.setSessionId(rs.getInt("session_id"));
                session.setStudentName(rs.getString("student_name"));
                session.setBranchLocation(rs.getString("branch_location"));
                session.setLessonType(rs.getString("lesson_type"));
                session.setStatus(rs.getString("status"));
                sessionList.add(session);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sessionList;
    }
}
