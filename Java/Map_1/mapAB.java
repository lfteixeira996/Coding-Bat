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

Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
If both keys are present, append their 2 string values together and store the result under the key "ab".


mapAB({"a": "Hi", "b": "There"}) --> {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) --> {"a": "Hi"}
mapAB({"b": "There"}) --> {"b": "There"}
 */
public class mapAB {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("mapAB({\"a\": \"Hi\", \"b\": \"There\"}) --> {\"a\": \"Hi\", \"ab\": \"HiThere\", \"b\": \"There\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("a","Hi");  
	    map.put("b","There");   
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("a","Hi");  
	    exp.put("b","There");
	    exp.put("ab", "HiThere");
	    
	    assertEquals(exp, mapAB(map));
	    i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("mapAB({\"a\": \"Hi\"}) --> {\"a\": \"Hi\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("a","Hi");    
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("a","Hi");  
	    
	    assertEquals(exp, mapAB(map));
	    i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("mapAB({\"b\": \"There\"}) --> {\"b\": \"There\"}\n");

		//Input map
	    Map map	=	new HashMap();  
	    map.put("b","There");    
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("b","There");  
	    
	    assertEquals(exp, mapAB(map));
	    i++;
	}
	
	public Map<String, String> mapAB(Map<String, String> map) {
		 
		if (map.containsKey("a")  && map.containsKey("b")) {
			map.put("ab", map.get("a")+map.get("b"));
		}
		
		return map;
	}

}


