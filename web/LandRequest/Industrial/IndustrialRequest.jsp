<%-- 
    Document   : IndustrialRequest
    Created on : Mar 20, 2012, 2:29:09 AM
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
                                $("#indu").validate();
                            });
                        </script>
    <style type="text/css">
    .asd {
	color: #FFF;
}
    #header-wrapper #header #logo blockquote p {
	color: #FFF;
}
    #header-wrapper #header #logo h1 a u {
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
        <title>Industrial Land Request</title>
    </head>
    <BODY background="img07.jpg">
    <p></p>
    <div id="header-wrapper">
		<div id="header">
			<div id="logo">
			  <h1 align="center"><a href=""><u>MINISTRY OF ENVIRONMENT</u></a></h1>
				<p align="center"><span class="asd">SERVICE CENTER</span></p>
				<blockquote>
				  <p align="center">INDUSTRIAL REQUEST</p>
			  </blockquote>
<p align="center">&nbsp;</p>
				<p align="center">&nbsp;</p>
				<p>&nbsp;</p>
		  </div>
		</div>
	</div>
        <form action="submitindustrialrequest.jsp" id ="indu">
            <div align="center">
              <table border = "0">
                <tr align="left" valign="top" class="asd">
                  <td><h1>Industrial</h1></td>
                  </tr>
                
                <tr align="left" valign="top">
                  <td class="asd">Your Email</td>
                  <td><input type="text" name="email" value="" class ="required email"/></td>
                  </tr>
                <tr align="left" valign="top">
                  <td class="asd">Title</td>
                  <td><input type="text" name="title" value="" class ="required"/> </td>
                  </tr>
                <tr align="left" valign="top">
                  <td class="asd">Description</td>
                  <td><textarea name="discription" rows="4" cols="50" class ="required"></textarea></td>
                  </tr>
                <tr align="left" valign="top">
                  <td class="asd">Land Area</td>
                  <td><input type="text" name="area" value="" class ="required number"/></td>
                  </tr>
                <tr align="left" valign="top">
                  <td class="asd">Carbon Dioxide Emission(ppmv)</td>
                  <td><input type="text" name="co2emission" value="" class ="required number"/></td>
                  </tr>
                <tr align="left" valign="top">
                  <td class="asd">Carbon Monoxide Emission(ppmv)</td>
                  <td><input type="text" name="o2emission" value="" class ="required number"/></td>
                  </tr>
                <tr align="left" valign="top">
                  <td class="asd">Water Pollution Index</td>
                  <td><input type="text" name="pollutedwater" value="" class ="required number"/></td>
                  </tr>
                <tr align="left" valign="top">
                  <td><input type="submit" value="Submit" /></td>
                  </tr>
                </table>
            </div>
        </form>
    </body>
</html>
