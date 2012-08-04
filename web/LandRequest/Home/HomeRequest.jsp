<%-- 
    Document   : HomeRequest
    Created on : Mar 20, 2012, 2:29:26 AM
    Author     : sameernilupul
--%>

<%@page import="human.Person"%>
<%@page import="human.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <% 
        if(session.getAttribute("user") == null){
            %> <meta http-equiv="REFRESH" content="0;url=../../Login/Login.jsp"><%
        }else{
            Person user =(Person)session.getAttribute("user");
            if(user.getAcsessLevel()!=4 &&user.getAcsessLevel()!=0){
                %> <meta http-equiv="REFRESH" content="0;url=../../Login/Login.jsp"><%
            }
        }
    %>
    <script type="text/javascript" src="../../js/jquery.js" ></script>
                        <script type="text/javascript" src="../../js/jquery-validation-1.9.0/jquery.validate.min.js"></script>
                        <script type="text/javascript" >
                            $(document).ready(function()  {
                                $("#home").validate();
                            });
                        </script>
     <style type="text/css">
     .ASD {
	color: #FFF;
}
     #header-wrapper #header #logo h1 a {
	color: #FFF;
}
     #header-wrapper #header #logo p {
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
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Land Request</title>
    </head>
    <BODY background="img07.jpg">
<p></p>
<p></p>
<p></p>
<div id="header-wrapper">
		<div id="header">
			<div id="logo">
				<h1 align="center"><a href="">MINISREY OF ENVIRONMENT</a></h1>
				<p align="center">SERVICE CENTER</p>
				<p align="center">HOME REQUEST</p>
				<p align="center">&nbsp;</p>
			</div>
		</div>
	</div>
        <form action="submithomerequest.jsp" id ="home">
            <div align="center">
              <table border = "0">
                <tr align="left" valign="top" class="ASD">
                  <td><h1>Home</h1></td>
                  </tr>
                
                <tr align="left" valign="top">
                  <td class="ASD">Your Email</td>
                  <td><input type="text" name="email" value="" class ="required email"/></td>
                  </tr>
                <tr align="left" valign="top">
                  <td class="ASD">Title</td>
                  <td><input type="text" name="title" value="" class ="required"/> </td>
                  </tr>
                <tr align="left" valign="top">
                  <td class="ASD">Land Area</td>
                  <td><input type="text" name="area" value="" class ="required number"/></td>
                  </tr>
                <tr align="left" valign="top">
                  <td class="ASD">Description</td>
                  <td><textarea name="description" rows="4" cols="20" class ="required"></textarea></td>
                  </tr>
                <tr align="left" valign="top">
                  <td class="ASD">No Of Floors</td>
                  <td><input type="text" name="floors" value="" class ="required number"/></td>
                  </tr>
                <tr align="left" valign="top">
                  <td class="ASD">No Of People</td>
                  <td><input type="text" name="occupans" value="" class ="required number"/></td>
                  </tr>
                <tr align="left" valign="top">
                  <td><input type="submit" value="Submit" /></td>
                  </tr>
                </table>
          </div>
        </form>
    </body>
</html>
