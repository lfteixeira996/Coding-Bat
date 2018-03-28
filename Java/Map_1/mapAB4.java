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

Modify and return the given map as follows: if the keys "a" and "b" have values 
that have different lengths, then set "c" to have the longer value. 
If the values exist and have the same length, change them both to the empty string in the map.


mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
 */
public class mapAB4 {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("mapAB4({\"a\": \"aaa\", \"b\": \"bb\", \"c\": \"cake\"}) → {\"a\": \"aaa\", \"b\": \"bb\", \"c\": \"aaa\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("a","aaa");  
	    map.put("b","bb");
	    map.put("c","cake");
	    
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("a","aaa");  
	    exp.put("b","bb");
	    exp.put("c","aaa");
	    
	    assertEquals(exp, mapAB4(map));
	    i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("mapAB4({\"a\": \"aa\", \"b\": \"bbb\", \"c\": \"cake\"}) → {\"a\": \"aa\", \"b\": \"bbb\", \"c\": \"bbb\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("a","aa");  
	    map.put("b","bbb");
	    map.put("c","cake");
	    
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("a","aa");  
	    exp.put("b","bbb");
	    exp.put("c","bbb");
	    
	    assertEquals(exp, mapAB4(map));
	    i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("mapAB4({\"a\": \"aa\", \"b\": \"bbb\"}) → {\"a\": \"aa\", \"b\": \"bbb\", \"c\": \"bbb\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("a","aa");  
	    map.put("b","bbb");
	    
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("a","aa");  
	    exp.put("b","bbb");
	    exp.put("c","bbb");
	    
	    assertEquals(exp, mapAB4(map));
	    i++;
	}
		
	public Map<String, String> mapAB4(Map<String, String> map) {
		  
		String max_key = null;
		
		if(map.size()<2)
			return map;
		
		else if (!(map.containsKey("a")) || !(map.containsKey("b"))) {
			return map;
		} 
		
		
		else if (map.get("a").length() == map.get("b").length()) {
			map.put("a", "");
			map.put("b", "");			
		}
		
		else {
			if (map.get("a").length() > map.get("b").length()) {
				max_key = "a";
			}
				
			else {
				max_key = "b";
			}
		
			
			map.put("c", map.get(max_key));
			
		}
		
		return map;	
	}

}
