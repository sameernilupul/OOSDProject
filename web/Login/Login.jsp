<%@page import="human.Person"%>
<%@page language="java" session="true" contentType="text/html;charset=ISO-8859-1"  %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <%
        if (session.getAttribute("user") != null) {
            Person user = (Person) session.getAttribute("user");
            if (user.getAcsessLevel() == 0) {
    %> <meta http-equiv="REFRESH" content="0;url=../AdministorAccount/AdminHome.jsp"><%                } else if (user.getAcsessLevel() == 4) {
        %> <meta http-equiv="REFRESH" content="0;url=../Home.html"><%                } else if (user.getAcsessLevel() == 3) {
            %> <meta http-equiv="REFRESH" content="0;url=../EnterDetails/selectLocation.jsp"><%                } else {
                %> <meta http-equiv="REFRESH" content="0;url=../Manager/Manager.jsp"><%                        }
                    }
                    %>

                    <head>
                        </p>
                        <style type="text/css">
                            .loginSTYLE {
                                color: #FFF;
                            }
                            .LOGINstyle {
                                color: #FFF;
                            }
                            #form1 label div {
                                font-size: 16px;
                            }
                            #form1 label div {
                                font-size: x-large;
                                color: #FFF;
                            }
                            .new {
                                color: #FFF;
                            }
                            #form1 div {
                                font-size: xx-large;
                                color: #FFF;
                            }
                            
                        </style>
                        <BODY background="img07.jpg">
                            <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
                                <title>User Login</title>
                                <p>&nbsp;	</p>
                                <form id="form1" name="form1" method="post" action="">
                                    <label for="title">       
                                        <div align="center">Ministry of Environment<br />
                                            service center
                                        </div>
                                    </label>
                                </form>
                                <p>&nbsp;</p>
                                <link rel="stylesheet" href="style.css" type="text/css">
                                    <span class="loginSTYLE"><code>
                                            </link>
                                        </code></span><span class="LOGINstyle"><code>
                                            <script language="JavaScript" type="text/JavaScript" src="validate.js"></script>


                                        </code>
                                    </span>
                                    <form onSubmit="return validate(this)" action="chechpoint.jsp" id ="loginform">
                                        <table border = "0">
                                            <tr align="left" valign="top">
                                                <td><p>&nbsp;</p></td>
                                            </tr>

                                            <tr align="left" valign="top">
                                                <td class="new"><code>User Name:</code></td>
                                                <td class="LOGINstyle"><code>
                                                        <input type="text" name ="user" class="required"/>
                                                    </code></td>
                                            </tr>
                                            <tr align="left" valign="top">
                                                <td class="new"><code>Password:</code></td>
                                                <td class="LOGINstyle"><code>
                                                        <input type="password" name ="pass" class="required"/>
                                                    </code></td>
                                            </tr>
                                            <tr align="left" valign="top">
                                                <td></td>
                                                <td class="LOGINstyle"><code>
                                                        <input type="submit" name="submit" value="submit" class="submitButton"/>
                                                    </code></td>
                                            </tr>
                                        </table>
                                        <span class="LOGINstyle"><code><br>
                                            </code></span><span class="loginSTYLE"><code><a href="../AddUser/AddUser.jsp">Sign up</a></br>
                                            </code></span>  
                                    </form>
                                    <p>&nbsp;</p>
                                    <p>&nbsp;</p>
                                    <p>&nbsp;</p>
