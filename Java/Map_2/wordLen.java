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

Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.


wordLen(["a", "bb", "a", "bb"]) --> {"bb": 2, "a": 1}
wordLen(["this", "and", "that", "and"]) --> {"that": 4, "and": 3, "this": 4}
wordLen(["code", "code", "code", "bug"]) --> {"code": 4, "bug": 3}
 */
public class wordLen {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("wordLen([\"a\", \"bb\", \"a\", \"bb\"]) --> {\"bb\": 2, \"a\": 1}\n");

		//Input array
	    String[] array =  {"a", "bb", "a", "bb"};
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("a", 1);  
	    exp.put("bb", 2);
	    
	    assertEquals(exp, wordLen(array));
	    i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("wordLen([\"this\", \"and\", \"that\", \"and\"]) --> {\"that\": 4, \"and\": 3, \"this\": 4}\n");

		//Input array
	    String[] array =  {"this", "and", "that", "and"};
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("that", 4);  
	    exp.put("and", 3);
	    exp.put("this", 4);
	    
	    assertEquals(exp, wordLen(array));
	    i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("wordLen([\"code\", \"code\", \"code\", \"bug\"]) --> {\"code\": 4, \"bug\": 3}\n");

		//Input array
	    String[] array =  {"code", "code", "code", "bug"};
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("code", 4);  
	    exp.put("bug", 3);
	    
	    assertEquals(exp, wordLen(array));
	    i++;
	}
	
	public Map<String, Integer> wordLen(String[] strings) {
		  
		Map ret = new HashMap(); 
		int val;
		
		for (int i = 0; i < strings.length; i++) {
			if (ret.containsKey(strings[i])) {
				ret.put(strings[i], strings[i].length());
			}
			
			else {
				ret.put(strings[i], strings[i].length());
			}
		}
		
		return ret;
	}
}
