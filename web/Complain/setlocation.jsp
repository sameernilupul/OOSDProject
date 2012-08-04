<%-- 
    Document   : setlocation
    Created on : Mar 22, 2012, 7:54:06 PM
    Author     : sameernilupul
--%>

<%@page import="java.util.StringTokenizer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        String message = request.getParameter("value");
        StringTokenizer st = new StringTokenizer(message);
        session.setAttribute("long", st.nextToken());
        session.setAttribute("lati", st.nextToken());
        //session.setAttribute("clicked", "true");
    %>
    <jsp:forward page="Complain.jsp" />
</html>
