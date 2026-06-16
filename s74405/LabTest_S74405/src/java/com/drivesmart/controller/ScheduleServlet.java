package com.drivesmart.controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package com.drivesmart.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.drivesmart.model.SessionBean;
import com.drivesmart.dao.SessionDAO;

/**
 *
 * @author MRPC
 */
@WebServlet("/ScheduleServlet")
public class ScheduleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L; 
    
    private SessionDAO sessionDAO;

    @Override
    public void init() {
        sessionDAO = new SessionDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Panggil getAllSessions() dari DAO
        List<SessionBean> list = sessionDAO.getAllSessions();
        
        request.setAttribute("sessionList", list);

        RequestDispatcher dispatcher = request.getRequestDispatcher("schedule.jsp");
        dispatcher.forward(request, response);
    }
}

