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
Modify and return the given map as follows: if the key "a" has a value,
set the key "b" to have that same value. In all cases remove the key "c", 
leaving the rest of the map unchanged.


mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) --> {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) --> {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) --> {"a": "aaa", "b": "aaa", "d": "hi"}
 */
public class mapShare {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("mapShare({\"a\": \"aaa\", \"b\": \"bbb\", \"c\": \"ccc\"}) --> {\"a\": \"aaa\", \"b\": \"aaa\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("a","aaa");  
	    map.put("b","bbb");  
	    map.put("c","ccc");  
	    
	    //Expected map
	    Map exp	=	new HashMap();  
	    exp.put("a", "aaa");
	    exp.put("b", "aaa");
	    assertEquals(exp, mapShare(map));
	    i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("mapShare({\"b\": \"xyz\", \"c\": \"ccc\"}) --> {\"b\": \"xyz\"}\n");

		//Input map
	    Map map	=	new HashMap();    
	    map.put("b","xyz");  
	    map.put("c","ccc");  
	    
	    //Expected map
	    Map exp	=	new HashMap();  
	    exp.put("b", "xyz");
	    assertEquals(exp, mapShare(map));
	    i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("mapShare({\"a\": \"aaa\", \"c\": \"meh\", \"d\": \"hi\"}) --> {\"a\": \"aaa\", \"b\": \"aaa\", \"d\": \"hi\"}\n");

		//Input map
	    Map map	=	new HashMap();    
	    map.put("a","aaa");  
	    map.put("c","meh");  
	    map.put("d","hi");
	    
	    //Expected map
	    Map exp	=	new HashMap();  
	    exp.put("a", "aaa");
	    exp.put("b", "aaa");
	    exp.put("d", "hi");
	    assertEquals(exp, mapShare(map));
	    i++;
	}
	
	public Map<String, String> mapShare(Map<String, String> map) {
		  
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
		}
		
		map.remove("c");
		
		return map;
	}
}
