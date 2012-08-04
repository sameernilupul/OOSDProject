<%-- 
    Document   : AddUser
    Created on : Mar 23, 2012, 2:18:46 AM
    Author     : sameernilupul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add User</title>
        <script type="text/javascript" src="../js/jquery.js" ></script>
        <script type="text/javascript" src="../js/jquery-validation-1.9.0/jquery.validate.min.js"></script>
        <script type="text/javascript" >
            $(document).ready(function()  {
                $("#adduser").validate({rules: {

                    passwd1: "required",

                    passwd2: {

                        equalTo: "#passwd1"

                    }

                }});
                                
            });
        </script>
        <style type="text/css">
            .aass {
                color: #FFF;
            }
            .sdasd {
                color: #FFF;
            }
            #form1 div {
                color: #F0F0F0;
                font-size: medium;
            }
            .sdsasd {
                font-size: medium;
            }
            Asdsa {
                color: #CCC;
            }
            #form1 div #form1 {
                font-size: large;
            }
            #form1 div #form1 {
                font-size: small;
            }
            .asdasda {
                font-size: small;
            }
            ssadasdasda {
                font-size: large;
            }
            #form1 {
                font-size: large;
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
            REGISTER NEW USER</div>
    </form>

    <h1 class="sdasd">	<span class="asdasda">Enter your details here.</span></h1>
    <form action="SubmitUser.jsp" id ="adduser">
        <div align="center">
            <table border = "0">
                <tr align="left" valign="top">
                    <td class="aass">Your Email</td>
                    <td><input type="text" name="email" value="" class ="required email"/></td>
                </tr>
                <tr align="left" valign="top">
                    <td class="aass">Username</td>
                    <td><input type="text" name="username" value="" class ="required"/> </td>
                </tr>
                <tr align="left" valign="top">
                    <td class="aass">Full Name</td>
                    <td><input type="text" name="name" value="" class ="required"/> </td>
                </tr>
                <tr align="left" valign="top">
                    <td class="aass">NIC No</td>
                    <td><input type="text" name="nic" value="" class ="required"/> </td>
                </tr>
                <tr align="left" valign="top">
                    <td class="aass">Mobile No</td>
                    <td><input type="text" name="mobile" value="" /> </td>
                </tr>
                <tr align="left" valign="top">
                    <td class="aass">Password</td>
                    <td><input type="password" name="passwd1" id ="passwd1" value="" class ="required" minlength="6"/> </td>
                </tr>
                <tr align="left" valign="top">
                    <td class="aass">Re enter password</td>
                    <td><input type="password" name="passwd2" value="" id ="passwd2"/> </td>
                </tr>
                <tr align="left" valign="top" class="aass">
                    <td><input type="submit" value="Submit" /></td>
                </tr>
            </table>
        </div>
    </form>
</body>
</html>
