<%-- 
    Document   : BookSession
    Created on : 16 Jun 2026, 2:38:35 PM
    Author     : MRPC
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Book a Session - DriveSmart Academy</title>
    </head>
    <body>
        <%@ include file="header.html" %>

        <h2>Book a Training Session</h2>
        <form action="BookSessionServlet" method="POST">
            <p>
                <label for="student_name">Student Name:</label><br>
                <input type="text" id="student_name" name="student_name" required>
            </p>

            <p>
                <label for="branch_location">Branch Location:</label><br>
                <select id="branch_location" name="branch_location" required>
                    <option value="">-- Select Location --</option>
                    <option value="Kuala Lumpur">Kuala Lumpur</option>
                    <option value="Penang">Penang</option>
                    <option value="Johor">Johor</option>
                </select>
            </p>

            <p>
                <label for="lesson_type">Lesson Type:</label><br>
                <select id="lesson_type" name="lesson_type" required>
                    <option value="">-- Select Lesson Type --</option>
                    <option value="Manual Car">Manual Car</option>
                    <option value="Automatic Car">Automatic Car</option>
                    <option value="Motorcycle">Motorcycle</option>
                </select>
            </p>

            <button type="submit">Submit Booking</button>
        </form>

        <p><a href="index.jsp">Back to Home</a></p>

        <jsp:include page="footer.jsp" />
    </body>
</html>

