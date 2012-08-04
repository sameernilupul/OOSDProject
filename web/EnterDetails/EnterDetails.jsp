<%-- 
    Document   : EnterDetails
    Created on : Mar 10, 2012, 1:17:16 AM
    Author     : sameernilupul
--%>

<%@page import="human.Person"%>
<%@page import="human.User"%>
<%@page import="database.DataBaseHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        if (session.getAttribute("user") == null) {
    %> <meta http-equiv="REFRESH" content="0;url=../Login/Login.jsp"><%            } else {
        Person user = (Person) session.getAttribute("user");
        if (user.getAcsessLevel() != 3 && user.getAcsessLevel() != 0) {
    %> <meta http-equiv="REFRESH" content="0;url=../Login/Login.jsp"><%                        }
        }
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter Data</title>
        <script type="text/javascript" src="../js/jquery.js" ></script>
        <script type="text/javascript" src="../js/jquery-validation-1.9.0/jquery.validate.min.js"></script>
        <script type="text/javascript" >
            $(document).ready(function()  {
                $("#detail").validate();
            });
        </script>
        <style type="text/css">
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
    <body>
        <form action="SubmitDetails.jsp" id ="detail">
            <table border = "0">
                <tr align="left" valign="top">
                    <td><h1>Enter Location Data</h1></td>
                </tr>

                <tr align="left" valign="top">
                    <td>Location Name</td>
                    <td><input type="text" name="name" value="" /></td>
                </tr>        

                <tr align="left" valign="top">
                    <td><h1>Air Information</h1></td>
                </tr>
                <tr align="left" valign="top">
                    <td>CO2 Concentration</td>
                    <td><input type="text" name="CO2_concentration" value="" class ="required number"/></td>
                </tr>
                <tr align="left" valign="top">
                    <td>O2 concentration</td>
                    <td><input type="text" name="O2_concentration" value="" class ="required number"/></td>
                </tr>
                <tr align="left" valign="top">
                    <td>Dust Level</td>
                    <td><input type="text" name="dustLevel" value="" class ="required number"/></td>
                </tr>
                <tr align="left" valign="top">
                    <td>Air quality level</td>
                    <td><input type="text" name="airQualityLevel" value="" class ="required number"/></td>
                </tr>

                <tr align="left" valign="top">
                    <td><h1>Water Information</h1></td>
                </tr>
                <tr align="left" valign="top">
                    <td>Water Type</td>
                    <td><select name="watertype">
                            <option value="1.0">කරදිය</option>
                            <option value="2.0">මිරිදිය</option>
                        </select></td>
                </tr>

                <tr align="left" valign="top">
                    <td>Percentage</td>
                    <td><input type="text" name="percentage" value="" class ="required number"/></td>
                </tr>
                <tr align="left" valign="top">
                    <td>Water Quality Index</td>
                    <td><input type="text" name="waterQualityIndex" value="" class ="required number"/></td>
                </tr>

                <tr align="left" valign="top">
                    <td><h1>Population Details</h1></td>
                </tr>
                <tr align="left" valign="top">
                    <td>Population Density</td>
                    <td><input type="text" name="populationDensity" value="" class ="required number"/></td>
                </tr>
                <tr align="left" valign="top">
                    <td>Green Precentage</td>
                    <td><input type="text" name="greenPercentage" value="" class ="required number"/></td>
                </tr>
                <tr align="left" valign="top">
                    <td>Land precentage coverd by buildings</td>
                    <td><input type="text" name="building" value="" class ="required number"/></td>
                </tr>
                <tr align="left" valign="top">
                    <td><input type="submit" value="Submit " name="submit" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
