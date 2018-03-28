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
 * 
Modify and return the given map as follows: 
if the keys "a" and "b" are both in the map and have equal values, remove them both.


mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) 	→ {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) 				→ {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) 	→ {"a": "aaa", "b": "bbb", "c": "aaa"}

 */
public class mapAB2 {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("mapAB2({\"a\": \"aaa\", \"b\": \"aaa\", \"c\": \"cake\"}) → {\"c\": \"cake\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("a","aaa");  
	    map.put("b","aaa");  
	    map.put("c","cake");  
	    mapAB2(map);
	    
	    //Expected map
	    Map exp	=	new HashMap();  
	    exp.put("c", "cake");
	    
	    assertEquals(exp, mapAB2(map));
	    i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("mapAB2({\"a\": \"aaa\", \"b\": \"bbb\"}) → {\"a\": \"aaa\", \"b\": \"bbb\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("a","aaa");  
	    map.put("b","bbb");   
	    mapAB2(map);
	    
	    //Expected map
	    Map exp	=	new HashMap();  
	    exp.put("a","aaa");  
	    exp.put("b","bbb");
	    
	    assertEquals(exp, mapAB2(map));
	    i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("mapAB2({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"aaa\"}) → {\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"aaa\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("a","aaa");  
	    map.put("b","bbb"); 
	    map.put("c","aaa"); 
	    mapAB2(map);
	    
	    //Expected map
	    Map exp	=	new HashMap();  
	    exp.put("a","aaa");  
	    exp.put("b","bbb"); 
	    exp.put("c","aaa"); 
	    
	    assertEquals(exp, mapAB2(map));
	    i++;
	}
	
	
	public Map<String, String> mapAB2(Map<String, String> map) {
		
		if (map.size()<2) {
			return map;
		}
		
		
		else if (map.get("a").equals(map.get("b"))) {
			map.remove("a");
			map.remove("b");
		}
		
		return map;
	}

}
