<%-- 
    Document   : AdminHome
    Created on : Mar 23, 2012, 7:08:17 AM
    Author     : sameernilupul
--%>

<%@page import="human.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
     if(session.getAttribute("user") == null){
            %> <meta http-equiv="REFRESH" content="0;url=../Login/Login.jsp"><%
        }else{
            Person user =(Person)session.getAttribute("user");
            if(user.getAcsessLevel()!=0){
                %> <meta http-equiv="REFRESH" content="0;url=../Login/Login.jsp"><%
            }
        }
     %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1>Type of your request</h1>

        <br><a href="../AddManager/AddManager.jsp">Add Manager</a></br>

        <br><a href="../AddUser/AddUser.jsp">Add User</a></br>
        <br><a href="../LandRequest/selectLocation.jsp">Request land</a></br>
        <br><a href="../EnterDetails/selectLocation.jsp">Enter Data</a></br>
        <br><a href="ComplainViewer.jsp">Complain Viewer</a></br>
        <br><a href="RequestViewe.jsp">Request Viewer</a></br>
    
    </body>
</html>
