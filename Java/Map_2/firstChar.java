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
Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
with the value of all the strings starting with that character appended together in the order they appear in the array.


firstChar(["salt", "tea", "soda", "toast"]) --> {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) --> {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) --> {}
 */
public class firstChar {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("firstChar([\"salt\", \"tea\", \"soda\", \"toast\"]) --> {\"s\": \"saltsoda\", \"t\": \"teatoast\"}\n");

		//Input array
	    String[] array =  {"salt", "tea", "soda", "toast"};
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("s", "saltsoda");  
	    exp.put("t", "teatoast");
	    
	    assertEquals(exp, firstChar(array));
	    i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("firstChar([\"aa\", \"bb\", \"cc\", \"aAA\", \"cCC\", \"d\"]) --> {\"a\": \"aaaAA\", \"b\": \"bb\", \"c\": \"cccCC\", \"d\": \"d\"}\n");

		//Input array
	    String[] array =  {"aa", "bb", "cc", "aAA", "cCC", "d"};
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    exp.put("a", "aaaAA");  
	    exp.put("b", "bb");
	    exp.put("c", "cccCC");  
	    exp.put("d", "d");
	    
	    assertEquals(exp, firstChar(array));
	    i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("firstChar([]) --> {}\n");

		//Input array
	    String[] array =  {""};
	    
	    //Expected map
	    Map exp	=	new HashMap(); 
	    
	    assertEquals(exp, firstChar(array));
	    i++;
	}
	
	
	public Map<String, String> firstChar(String[] strings) {
		  
		Map ret = new HashMap(); 
		char arr, map;
		
		for (String itr : strings) {
			
			String key = " "+ itr.charAt(0);
			
			if (ret.containsKey(key)) {
				ret.put(key, ret.get(key)+itr);
				
			}
			
			else {
				ret.put(key, itr);
			}
			
		}
		
		return ret;		
	}

}
