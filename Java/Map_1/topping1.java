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


/*
Given a map of food keys and topping values, modify and return the map as follows:
if the key "ice cream" is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".


topping1({"ice cream": "peanuts"}) --> {"bread": "butter", "ice cream": "cherry"}
topping1({}) --> {"bread": "butter"}
topping1({"pancake": "syrup"}) --> {"bread": "butter", "pancake": "syrup"}
 */
public class topping1 {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("topping1({\"ice cream\": \"peanuts\"}) --> {\"bread\": \"butter\", \"ice cream\": \"cherry\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("ice cream","peanuts");  
	    topping1(map);
	    
	    //Expected map
	    Map exp	=	new HashMap();  
	    exp.put("bread", "butter");
	    exp.put("ice cream", "cherry");
	    
	    assertEquals(exp, topping1(map));
	    i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("topping1({}) --> {\"bread\": \"butter\"}\n");

		//Input map
	    Map map	=	new HashMap();   
	    topping1(map);
	    
	    //Expected map
	    Map exp	=	new HashMap();  
	    exp.put("bread", "butter");
	    
	    assertEquals(exp, topping1(map));
	    i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("topping1({\"pancake\": \"syrup\"}) --> {\"bread\": \"butter\", \"pancake\": \"syrup\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("pancake","syrup");  
	    topping1(map);
	    
	    //Expected map
	    Map exp	=	new HashMap();  
	    exp.put("bread", "butter");
	    exp.put("pancake", "syrup");
	    
	    assertEquals(exp, topping1(map));
	    i++;
	}
	
	public Map<String, String> topping1(Map<String, String> map) {
		 
		//In all cases, set the key "bread" to have the value "butter".
		map.put("bread", "butter");
		
		//If the key "ice cream" is present, set its value to "cherry"
		if(map.containsKey("ice cream"))
		{
			map.put("ice cream", "cherry");
		}
		
		return map;
	}
}
