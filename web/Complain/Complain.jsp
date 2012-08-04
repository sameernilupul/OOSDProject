<%-- 
    Document   : Complain
    Created on : Mar 16, 2012, 3:52:55 AM
    Author     : sameernilupul
--%>

<%@page import="urlgenerator.BasicMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        double lo = Double.parseDouble((String)session.getAttribute("long"));
        double la = Double.parseDouble((String)session.getAttribute("lati"));
        BasicMap map = new BasicMap((short)15, 300, 300, true, lo,la);
        String url = map.addPoint(lo, la);
            
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Make Complain</title>
        <script type="text/javascript" src="../js/jquery.js" ></script>
                        <script type="text/javascript" src="../js/jquery-validation-1.9.0/jquery.validate.min.js"></script>
                        <script type="text/javascript" >
                            $(document).ready(function()  {
                                $("#form2").validate();
                            });
                        </script>
    <style type="text/css">
    #form1 div {
	color: #FFF;
	font-size: xx-large;
}
    .ASDF {
	font-size: large;
}
    .SDSA {
	color: #FFF;
}
    .DSASD {
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
    
    <form id="form1" name="form1" method="post" action="">
<label for="title">       
                        <div align="center">MINISTRY OF ENVIRONMENT<br />
      SERVICE CENTER</div>
      <div align="center"><span id="form1">
      </label>
      </span><span class="aaa"> <span class="ASDF">COMPLAIN</span></span></div>
</form>
        <h1 class="SDSA">Make Complain</h1>
        <form action="SubmitComplain.jsp" id ="form2">
          <div align="center">
            <table border = "0">
              <tr align="left" valign="top">
                <td class="DSASD">Your Location</td>
                <td><img src="<%=url%>" width="300" height="300"/>
                  </td>
                </tr>
              <tr align="left" valign="top">
                <td class="DSASD">Your Email</td>
                <td><input type="text" name="email" value="" class ="required email"/></td>
                </tr>
              <tr align="left" valign="top">
                <td class="DSASD">Title</td>
                <td><input type="text" name="title" value="" class ="required"/> </td>
                </tr>
              <tr align="left" valign="top">
                <td class="DSASD">Complain</td>
                <td><textarea name="complain" rows="4" cols="50" class =" required"></textarea></td>
                </tr>
              
              <tr align="left" valign="top">
                <td><input type="submit" value="Submit" /></td>
                </tr>
              </table>
          </div>
        </form>

    </body>
</html>
