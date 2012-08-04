<%-- 
    Document   : Logout
    Created on : Mar 24, 2012, 9:09:57 PM
    Author     : sameernilupul
--%>

<%@page import="human.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
         if(session.getAttribute("user") != null){
             session.setAttribute("user", null);
         }
     
    %>
    <meta http-equiv="REFRESH" content="0;url=../Home.html">
    
</html>
