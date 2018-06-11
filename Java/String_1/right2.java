/**
 * @author 	Luis Teixeira
 *
 * @data 	4 Jun 2018
 *
 * @mail	filipe.teixeira.996@gmail.com 
 */
package String_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. 
The string length will be at least 2.


right2("Hello") --> "loHel"
right2("java") --> "vaja"
right2("Hi") --> "Hi"
*/
public class right2 {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("right2(\"Hello\") → \"loHel\"\n");
		assertEquals("right2(\"Hello\") → \"loHel\"", "loHel", right2("Hello"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("right2(\"java\") → \"vaja\"\n");
		assertEquals("right2(\"java\") → \"vaja\"", "vaja", right2("java"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("right2(\"Hi\") → \"Hi\"\n");
		assertEquals("right2(\"Hi\") → \"Hi\"", "Hi", right2("Hi"));
		i++;
	}

	public String right2(String str) {
		  
		String aux = "";
		
		if (str.length() < 2) {
			return str;
		}
		
		aux = str.substring(str.length()-2, str.length());
		
		return aux + str.substring(0, str.length()-2);
	}
}
