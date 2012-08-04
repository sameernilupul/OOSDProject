<%-- 
    Document   : submitindustrialrequest
    Created on : Mar 22, 2012, 9:09:49 PM
    Author     : sameernilupul
--%>

<%@page import="human.Person"%>
<%@page import="human.User"%>
<%@page import="system.Convert"%>
<%@page import="request.FactoryRequestHandler"%>
<%@page import="location.Point"%>
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
        
        String userEmail = request.getParameter("email");
        String title = request.getParameter("title");
        float area = Float.parseFloat(request.getParameter("area"));
        String discription =request.getParameter("description");
        float co2emission = Float.parseFloat(request.getParameter("co2emission"));
        float o2emission = Float.parseFloat(request.getParameter("o2emission"));
        float pollutedWater = Float.parseFloat(request.getParameter("pollutedwater")); 
        
        User user =(human.User)session.getAttribute("user");
        int userId = user.getUserId();
        Point location = new Point(Double.parseDouble((String)session.getAttribute("lati")), Double.parseDouble((String)session.getAttribute("long")));
        
        int locationId = Convert.getLocationId(location);
        
        FactoryRequestHandler handler = new FactoryRequestHandler(co2emission, area, o2emission, pollutedWater, userId, userEmail, locationId, title, discription);
        handler.finish(true);
    %>
    <meta http-equiv="REFRESH" content="0;url=../../services.html">
</html>
