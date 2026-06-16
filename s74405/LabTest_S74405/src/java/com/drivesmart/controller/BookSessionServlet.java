package com.drivesmart.controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import com.drivesmart.dao.SessionDAO;
import com.drivesmart.model.SessionBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MRPC
 */
@WebServlet("/BookSessionServlet")
public class BookSessionServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentName = request.getParameter("student_name");
        String branchLocation = request.getParameter("branch_location");
        String lessonType = request.getParameter("lesson_type");

        SessionBean session = new SessionBean();
        session.setStudentName(studentName);
        session.setBranchLocation(branchLocation);
        session.setLessonType(lessonType);
        session.setStatus("Booked");

        // hanto ke DAO
        SessionDAO dao = new SessionDAO();
        dao.BookSession(session);

        response.sendRedirect("ScheduleServlet");
    }
}
