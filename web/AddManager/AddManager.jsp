<%-- 
    Document   : AddUser
    Created on : Mar 23, 2012, 2:18:46 AM
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
        <title>Add manager</title>
        <script type="text/javascript" src="../js/jquery.js" ></script>
                        <script type="text/javascript" src="../js/jquery-validation-1.9.0/jquery.validate.min.js"></script>
                        <script type="text/javascript" >
                            $(document).ready(function()  {
                                $("#addman").validate();
                            });
                        </script>
    <style type="text/css">
    asAS {
	color: #FFF;
}
    #form1 div {
	font-size: x-large;
	color: #FFF;
}
    .As {
	color: #FFF;
}
    .sada {
	color: #FFF;
	font-size: small;
}
    .dsasdad {
	color: #FFF;
}
.error{
      font: normal 10px arial;
      color:#c00;
      padding: 3px;
      margin: 3px;
      background-color: #ffd;
      border: 1px solid #c00;
      }
    </style>
    </head>
    <BODY background="img07.jpg">
    
	<p>&nbsp;	</p>
    <form id="form1" name="form1" method="post" action="">
	<label for="title">       
                        <div align="center">MINISTRY OF ENVIRONMENT<br />
      SERVICE CENTER</div>
      <div align="center">
      </label>
      <span class="As">REGISTER NEW USER</span></div>
</form>
         <h1 class="sada">Enter your details here.</h1>
        <form action="SubmitManager.jsp" id ="addman">
          <div align="center">
            <table border = "0">
              <tr align="left" valign="top">
                <td class="dsasdad">Your Email</td>
                <td><input type="text" name="email" value="" class ="required email"/></td>
                </tr>
              <tr align="left" valign="top">
                <td class="dsasdad">Username</td>
                <td><input type="text" name="username" value="" class ="required" /> </td>
                </tr>
              <tr align="left" valign="top">
                <td class="dsasdad">Full Name</td>
                <td><input type="text" name="name" value="" class ="required"/> </td>
                </tr>
              <tr align="left" valign="top">
                <td class="dsasdad">NIC No</td>
                <td><input type="text" name="nic" value="" class ="required"/> </td>
                </tr>
              <tr align="left" valign="top">
                <td class="dsasdad">Mobile No</td>
                <td><input type="text" name="mobile" value=""/> </td>
                </tr>
              <tr align="left" valign="top">
                <td class="dsasdad">Manager Type</td>
                <td><select name="type">
                  <option value ="regional">Regional Officer</option>
                  <option value ="accept">Administrative Officer</option>
                  <option value ="inspect">Inspector</option>
                  </select></td>
                </tr>
              <tr align="left" valign="top">
                <td><input type="submit" value="Submit" /></td>
                </tr>
              </table>
          </div>
        </form>
    </body>
</html>
