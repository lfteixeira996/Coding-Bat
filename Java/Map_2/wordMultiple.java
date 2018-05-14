/**
 * @author Luis Teixeira
 *
 * @date   02/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Map_2;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**

Given an array of strings, return a Map<String, Boolean> where each different string 
is a key and its value is true if that string appears 2 or more times in the array.


wordMultiple(["a", "b", "a", "c", "b"]) --> {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) --> {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) --> {"c": true}
 */
public class wordMultiple {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("wordMultiple([\"a\", \"b\", \"a\", \"c\", \"b\"]) --> {\"a\": true, \"b\": true, \"c\": false}\n");

		//Input array
	    String[] array =  {"a", "b", "a", "c", "b"};
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("a", true);  
	    exp.put("b", true);
	    exp.put("c", false);
	    
	    assertEquals(exp, wordMultiple(array));
	    i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("wordMultiple([\"c\", \"b\", \"a\"]) --> {\"a\": false, \"b\": false, \"c\": false}\n");

		//Input array
	    String[] array =  {"c", "b", "a"};
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("a", false);  
	    exp.put("b", false);
	    exp.put("c", false);
	    
	    assertEquals(exp, wordMultiple(array));
	    i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("wordMultiple([\"c\", \"c\", \"c\", \"c\"]) --> {\"c\": true}\n");

		//Input array
	    String[] array =  {"c", "c", "c", "c"};
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("c", true);
	    
	    assertEquals(exp, wordMultiple(array));
	    i++;
	}
	
	public Map<String, Boolean> wordMultiple(String[] strings) {
		  
		Map ret = new HashMap(); 
		boolean val;
		
		for (int i = 0; i < strings.length; i++) {
			if (ret.containsKey(strings[i])) {
				ret.put(strings[i], true);
			}
			
			else {
				ret.put(strings[i], false);
			}
		}
		
		return ret;
	}
}
