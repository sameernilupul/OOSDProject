<%-- 
    Document   : SubmitComplain
    Created on : Mar 16, 2012, 3:56:23 AM
    Author     : sameernilupul
--%>

<%@page import="location.Point"%>
<%@page import="request.ComplainHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        String title =request.getParameter("title");
        String email =request.getParameter("email");
        String description =request.getParameter("complain");
        Point location = new Point(Double.parseDouble((String)session.getAttribute("lati")), Double.parseDouble((String)session.getAttribute("long")));
        
        ComplainHandler handler = new ComplainHandler(email,location,title,description);
        handler.finish(true);
        
    %>
    <meta http-equiv="REFRESH" content="0;url=../services.html">
</html>
