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

The classic word-count algorithm: given an array of strings, return a Map<String, Integer> 
with a key for each different string, with the value the number of times that string appears in the array.


wordCount(["a", "b", "a", "c", "b"]) --> {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) --> {"a": 1, "b": 1, "c": 1}
wordCount([wordCount(["c", "c", "c", "c"]) --> {"c": 4}]) --> {"c": 4}
 */
public class wordCount {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("wordCount([\"a\", \"b\", \"a\", \"c\", \"b\"]) --> {\"a\": 2, \"b\": 2, \"c\": 1}\n");

		//Input array
	    String[] array =  {"a", "b", "a", "c", "b"};
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("a",2);  
	    exp.put("b",2);
	    exp.put("c", 1);
	    
	    assertEquals(exp, wordCount(array));
	    i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("wordCount([\"c\", \"b\", \"a\"]) --> {\"a\": 1, \"b\": 1, \"c\": 1}\n");

		//Input array
	    String[] array =  {"c", "b", "a"};
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("a",1);  
	    exp.put("b",1);
	    exp.put("c", 1);
	    
	    assertEquals(exp, wordCount(array));
	    i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("wordCount([\"c\", \"c\", \"c\", \"c\"]) --> {\"c\": 4}\n");

		//Input array
	    String[] array =  {"c", "c", "c", "c"};
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("c", 4);
	    
	    assertEquals(exp, wordCount(array));
	    i++;
	}
	
	public Map<String, Integer> wordCount(String[] strings) {
		  
		Map ret = new HashMap(); 
		int val;
		
		for (int i = 0; i < strings.length; i++) {
			if (ret.containsKey(strings[i])) {
				val = (int) ret.get(strings[i]);
				ret.put(strings[i], val+1);
			}
			
			else {
				ret.put(strings[i], 1);
			}
		}
		
		return ret;
	}

}
