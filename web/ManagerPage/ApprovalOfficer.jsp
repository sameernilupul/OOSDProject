<%-- 
    Document   : ApprovalOfficer
    Created on : Mar 23, 2012, 5:49:55 PM
    Author     : sameernilupul
--%>

<%@page import="request.FactoryRequest"%>
<%@page import="request.DomesticRequest"%>
<%@page import="request.LandRequest"%>
<%@page import="java.util.ArrayList"%>
<%@page import="database.DataBaseHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        DataBaseHandler dbh = new DataBaseHandler();
        ArrayList<LandRequest> landrRequests = dbh.getAllAgricultureRequest();
        ArrayList<DomesticRequest> domesticRequests = dbh.getAlldomesticRequest();
        ArrayList<FactoryRequest> factoryRequests = dbh.geAlltFactoryRequest();
        
        String landUrl = "You have "+Integer.toString(landrRequests.size())+" land requests";
        String domesticUrl = "You have "+Integer.toString(domesticRequests.size())+" home requests";
        String factoryUrl = "You have "+Integer.toString(factoryRequests.size())+" factory requests";
        //String landUrl = "You have "+Integer.toString(10)+" land requests";
        //String domesticUrl = "You have "+Integer.toString(3)+" home requests";
        //String factoryUrl = "You have "+Integer.toString(1)+" factory requests";
        session.setAttribute("landrequests", landrRequests);
        session.setAttribute("domesticrequests", domesticRequests);
        session.setAttribute("factoryrequests", factoryRequests);
        session.setAttribute("number", 10);
    %>  
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>You Have Requests</title>
    </head>
    <body>
        <h1>You have following requests</h1>
        <br><a href="Agri.jsp"> <%=landUrl%> </a></br>
        <br><a href="Home.jsp"> <%=domesticUrl%> </a></br>
        <br><a href="Industrial.jsp"> <%=factoryUrl%> </a></br>
    </body>
</html>
