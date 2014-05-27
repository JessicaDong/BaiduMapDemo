package baidumapsdk.demo;

import java.util.List;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import baidumapsdk.demo.LocationOverlayDemo.MyLocationListenner;
//从这里开始添加引入包
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
//添加至这里结束

import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.cloud.BoundSearchInfo;
import com.baidu.mapapi.cloud.CloudListener;
import com.baidu.mapapi.cloud.CloudManager;
import com.baidu.mapapi.cloud.CloudPoiInfo;
import com.baidu.mapapi.cloud.CloudSearchResult;
import com.baidu.mapapi.cloud.DetailSearchInfo;
import com.baidu.mapapi.cloud.DetailSearchResult;
import com.baidu.mapapi.cloud.LocalSearchInfo;
import com.baidu.mapapi.cloud.NearbySearchInfo;
import com.baidu.mapapi.map.ItemizedOverlay;
import com.baidu.mapapi.map.LocationData;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.OverlayItem;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.mapapi.map.MyLocationOverlay;  //


public class CloudSearchActivity extends Activity implements CloudListener {
    
    MapView mMapView;


    
    //LocationOverlayDemo locdemo = new LocationOverlayDemo();
    
   //定位初始化
   // LocationClient mLocClient;
   // LocationData locData = locdemo.locData;
 //   public MyLocationListenner myListener = new MyLocationListenner();
double lat=116.403689,lon=39.914957;
private TextView tv1;
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        DemoApplication app = (DemoApplication)this.getApplication();
        if (app.mBMapManager == null) {
            app.mBMapManager = new BMapManager(this);
            app.mBMapManager.init(DemoApplication.strKey,new DemoApplication.MyGeneralListener());
        }
        setContentView(R.layout.lbssearch);
        CloudManager.getInstance().init(CloudSearchActivity.this);
        
    
       
    /*
        //实例化定位服务，LocationClient类必须在主线程中声明  
                mLocClient = new LocationClient(getApplicationContext());  
                mLocClient.registerLocationListener(new BDLocationListenerImpl());//注册定位监听接口  
                  
                
                 * LocationClientOption 该类用来设置定位SDK的定位方式。 
                 
                LocationClientOption option = new LocationClientOption();  
                option.setOpenGps(true); //打开GPRS  
                option.setAddrType("all");//返回的定位结果包含地址信息  
                option.setCoorType("bd09ll");//返回的定位结果是百度经纬度,默认值gcj02  
                option.setPriority(LocationClientOption.GpsFirst); // 设置GPS优先  
                option.setScanSpan(5000); //设置发起定位请求的间隔时间为5000ms  
                option.disableCache(false);//禁止启用缓存定位  
        //      option.setPoiNumber(5);    //最多返回POI个数     
        //      option.setPoiDistance(1000); //poi查询距离          
        //      option.setPoiExtraInfo(true);  //是否需要POI的电话和地址等详细信息          
                mLocClient.setLocOption(option);  //设置定位参数  
                  
                  
                mLocClient.start();  // 调用此方法开始定位  

                //实例化定位数据，并设置在我的位置图层  
                        mLocData = new LocationData();  
                        myLocationOverlay.setData(mLocData);  
                          
                        //添加定位图层  
                        mMapView.getOverlays().add(myLocationOverlay);  

        */
        
        
        
        mMapView = (MapView)findViewById(R.id.bmapView);
        mMapView.getController().enableClick(true);
        mMapView.getController().setZoom(12);
        mMapView.setDoubleClickZooming(true);
        mMapView.setBuiltInZoomControls(true);  //设置启用内置的缩放控件
        
