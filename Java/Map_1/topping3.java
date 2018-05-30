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

Given a map of food keys and topping values, modify and return the map 
as follows: if the key "potato" has a value, set that as the value for the key "fries".
If the key "salad" has a value, set that as the value for the key "spinach".


topping3({"potato": "ketchup"}) --> {"potato": "ketchup", "fries": "ketchup"}
topping3({"potato": "butter"}) --> {"potato": "butter", "fries": "butter"}
topping3({"salad": "oil", "potato": "ketchup"}) --> {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
 */
public class topping3 {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("topping3({\"potato\": \"ketchup\"}) --> {\"potato\": \"ketchup\", \"fries\": \"ketchup\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("potato","ketchup");    
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("potato","ketchup");  
	    exp.put("fries", "ketchup");
	    
	    assertEquals(exp, topping3(map));
	    i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("topping3({\"potato\": \"butter\"}) --> {\"potato\": \"butter\", \"fries\": \"butter\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("potato","butter");    
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("potato","butter");  
	    exp.put("fries", "butter");
	    
	    assertEquals(exp, topping3(map));
	    i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("topping3({\"salad\": \"oil\", \"potato\": \"ketchup\"}) --> {\"spinach\": \"oil\", \"salad\": \"oil\", \"potato\": \"ketchup\", \"fries\": \"ketchup\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("salad","oil"); 
	    map.put("potato","ketchup"); 
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("spinach","oil");  
	    exp.put("salad", "oil");
	    exp.put("potato", "ketchup");
	    exp.put("fries", "ketchup");
	    
	    assertEquals(exp, topping3(map));
	    i++;
	}
	
	public Map<String, String> topping3(Map<String, String> map) {

		if (map.containsKey("potato")) {
			map.put("fries", map.get("potato"));
		}
		
		if (map.containsKey("salad")) {
			map.put("spinach", map.get("salad"));
		}
		
		return map;
	}

}
