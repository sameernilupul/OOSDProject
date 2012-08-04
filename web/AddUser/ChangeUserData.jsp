<%-- 
    Document   : ChangeUserData
    Created on : Mar 25, 2012, 3:35:02 AM
    Author     : sameernilupul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="submit.jsp">
            <div align="left">
              <table border = "0">
                <tr align="left" valign="top">
                  <td class="aass"><h1>Reset Your Password</h1></td>
                  </tr>
                <tr align="left" valign="top">
                  <td class="aass">Username</td>
                  <td><input type="text" name="username" value="" /> </td>
                  </tr>
                <tr align="left" valign="top">
                  <td class="aass">Password</td>
                  <td><input type="password" name="passwd0" value="" /> </td>
                  </tr>
                <tr align="left" valign="top">
                  <td class="aass">Password</td>
                  <td><input type="password" name="passwd1" value="" /> </td>
                  </tr>
                <tr align="left" valign="top">
                  <td class="aass">Re enter password</td>
                  <td><input type="password" name="passwd2" value="" /> </td>
                  </tr>
                <tr align="left" valign="top" class="aass">
                  <td><input type="submit" value="Submit" /></td>
                  </tr>
                </table>
            </div>
        </form>
    </body>
</html>
