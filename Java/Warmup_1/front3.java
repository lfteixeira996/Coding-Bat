/**
 * @author 	Luis Teixeira
 *
 * @data 	30 May 2018
 *
 * @mail	filipe.teixeira.996@gmail.com 
 */
package Warmup_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*

Given a string, we'll say that the front is the first 3 chars of the string.
If the string length is less than 3, the front is whatever is there.
Return a new string which is 3 copies of the front.


front3("Java") --> "JavJavJav"
front3("Chocolate") --> "ChoChoCho"
front3("abc") --> "abcabcabc"

 */
public class front3 {

	private static int i = 1;
	
	@Test
	public void Test1()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("front3(\"Java\") --> \"JavJavJav\"\n");
				
		assertEquals("front3(\"Java\") --> \"JavJavJav\"", "JavJavJav", front3("Java"));
		i++;
	}
	
	@Test
	public void Test2()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("front3(\"Chocolate\") --> \"ChoChoCho\"\n");
				
		assertEquals("front3(\"Chocolate\") --> \"ChoChoCho\"", "ChoChoCho", front3("Chocolate"));
		i++;
	}
	
	@Test
	public void Test3()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("front3(\"abc\") --> \"abcabcabc\"\n");
				
		assertEquals("front3(\"abc\") --> \"abcabcabc\"", "abcabcabc", front3("abc"));
		i++;
	}
	
	
	public String front3(String str) {
		 
		if (str.length() < 3) {
			return str+str+str;
		}
		
		String ret = str.substring(0, 3);
		
		return ret+ret+ret;
		
	}

	
}
