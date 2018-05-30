/**
 * @author Luis Teixeira
 *
 * @date   28/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Map_1;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
Given a map of food keys and their topping values, modify and return the map as follows: 
if the key "ice cream" has a value, set that as the value for the key "yogurt" also. 
If the key "spinach" has a value, change that value to "nuts".


topping2({"ice cream": "cherry"}) --> {"yogurt": "cherry", "ice cream": "cherry"}
topping2({"spinach": "dirt", "ice cream": "cherry"}) --> {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
topping2({"yogurt": "salt"}) --> {"yogurt": "salt"}
 */
public class topping2 {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("topping2({\"ice cream\": \"cherry\"}) --> {\"yogurt\": \"cherry\", \"ice cream\": \"cherry\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("ice cream","cherry");  
	        
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("yogurt","cherry");  
	    exp.put("ice cream","cherry");
	    
	    assertEquals(exp, topping2(map));
	    i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("topping2({\"spinach\": \"dirt\", \"ice cream\": \"cherry\"}) --> {\"yogurt\": \"cherry\", \"spinach\": \"nuts\", \"ice cream\": \"cherry\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("spinach","dirt");
	    map.put("ice cream","cherry");
	        
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("yogurt","cherry");  
	    exp.put("spinach","nuts");
	    exp.put("ice cream","cherry");
	    
	    assertEquals(exp, topping2(map));
	    i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("topping2({\"yogurt\": \"salt\"}) --> {\"yogurt\": \"salt\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("yogurt","salt");
	        
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("yogurt","salt");  
	    
	    assertEquals(exp, topping2(map));
	    i++;
	}
	
	public Map<String, String> topping2(Map<String, String> map) {
		  
		if (map.containsKey("ice cream")) {
			map.put("yogurt", map.get("ice cream"));
		}
		
		if (map.containsKey("spinach")) {
			map.put("spinach","nuts");
		}
		
		return map;
	}

}
