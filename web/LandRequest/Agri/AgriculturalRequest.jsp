<%-- 
    Document   : AgriculturalRequest
    Created on : Mar 20, 2012, 2:28:57 AM
    Author     : sameernilupul
--%>

<%@page import="human.Person"%>
<%@page import="human.Manager"%>
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
                                $("#agri").validate();
                            });
                        </script>
    <style type="text/css">
    .naw {
	color: #FFF;
}
    #header-wrapper #header #logo h1 a {
	color: #FFF;
}
    .asd {
	color: #FFF;
}
    asd {
	color: #FFF;
}
    #header-wrapper #header #logo h1 a u {
	font-size: larger;
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
        <title>Agricultural Land Request</title>
</head>
    <BODY background="img07.jpg">
    <p></p>
    <div id="header-wrapper">
		<div id="header">
			<div id="logo">
				<h1 align="center"><a href=""><u>MINISTRY OF ENVIRONMENT</u></a></h1>
				<p align="center"><span class="asd">SERVICE CENTER</span></p>
				<p align="center">AGRICULTURAL REQUEST				</p>
				<p align="center">&nbsp;</p>
				<p align="center">&nbsp;</p>
				<p>&nbsp;</p>
		  </div>
		</div>
    </div>
    <form action="SubmitAgriRequest.jsp" id ="agri">
        
          <div align="center">
            <table border = "0">
              <tr align="left" valign="top">
                <td class="naw"><table border = "0">
                  <tr align="left" valign="top" class="naw">
                    <td width="160"><h1>Agriculture</h1></td>
                  </tr>
                  <tr align="left" valign="top">
                    <td class="naw">Your Email</td>
                    <td width="212"><input type="text" name="email" value="" class ="required email"/></td>
                  </tr>
                  <tr align="left" valign="top">
                    <td class="naw">Title</td>
                    <td><input type="text" name="title" value="" class ="required"/></td>
                  </tr>
                  <tr align="left" valign="top">
                    <td class="naw">Description</td>
                    <td><textarea name="description" rows="4" cols="50" class ="required"></textarea></td>
                  </tr>
                  <tr align="left" valign="top">
                    <td class="naw">Land Area</td>
                    <td><input type="text" name="area" value="" class ="required number"/></td>
                  </tr>
                  <tr align="left" valign="top">
                    <td class="naw">Organic Crops</td>
                    <td><input type="checkbox" name="organic" value="ON" /></td>
                  </tr>
                  <tr align="left" valign="top">
                    <td class="naw">Long Term Crop</td>
                    <td><input type="checkbox" name="time" value="ON" /></td>
                  </tr>
                  <tr align="left" valign="top">
                    <td class="naw">What is your crop?</td>
                    <td><input type="text" name="crop" value="" class ="required"/></td>
                  </tr>
                  <tr align="left" valign="top">
                    <td><input type="submit" value="Submit" /></td>
                  </tr>
                </table></td>
              </tr>
            </table>
          </div>
    </form>
    </body>
</html>
