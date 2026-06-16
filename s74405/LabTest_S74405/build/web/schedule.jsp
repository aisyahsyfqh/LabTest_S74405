<%-- 
    Document   : schedule
    Created on : 16 Jun 2026, 2:40:05 PM
    Author     : MRPC
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.drivesmart.model.SessionBean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Training Schedule - DriveSmart Academy</title>
    </head>
    <body>
        <%@ include file="header.html" %>

        <h2>Centralized Training Schedule</h2>
        <table border="1" cellpadding="10" cellspacing="0">
            <thead>
                <tr>
                    <th>Session ID</th>
                    <th>Student Name</th>
                    <th>Branch Location</th>
                    <th>Lesson Type</th>
                    <th>Status</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<SessionBean> sessionList = (List<SessionBean>) request.getAttribute("sessionList");
                    if (sessionList != null && !sessionList.isEmpty()) {
                        for (SessionBean sessionItem : sessionList) {
                %>
                <tr>   
                    <td><%= sessionItem.getSessionId()%></td>
                    <td><%= sessionItem.getStudentName()%></td>
                    <td><%= sessionItem.getBranchLocation()%></td>
                    <td><%= sessionItem.getLessonType()%></td>
                    <td><%= sessionItem.getStatus()%></td>
                </tr>
                <%
                    }
                } else {
                %>
                <tr>
                    <td colspan="5" style="text-align:center;">No training sessions booked yet.</td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>

        <p><a href="index.jsp">Back to Home</a></p>
        <%@ include file="footer.jsp" %>
    </body>
</html>
