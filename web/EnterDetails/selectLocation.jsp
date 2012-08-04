<%-- 
    Document   : selectLocation
    Created on : Mar 22, 2012, 7:46:44 PM
    Author     : sameernilupul
--%>

<%@page import="human.Person"%>
<%@page import="human.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <% 
        if(session.getAttribute("user") == null){
            %> <meta http-equiv="REFRESH" content="0;url=../Login/Login.jsp"><%
        }else{
            Person user =(Person)session.getAttribute("user");
            if(user.getAcsessLevel()!=3 &&user.getAcsessLevel()!=0){
                %> <meta http-equiv="REFRESH" content="0;url=../Login/Login.jsp"><%
            }
        }
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Select Location</title>
    </head>
     <script src="//maps.google.com/maps?file=api&amp;v=2&amp;key=AIzaSyD4iE2xVSpkLLOXoyqT-RuPwURN3ddScAI"
            type="text/javascript"></script>
    <script type="text/javascript">	
    function initialize() {
      if (GBrowserIsCompatible()) {
      
        var map = new GMap2(document.getElementById("map_canvas"));
        map.setCenter(new GLatLng(7.4931, 80.7275), 6);
        map.setUIToDefault();

        GEvent.addListener(map,"click", function(overlay,latlng) {
          if (overlay) {
            // ignore if we click on the info window
            return;
          }
          var tileCoordinate = new GPoint();
          var tilePoint = new GPoint();
          var currentProjection = G_NORMAL_MAP.getProjection();
          tilePoint = currentProjection.fromLatLngToPixel(latlng, map.getZoom());
          tileCoordinate.x = Math.floor(tilePoint.x / 256);
          tileCoordinate.y = Math.floor(tilePoint.y / 256);
          
          window.location.href="setlocation.jsp?value=" +latlng.lat() + " "+latlng.lng(); 
          //var myHtml = "Latitude: " + latlng.lat() + "<br/>Longitude: " + latlng.lng() + 
          //  "<br/>The Tile Coordinate is:<br/> x: " + tileCoordinate.x + 
          //  "<br/> y: " + tileCoordinate.y + "<br/> at zoom level " + map.getZoom();	
          //map.openInfoWindow(latlng, myHtml);
        });
      }
    }
    </script>
    <body onload="initialize()" onunload="GUnload()">
        <h1>Select Your Location</h1>
        <div id="map_canvas" style="width: 1000px; height: 500px"></div>
    </body>
</html>
