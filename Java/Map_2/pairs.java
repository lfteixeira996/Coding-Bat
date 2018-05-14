/**
 * @author 	Luis Teixeira
 *
 * @data 	14 May 2018
 *
 * @mail	filipe.teixeira.996@gmail.com 
 */
package Map_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


/** 

Given an array of non-empty strings, create and return a Map<String, String> as follows: 
for each string add its first character as a key with its last character as the value.


pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

*/
public class pairs {

	private static int i = 1;
		
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("frontTimes(\"Chocolate\", 2) --> \"ChoCho\"\n");    
	    assertEquals("ChoCho", frontTimes("Chocolate", 2));
	    i++;
	}
	
	
	
	public Map<String, String> pairs(String[] strings) {
		  
	}
}
