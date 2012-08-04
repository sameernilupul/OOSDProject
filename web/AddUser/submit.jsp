<%-- 
    Document   : submit
    Created on : Mar 26, 2012, 12:53:38 AM
    Author     : sameernilupul
--%>

<%@page import="human.User"%>
<%@page import="database.DataBaseHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        String username = (String)request.getParameter("username");
        String pwOld = (String)request.getParameter("passwd0");
        String pwNew1 = (String)request.getParameter("passwd1");
        String pwNew2 = (String)request.getParameter("passwd2");
        DataBaseHandler db = new DataBaseHandler();
        
        User user =  db.getUser(username);

        if(db.validateUser(username,pwOld) && pwNew1.equals(pwNew2)){
            db.changeUserPassword(username,pwNew1);
        }else{
            %><meta http-equiv="REFRESH" content="0;url=submit.jsp"><%
        }
    %>
    
    <meta http-equiv="REFRESH" content="0;url=../Login/Login.jsp">
</html>
