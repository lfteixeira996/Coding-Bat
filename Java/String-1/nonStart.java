/**
 * @author Luis Teixeira
 *
 * @date   28/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package String_1;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * 
Given 2 strings, return their concatenation, except omit the first char of each. 
The strings will be at least length 1.


nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
 */
public class nonStart {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("nonStart(\"Hello\", \"There\") → \"ellohere\"\n");
		assertEquals("nonStart(\"Hello\", \"There\") → \"ellohere\"", "ellohere", nonStart("Hello", "There"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("nonStart(\"java\", \"code\") → \"avaode\"\n");
		assertEquals("nonStart(\"java\", \"code\") → \"avaode\"", "avaode", nonStart("java", "code"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("nonStart(\"shotl\", \"java\") → \"hotlava\"\n");
		assertEquals("nonStart(\"shotl\", \"java\") → \"hotlava\"", "hotlava", nonStart("shotl", "java"));
		i++;
	}
	
	public String nonStart(String a, String b) {
		  
		return a.substring(1, a.length()) + b.substring(1, b.length());
	}

}
