
package com.db.devchallenge;

import com.db.devchallenge.geolocation.GeoLocation;
import com.db.devchallenge.geolocation.LocationService;
import com.db.devchallenge.geolocation.LocationServiceGMaps;
import com.db.devchallenge.model.Shop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 

@Component
public class ShopsRepository  {

	LocationServiceGMaps oneLocation;
	
	public static final HashMap<String,Shop> allShops = new HashMap<String, Shop>(100);
	//make concurrent hashmap instead of just hashmap
	
	public void getAllShops()
	{
		for (Map.Entry<String, Shop> entry : allShops.entrySet())
		{
			System.out.println("Shop:  " + entry.getKey() + ", Shop details = " + entry.getValue());
		}
		
		
	}

	
	public void someShops()
	
	{  

	allShops.put("Vodafone", new Shop("Vodafone", "Edgware Road", "E161XD",20,40));
		allShops.put("Tesco", new Shop("Tesco", "Marylebone High Street", "NW61TU",50,100));
		//allShops.put("Zara", new Shop("Zara", "Solent Road", "NW61BT",oneLocation.getGeoLocation("NW61BT").getLatitude(),oneLocation.getGeoLocation("NW61BT").getLongitude() ));
		allShops.put("Foot Locker", new Shop("Foot Locker", "Holmdale Road", "SW71AJ"));
		ShopsRepository.allShops.put("Adidas", new Shop("Adidas", "Hampstead High Street", "E10 4BT"));
		
	}
	
	
	
	
 }

 



  

      

    
       
   



  
  
 


	


