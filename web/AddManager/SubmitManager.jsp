<%-- 
    Document   : SubmitUser
    Created on : Mar 23, 2012, 2:20:51 AM
    Author     : sameernilupul
--%>

<%@page import="java.util.Random"%>
<%@page import="java.net.InetAddress"%>
<%@page import="human.Person"%>
<%@page import="database.DataBaseHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        if (session.getAttribute("user") == null) {
    %> <meta http-equiv="REFRESH" content="0;url=../Login/Login.jsp"><%            } else {
                Person user = (Person) session.getAttribute("user");
                if (user.getAcsessLevel() != 0) {
    %> <meta http-equiv="REFRESH" content="0;url=../Login/Login.jsp"><%                        }
                    }
    %>
    <%
        String email = (String) request.getParameter("email");
        String username = (String) request.getParameter("username");
        String name = (String) request.getParameter("name");
        String nic = (String) request.getParameter("nic");
        String mobile = (String) request.getParameter("mobile");
        String pw = Integer.toString((int)( new Random().nextDouble()*100000))+username;
        String passwd = system.Security.md5(pw);
        String type = request.getParameter("type");

        if (!type.equals("regional")) {
            DataBaseHandler dbh = new DataBaseHandler();
            if (dbh.InitUser(username, passwd)) {
                dbh.insertManager(username, 2, name, nic, mobile, email, type);
                InetAddress ownIp=InetAddress.getLocalHost();
                system.AddUserFeedback.sendMail(email, name, username, pw, type +" Officer",ownIp+":8080/WebApplication/AddUser/ChangeUserData.jsp");
    %><meta http-equiv="REFRESH" content="0;url=../AdministorAccount/AdminHome.jsp"><%
                } else {
    %><meta http-equiv="REFRESH" content="0;url=AddManager.jsp"><%                    }
                } else {
                    DataBaseHandler dbh = new DataBaseHandler();
                    if (dbh.InitUser(username, passwd)) {
                        dbh.insertManager(username, 3, name, nic, mobile, email, type);
    %><meta http-equiv="REFRESH" content="0;url=../AdministorAccount/AdminHome.jsp"><%
                } else {
    %><meta http-equiv="REFRESH" content="0;url=AddManager.jsp"><%                        }
                    }
    %>
</html>
