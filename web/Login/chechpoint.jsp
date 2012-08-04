<%-- 
    Document   : chechpoint
    Created on : Mar 23, 2012, 12:13:56 AM
    Author     : sameernilupul
--%>

<%@page import="human.Person"%>
<%@page import="database.DataBaseHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
   String username = request.getParameter("user");
   String pw = system.Security.md5(request.getParameter("pass")); 
   database.DataBaseHandler db = new DataBaseHandler();
 
    
    if(db.validateUser(username,pw)){
        Person person;
        if(db.getUser(username)== null){
            person = db.getManager(username);
        }else{
            person = db.getUser(username);
        }
        session.setAttribute("user", person);
       if(person.getAcsessLevel() ==0){
           %> <meta http-equiv="REFRESH" content="0;url=../AdministorAccount/AdminHome.jsp"><%
       }else if(person.getAcsessLevel() ==2){
           
       }else if(person.getAcsessLevel()==3){
           %> <meta http-equiv="REFRESH" content="0;url=../EnterDetails/EnterDetails.jsp"><%
       }else{
            %> <meta http-equiv="REFRESH" content="0;url=../Home.html"><%
       }
    }else{
       %> <jsp:forward page="Login.jsp"/><%
    }
    
    %>
</html>
