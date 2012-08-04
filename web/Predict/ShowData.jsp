<%-- 
    Document   : ShowData
    Created on : Mar 23, 2012, 9:46:16 PM
    Author     : sameernilupul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Predicted Data</title>
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
          var myHtml = "Latitude: " + latlng.lat() + "<br/>Longitude: " + latlng.lng() + 
            "<br/>The Tile Coordinate is:<br/> x: " + tileCoordinate.x + 
            "<br/> y: " + tileCoordinate.y + "<br/> at zoom level " + map.getZoom();	
          map.openInfoWindow(latlng, myHtml);
        });
      }
    }
    </script>
    </head>
    <body>
        <body onload="initialize()" onunload="GUnload()">
        <div id="map_canvas" style="width: 1000px; height: 500px"></div>
        </body>
    </body>
</html>