        //显示得到的定位点信息
        tv1=(TextView)findViewById(R.id.tv1);
        //这里添加了定位btn方法
        Button button=(Button)findViewById(R.id.btnloc); 
      button.setOnClickListener(
        	 new OnClickListener ()
        
        {
        	@Override
        	public void onClick(View v)
        	{
        	//LocationManager locationmanager = (LocationManager) CloudSearchActivity.this.getSystemService(Context.LOCATION_SERVICE);
        	//locationmanager.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,new MyLocationListener());
        		 // TODO Auto-generated method stub        
        		String serviceString=Context.LOCATION_SERVICE;            
        		LocationManager locationManager=(LocationManager)getSystemService(serviceString);        
        		String provider=LocationManager.GPS_PROVIDER;              
        		Location location=locationManager.getLastKnownLocation(provider);          
        		//getLocationInfo(location);   
        	
        		locationManager.requestLocationUpdates(provider, 2000, 0,locationListener); 
        		lat=location.getLatitude();         
           	 lon=location.getLongitude();   
           	 

				String loclat1 = Double.toString(lat) ;
				String loclon1 = Double.toString(lon) ;
				String str = loclat1+","+loclon1;
				 tv1.setText("经纬度"+lat+lon);
				
        	}
        });
      
       
        
        
        findViewById(R.id.regionSearch).setOnClickListener(
				new OnClickListener() {
					@Override
					public void onClick(View v) {
						LocalSearchInfo info = new LocalSearchInfo();
						//info.ak = "B266f735e43ab207ec152deff44fec8b";
						info.ak = "A4749739227af1618f7b0d1b588c0e85";
						//info.geoTableId = 31869;
						info.geoTableId = 30960;
						info.tags = "";
						info.q="";
						info.region = "北京市西城区";
						CloudManager.getInstance().localSearch(info);
					}
				});
		findViewById(R.id.nearbySearch).setOnClickListener(
				new OnClickListener() {
					//EditText editSearchDistance1 = (EditText)findViewById(R.id.distance1);
					//int dis =Integer.parseInt(editSearchDistance1.getText().toString());
					public void onClick(View v) {
						NearbySearchInfo info = new NearbySearchInfo();
						//info.ak = "D9ace96891048231e8777291cda45ca0";
						Log.i("s1", "调起附近搜索");
						info.ak = "EUstZMYGkNa8yhnlGdwaGDeo";
						Log.i("s2", "验证key");
						//info.ak = "A4749739227af1618f7b0d1b588c0e85";
						//info.geoTableId = 32038;
						//info.geoTableId = 48046;
						//info.geoTableId = 30960;
						info.geoTableId = 48141;
						Log.i("s3", "验证图层");
						//info.filter="time:20130801,20130810";
						//info.location = "116.403689,39.914957";
						info.location = "116.3976642,39.98347871";
						Log.i("s4", "验证定位");
						/*
						String loclat1 = Double.toString(lat) ;
						String loclon1 = Double.toString(lon) ;
						String str = loclat1+","+loclon1;
						*/
						//info.location = str;
					  //  tv1.setText("经纬度"+lat+lon);
						//info.location = "113.020447,22.48599";
						//info.radius = 30000;
						
					/*
						String serviceString=Context.LOCATION_SERVICE;     
						 LocationManager locationManager=(LocationManager)getSystemService(serviceString);       
						 String provider=LocationManager.GPS_PROVIDER;              
						 Location location=locationManager.getLastKnownLocation(provider);            
						 getLocationInfo(location);                              
						 locationManager.requestLocationUpdates(provider, 2000, 0, locationListener); 
						 String loclat1 = Double.toString(location.getLatitude()) ;
							String loclon1 = Double.toString(location.getLongitude()) ;
							String str = loclat1+","+loclon1;
							//info.location = str;
							tv1.setText("经纬度"+lat+lon);
					*/
						
						EditText editSearchDistance1 = (EditText)findViewById(R.id.distance1);
						int dis =Integer.parseInt(editSearchDistance1.getText().toString());
						info.radius = dis;
						CloudManager.getInstance().nearbySearch(info);
					}
				});

		findViewById(R.id.boundsSearch).setOnClickListener(
				new OnClickListener() {
					public void onClick(View v) {
						BoundSearchInfo info = new BoundSearchInfo();
						info.ak = "B266f735e43ab207ec152deff44fec8b";
						info.geoTableId = 31869;
						info.q = "天安门";
						info.bound="116.401663,39.913961;116.406529,39.917396";
						CloudManager.getInstance().boundSearch(info);
					}
				});
		findViewById(R.id.detailsSearch).setOnClickListener(
				new OnClickListener() {
					public void onClick(View v) {
						DetailSearchInfo info = new DetailSearchInfo();
						info.ak = "B266f735e43ab207ec152deff44fec8b";
						info.geoTableId = 31869;
						info.uid = 18622266;
						CloudManager.getInstance().detailSearch(info);
					}
				});
    }
    
   /* 
    public class BDLocationListenerImpl implements BDLocationListener {  
    	  
    	        
    	        // * 接收异步返回的定位结果，参数是BDLocation类型参数 
    	          
    	        @Override  
    	        public void onReceiveLocation(BDLocation location) {  
    	            if (location == null) {  
    	                return;  
    	            }  
    	            locData.latitude = location.getLatitude();
    	            locData.longitude = location.getLongitude();
    	        }
    }
*/
    private void getLocationInfo(Location location) 
    {   
    	//String latLongInfo;       
    	//TextView lo=(TextView)findViewById(R.id.textView1);        
    	if(location!=null){           
    	 lat=location.getLatitude();         
    	 lon=location.getLongitude();         
    		//latLongInfo="Lat:"+lat+"\nLong:"+lng;       
    		//lo.setText(latLongInfo);         }
    	//else {          
    		//latLongInfo="No location found";       
    		//lo.setText(latLongInfo);      
    		//}     
    	} 
    }
