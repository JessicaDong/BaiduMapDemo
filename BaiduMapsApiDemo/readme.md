##**Baidu Map Android SDK Sample Demo.**  

- - -
I.  
Demo name：Map basic function  
File name：&nbsp; &nbsp; BaseMapDemo.java 
 
Brief introduction：Create a map and manage the life cycle of the map.  
Description：    
(1)  Create a Baidu map.     
(2)  Manage the life cycle of the map. Detailed descriptions in code comments.  
(3)  Can listen the map of loading and completing events.    
- - -

II.    
Demo name：Map display function  
File name：&nbsp; &nbsp; LayersDemo.java

Brief introduction：Display normal map, satellite map and traffic map.  
Description：  
(1) Choose normal map, satellite map as the diplay map layer.    
(2) Superimposed traffic map on top of normal map or satellite map.  
- - -
III.   
Demo name：Map operation function  
File name：&nbsp; &nbsp; MapControlDemo.java

Brief introduction：Pan and zoom the map with two fingers. Listen map clicking event.
Description：  
(1) Introduce get and set methods of zoom level, rotation degreee and overlooking degree.  
(2) Listen one-click and press-and-hold event.  
(3) Obtain Latitude and longitude coordinates with one-click, double-click and press-and-hold     operation.   
(4) Screenshot with the map. Screenshot address：/mnt/sdcard/test.png.  
- - -
IV.   
Demo name：UI control  
File name：&nbsp; &nbsp; UISettingsDemo.java

Brief introduction：Introduce gesture function and display hidden UI tools.
Description：  
(1) map operation switch: pan, zoom, double-click zoom, two-finger operation(rotation and overlooking degrees).  
(2) Control box display switch: display and hide zoom button.  
(3) Compass location control: display in any places you customize like the upper left corner or right corner.  
- - -
V.   
Demo name：Map locating function  
File name：&nbsp; &nbsp; LocationOverlayDemo.java

Brief introduction：Introduce the function of locating map layer.  
Description：  
(1) Suppport change place icons.  
(2) Support tri-state locating effects(normal state, following state and compass state) .  
(3) Detailed in [Locating SDK Dev Guide](http://developer.baidu.com/map/geosdk-android.htm).  
- - -
VI.    
Demo name：Custom drawing function  
File name：&nbsp; &nbsp; GeometryDemo.java

Brief introduction：Custom drawing point, line, polygons, circles and other geometric shapes and texts.  
Description：  
(1) Support drawing polygons.  
(2) Support drawing texts.  
- - -
VII.    
Demo name：Overlaying function  
File name：&nbsp; &nbsp; OverlayDemo.java

Brief introduction：Introduce how to add overlaying and reponse and pop function.   
Description：  
(1) 在popup中添加弹出自定义View的示例.  
(2) 点击周围4个Marker，弹出popup,可更新marker位置和更新marker图标.  
(3) 中间显示的为图片图层，该图层可随地图的移动、缩放等做出相应的操作.  
- - -
VIII.  
Demo name：POI search function   
File name：&nbsp; &nbsp; POISearchDemo.java

Brief introduction：Keyword search, suggestion search function   
Description：  
(1) Click the keyword search result and jump to Place Information pages.  
(2) Provide suggestion search to do asscociation search. 
- - -
IX.    
Demo name：Geographic encoding function  
File name：&nbsp; &nbsp; GeoCodeDemo.java

Brief introduction：Transform between address info and address coordinate.  
Description：  

(1) Forward geocoding: Transform the address information to latitude and longitude coordinates.   
(2) Reverse geocoding: Transform the latitude and longitude coordinates to address information.

- - -
X.   
Demo name：Path planing function  
File name：&nbsp; &nbsp; RoutePlanDemo.java, CustomRouteOverlay.java

Brief introduction：Three ways to plan path and custom path planing.  
Description：  
(1) 驾车查询新增路径点查询 function   ，具体使用方法详见开发者指南路径规划部分，只需重载接口.  
(2) 自设路线 function   演示开发者如何自己设定一条路线，包括如何设定起点、终点、途径站点和路段.  
(3) 自设路线 function   同时也介绍如何在两个Activity之间切换的时候管理Mapview的生命周期.  
(4) 可自定义路线的起终点图标.  
- - -
XI.    
Demo name：Bus lines search function   
File name：&nbsp; &nbsp; BusLineDemo.java

Brief introduction：Bus lines search function   
(1) Click "open" button to search bus lines.  
(2) After bus lines search click "The next one" button to search the reverse bus lines.   
- - -
XII.    
Demo name：Offline map function 
File name：&nbsp; &nbsp;OfflineDemo.java

Brief introduction：Download and use offline map.  
Description：  
(1) 可以搜索、下载、删除、查看离线地图.  
(2) “扫描离线地图”：
SDK支持导入离线包，将从官方渠道下载的离线包解压，把其中的vmp文件拷入SD卡根目录的BaiduMapSdk文件夹内.  
- - -
XIII.    
Demo name：Navigation function  
File name：&nbsp; &nbsp; NaviDemo.java

Brief introduction：Introduce how to invoke Baidu map navigation function.   
Description：  
(1) 若手机未安装符合要求的百度地图客户端，会首先提示下载.  
- - -
XIV.    
Demo name：LBS cloud search function  
File name：&nbsp; &nbsp; CloudSearchDemo.java

Brief introduction：Search private data using LBS cloud.    
Description：  
(1) LBS.  云是百度地图针对LBS开发者推出的平台级服务.  
(2) 提供海量位置数据存储、检索、展示一体化解决方案.  
(3) 该服务对开发者免费开放.  
(4) Demo中放入了测试用ak，开发者若使用自己的数据，请更换为自己的ak.  
(5) LBS.  云检索使用方法请参考开发指南“LBS云服务”部分.  
(6) Welcome [LBS Cloud](http://developer.baidu.com/map/lbs-cloud.htm).  
(7) Questions about ak request and data management, welcome [LBS Open Platform](http://lbsyun.baidu.com/).
- - -
XV.    
Demo name：短串分享 function   
File name：&nbsp; &nbsp; ShareDemo.java

Brief introduction：将POI点、反Geo点生成短链接以分享给好友  
Description：  
(1) 将POI点、反Geo点，生成短链接串，此链接可通过短信等形式分享给好友.  
(2) 好友在终端设备点击此链接可快速打开Web地图、百度地图客户端进行信息展示.  
(3) 暂时开放了“POI搜索结果分享”和“反向地理编码结果分享”.  
(4) 日后会开放更多的 function   ，欢迎广大开发者使用短串分享function.  
- - -
