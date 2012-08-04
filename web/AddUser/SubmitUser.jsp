<%-- 
    Document   : SubmitUser
    Created on : Mar 23, 2012, 2:20:51 AM
    Author     : sameernilupul
--%>

<%@page import="human.Person"%>
<%@page import="database.DataBaseHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        String email = (String)request.getParameter("email");
        String username = (String)request.getParameter("username");
        String name = (String)request.getParameter("name");
        String nic = (String)request.getParameter("nic");
        String mobile = (String)request.getParameter("mobile");
        String passwd = system.Security.md5((String)request.getParameter("passwd1"));
        
        DataBaseHandler dbh = new DataBaseHandler();
        if(dbh.InitUser(username, passwd)){
            dbh.insertUser(username, 4, name, nic, mobile, email);
            Person user =(Person)session.getAttribute("user");
            if(user.getAcsessLevel() !=0){
                %><meta http-equiv="REFRESH" content="0;url=../Login/Login.jsp"><%
            }else{
                %><meta http-equiv="REFRESH" content="0;url=../AdministorAccount/AdminHome.jsp"><%
            }
        }else{
            %><meta http-equiv="REFRESH" content="0;url=AddUser.jsp"><%
        }
        
    %>
    
</html>
