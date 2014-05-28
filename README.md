BaiduMapDemo
============
this demo use Baidu Map API to realize these functions.    
I.
Demo name：Map basic function  
File name：    BaseMapDemo.java    
  
Brief introduction：Create a map and manage the life cycle of the map.  
Description：   
(1) Create a Baidu map.   
(2) Manage the life cycle of the map. Detailed descriptions in code comments.   
(3) Can listen the map of loading and completing events.   
   
II.  
Demo name：Map display function   
File name：    LayersDemo.java    
   
Brief introduction：Display normal map, satellite map and traffic map.    
Description：     
(1) Choose normal map, satellite map as the diplay map layer.     
(2) Superimposed traffic map on top of normal map or satellite map.     
     
III.     
Demo name：Map operation function    
File name：    MapControlDemo.java    
     
Brief introduction：Pan and zoom the map with two fingers. Listen map clicking event.    
Description：   
(1) Introduce get and set methods of zoom level, rotation degreee and overlooking degree.       
(2) Listen one-click and press-and-hold event.      
(3) Obtain Latitude and longitude coordinates with one-click, double-click and press-and-hold operation.       
(4) Screenshot with the map. Screenshot address：/mnt/sdcard/test.png.       
   
IV.   
Demo name：UI control   
File name：    UISettingsDemo.java   
   
Brief introduction：Introduce gesture function and display hidden UI tools.   
Description：   
(1) map operation switch: pan, zoom, double-click zoom, two-finger operation(rotation and overlooking degrees)   .   
(2) Control box display switch: display and hide zoom button.       
(3) Compass location control: display in any places you customize like the upper left corner or right corner.      
   
V.   
Demo name：Map locating function         
File name：    LocationOverlayDemo.java    
            
Brief introduction：Introduce the function of locating map layer.      
Description：    
(1) Suppport change place icons.       
(2) Support tri-state locating effects(normal state, following state and compass state) .      
(3) Detailed in Locating SDK Dev Guide.       
    
VI.  
Demo name：Custom drawing function  
File name：    GeometryDemo.java    

Brief introduction：Custom drawing point, line, polygons, circles and other geometric shapes and texts.  
Description：  
(1) Support drawing polygons.   
(2) Support drawing texts.   

VII.
Demo name：Overlaying function  
File name：    OverlayDemo.java  

Brief introduction：Introduce how to add overlaying and reponse and pop function.   
Description：   
(1) Add customized View examples in popup.   
(2) Click the four surrounded Marker, pop popup, update marker address and marker icon.   
(3) The middle is picture layer which can do corresponding operations with the zoom, pan of map.   

VIII.   
Demo name：POI search function   
File name：    POISearchDemo.java    

Brief introduction：Keyword search, suggestion search function     
Description：   
(1) Click the keyword search result and jump to Place Information pages.   
(2) Provide suggestion search to do asscociation search.   

IX.
Demo name：Geographic encoding function
File name：    GeoCodeDemo.java

Brief introduction：Transform between address info and address coordinate.   
Description：  
(1) Forward geocoding: Transform the address information to latitude and longitude coordinates.   
(2) Reverse geocoding: Transform the latitude and longitude coordinates to address information.   

X.
Demo name：Path planing function
File name：    RoutePlanDemo.java, CustomRouteOverlay.java

Brief introduction：Three ways to plan path and custom path planing.     
Description：      
(1) Drive path search function，detailed in Dev Guide path planning section(override the interfaces).            
(2) Customize path function can display how developers set a path, including how to set start station, end station, route station.   
(3) Customize path function can also introduce how to manage Mapview life cycle between Activitys.   
(4) Customize the start and end info of search lines.   

XI.
Demo name：Bus lines search function
File name：    BusLineDemo.java

Brief introduction：Bus lines search function   
(1) Click "open" button to search bus lines.   
(2) After bus lines search click "The next one" button to search the reverse bus lines.    

XII.
Demo name：Offline map function File name：   OfflineDemo.java

Brief introduction：Download and use offline map.      
Description：      
(1) Search, download, delete and lookup offline map.                            
(2) "Scan offline map": SDK supports importing offline packages. Unzip the offline packages, and put the vmp file into /BaiduMaoSdk/ in SD card root directory.  

XIII.
Demo name：Navigation function
File name：    NaviDemo.java

Brief introduction：Introduce how to invoke Baidu map navigation function.     

XIV.  
Demo name：LBS cloud search function  
File name：    CloudSearchDemo.java  

Brief introduction：Search private data using LBS cloud.     
Description：        
(1) LBS Cloud is a platform service of Baidu map.  
(2) Provide massive address data storage, search and displaying.  
(3) This service is open to developers.  
(4) The test ak is in this Demo. You can replace the wk with your own ak.  
(5) Welcome LBS Cloud.  
(6) Questions about ak request and data management, welcome LBS Open Platform.  

XV.
Demo name：Short string share function  
File name：    ShareDemo.java  

Brief introduction：Share with your friends in short URL generated from POI point or anti-Geo point.        
Description：         
(1) Generate short URL string from POI point or anti-Geo point. One can share this string with his or her friends in SMS.  
(2) Friends can open Web map quickly by clicking this URL in their terminal devices, can display the Info.   
(3) Open the function "POI search results share" and "Reverse Geo encoding results share".   
(4) More function will be open later on. Welcome more people use this function.  


