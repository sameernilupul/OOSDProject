<%-- 
    Document   : checkpoint
    Created on : Mar 5, 2012, 5:34:08 AM
    Author     : sameernilupul
--%>

<%@page import="location.Point"%>
<%@page import="human.Person"%>
<%@page import="human.User"%>
<%@page import="update.UpdateHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <% 
        if(session.getAttribute("user") == null){
            %> <meta http-equiv="REFRESH" content="0;url=../Login/Login.jsp"><%
        }else{
            Person user =(Person)session.getAttribute("user");
            if(user.getAcsessLevel()!=3 &&user.getAcsessLevel()!=0){
                %> <meta http-equiv="REFRESH" content="0;url=../Login/Login.jsp"><%
            }
        }
    %>
    <body>
    Submitting Details
    </body>
    <%
        Point point = new Point(Double.parseDouble((String)session.getAttribute("long")), Double.parseDouble((String)session.getAttribute("lati")));
        UpdateHandler handler = new UpdateHandler();
        
        handler.setPosition(point);
        
        handler.setLocationID(system.Convert.getLocationId(point));
        //handler.setLocationID(100);
        handler.setName(request.getParameter("name"));
        //Air
        handler.setAirQualityLevel(Float.parseFloat(request.getParameter("airQualityLevel")));
        handler.setCO2_concentration(Float.parseFloat(request.getParameter("CO2_concentration")));
        handler.setO2_concentration(Float.parseFloat(request.getParameter("O2_concentration")));
        handler.setDustLevel(Float.parseFloat(request.getParameter("dustLevel")));
        
        //Water
        handler.setWaterType(request.getParameter("watertype"));
        handler.setPercentage(Float.parseFloat(request.getParameter("percentage")));
        handler.setWaterQualityIndex(Float.parseFloat(request.getParameter("waterQualityIndex")));
        
        //Population
        handler.setPopulationDensity(Float.parseFloat(request.getParameter("populationDensity")));
        handler.setGreenPercentage(Float.parseFloat(request.getParameter("greenPercentage")));
        handler.setBuilding(Float.parseFloat(request.getParameter("building")));
        handler.setUserId(((Person)session.getAttribute("user")).getUserId());
        handler.finish(true);
    %>
    <meta http-equiv="REFRESH" content="0;url=../services.html">
</html>
