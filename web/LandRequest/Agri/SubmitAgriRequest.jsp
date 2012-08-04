<%-- 
    Document   : SubmitAgriRequest
    Created on : Mar 20, 2012, 6:08:06 AM
    Author     : sameernilupul
--%>
<%@page import="human.Person"%>
<%@page import="human.User"%>
<%@page import="system.Convert"%>
<%@page import="location.Point"%>
<%@page import="request.AgricultureRequestHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <% 
        if(session.getAttribute("user") == null){
            %> <meta http-equiv="REFRESH" content="0;url=../../Login/Login.jsp"><%
        }else{
            Person user =(Person)session.getAttribute("user");
            if(user.getAcsessLevel()!=4 &&user.getAcsessLevel()!=0){
                %> <meta http-equiv="REFRESH" content="0;url=../../Login/Login.jsp"><%
            }
        }
    %>
    <%
        database.DataBaseHandler dbHandler = new database.DataBaseHandler();
        boolean longTime =true;
        float area = Float.parseFloat(request.getParameter("area"));
        boolean organic = Boolean.parseBoolean(request.getParameter("organic"));
        User user =(User)session.getAttribute("user");
        int userId = user.getUserId();
        String userEmail = request.getParameter("email");
        Point location = new Point(Double.parseDouble((String)session.getAttribute("lati")), Double.parseDouble((String)session.getAttribute("long")));

        int locationId = Convert.getLocationId(location);
        String title = request.getParameter("title");
        String discription =request.getParameter("description");
        
        AgricultureRequestHandler handler = new AgricultureRequestHandler(longTime, area, organic, userId, userEmail, locationId, title, discription);
        handler.finish(true);
    %>
    <meta http-equiv="REFRESH" content="0;url=../../services.html">
</html>