//这里开始加
    private final LocationListener locationListener =new LocationListener() {    
    	@Override        
    	public void onStatusChanged(String provider, int status, Bundle extras) {     
    		// TODO Auto-generated method stub                  
    		}      
    		@Override       
    		public void onProviderEnabled(String provider) {       
    			getLocationInfo(null);                     
    			}            
    		@Override       
    		public void onProviderDisabled(String provider) {   
    			getLocationInfo(null);            
    			}              
    		@Override       
    		public void onLocationChanged(Location location) {    
    			getLocationInfo(location);      
    			//Toast.makeText(MainActivity.this, "位置改变了::::::::::::", 3000).show();     
    			}   
    		}; 
    	
   
    
    @Override
    protected void onDestroy() {
        mMapView.destroy();
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        mMapView.onPause();
        super.onPause();
    }
    
    @Override
    protected void onResume() {
        mMapView.onResume();
        super.onResume();
    }
    
    @Override
    protected void onSaveInstanceState(Bundle outState) {
    	super.onSaveInstanceState(outState);
    	mMapView.onSaveInstanceState(outState);
    	
    }
    
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
    	super.onRestoreInstanceState(savedInstanceState);
    	mMapView.onRestoreInstanceState(savedInstanceState);
    }

	public void onGetDetailSearchResult(DetailSearchResult result, int error) {
		if (result != null) {
            if (result.poiInfo != null) {
                Toast.makeText(CloudSearchActivity.this, result.poiInfo.title, Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(CloudSearchActivity.this, "status:" + result.status, Toast.LENGTH_SHORT).show();
            }
        }
	}

	public void onGetSearchResult(CloudSearchResult result, int error) {
		if (result != null && result.poiList!= null && result.poiList.size() > 0) {
            CloudOverlay poiOverlay = new CloudOverlay(this,mMapView);
            poiOverlay.setData(result.poiList);
            mMapView.getOverlays().clear();
            mMapView.getOverlays().add(poiOverlay);
            mMapView.refresh();
            mMapView.getController().animateTo(new GeoPoint((int)(result.poiList.get(0).latitude * 1e6), (int)(result.poiList.get(0).longitude * 1e6)));
            //mMapView.getController().animateTo(new GeoPoint((int)(locData.latitude* 1e6), (int)(locData.longitude *  1e6)));
        }
	}
}
class CloudOverlay extends ItemizedOverlay {

    List<CloudPoiInfo> mLbsPoints;
    Activity mContext;
    
    public CloudOverlay(Activity context ,MapView mMapView) {
        super(null,mMapView);
        mContext = context;
    }

    public void setData(List<CloudPoiInfo> lbsPoints) {
        if (lbsPoints != null) {
            mLbsPoints = lbsPoints;
        }
        for ( CloudPoiInfo rec : mLbsPoints ){
            GeoPoint pt = new GeoPoint((int)(rec.latitude * 1e6), (int)(rec.longitude * 1e6));
            OverlayItem item = new OverlayItem(pt , rec.title, rec.address);
            Drawable marker1 = this.mContext.getResources().getDrawable(R.drawable.icon_marka);
            item.setMarker(marker1);
            addItem(item);
        }
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
    
    @Override
    protected boolean onTap(int arg0) {
        CloudPoiInfo item = mLbsPoints.get(arg0);
        Toast.makeText(mContext, item.title,Toast.LENGTH_LONG).show();
        return super.onTap(arg0);
    }
    
}
