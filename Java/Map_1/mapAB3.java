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
Modify and return the given map as follows: 
if exactly one of the keys "a" or "b" has a value in the map (but not both),
set the other to have that same value in the map.


mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
 */
public class mapAB3 {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("mapAB3({\"a\": \"aaa\", \"c\": \"cake\"}) → {\"a\": \"aaa\", \"b\": \"aaa\", \"c\": \"cake\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("a","aaa");  
	    map.put("c","cake");
	        
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("a","aaa");  
	    exp.put("b","aaa");
	    exp.put("c","cake");
	    
	    assertEquals(exp, mapAB3(map));
	    i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("mapAB3({\"b\": \"bbb\", \"c\": \"cake\"}) → {\"a\": \"bbb\", \"b\": \"bbb\", \"c\": \"cake\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("a","bbb");  
	    map.put("c","cake");
	        
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("a","bbb");  
	    exp.put("b","bbb");
	    exp.put("c","cake");
	    
	    assertEquals(exp, mapAB3(map));
	    i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("mapAB3({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"cake\"}) → {\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"cake\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("a","aaa"); 
	    map.put("b","bbb"); 
	    map.put("c","cake");
	        
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("a","aaa");  
	    exp.put("b","bbb");
	    exp.put("c","cake");
	    
	    assertEquals(exp, mapAB3(map));
	    i++;
	}
	
	public Map<String, String> mapAB3(Map<String, String> map) {
		  
		if (!(map.containsKey("a")) && !(map.containsKey("b"))) {
			return map;
		}
		
		else if ((map.containsKey("a")) && (map.containsKey("b"))) {
			return map;
		}
		
		else if((map.containsKey("a")) && !(map.containsKey("b"))) {
			map.put("b", map.get("a"));
		}
		
		else {
			map.put("a", map.get("b"));
		}
		
		return map;
	}
}
