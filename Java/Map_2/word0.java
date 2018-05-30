/**
 * @author Luis Teixeira
 *
 * @date   29/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Map_2;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
Given an array of strings, return a Map<String, Integer> containing a key for every
different string in the array, always with the value 0. For example the string "hello" makes
the pair "hello":0. We'll do more complicated counting later, but for this problem the value is simply 0.


word0(["a", "b", "a", "b"]) --> {"a": 0, "b": 0}
word0(["a", "b", "a", "c", "b"]) --> {"a": 0, "b": 0, "c": 0}
word0(["c", "b", "a"]) --> {"a": 0, "b": 0, "c": 0}
 */
public class word0 {

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

	
	public Map<String, Integer> word0(String[] strings) {
		  
	}

}
