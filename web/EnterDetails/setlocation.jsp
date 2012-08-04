<%-- 
    Document   : setlocation
    Created on : Mar 22, 2012, 7:54:06 PM
    Author     : sameernilupul
--%>

<%@page import="human.Person"%>
<%@page import="human.User"%>
<%@page import="java.util.StringTokenizer"%>
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
    <%
        String message = request.getParameter("value");
        StringTokenizer st = new StringTokenizer(message);
        session.setAttribute("long", st.nextToken());
        session.setAttribute("lati", st.nextToken());
        //session.setAttribute("clicked", "true");
    %>
    <jsp:forward page="EnterDetails.jsp" />
</html>
