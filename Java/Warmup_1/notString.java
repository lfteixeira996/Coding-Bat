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
 * 
Given a string, return a new string where "not " has been added to the front.
However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.


notString("candy") --> "not candy"
notString("x") --> "not x"
notString("not bad") --> "not bad"

 */
public class notString {

	private static int i = 1;
	
	@Test
	public void Test1()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("notString(\"candy\") --> \"not candy\"\n");
				
		assertEquals("notString(\"candy\") --> \"not candy\"", "not candy", notString("candy"));
		i++;
	}
	
	@Test
	public void Test2()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("notString(\"x\") --> \"not x\"\n");
				
		assertEquals("notString(\"x\") --> \"not x\"", "not x", notString("x"));
		i++;
	}
	
	@Test
	public void Test3()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("notString(\"not bad\") --> \"not bad\"\n");
				
		assertEquals("notString(\"not bad\") --> \"not bad\"", "not bad", notString("not bad"));
		i++;
	}
	
	
	public String notString(String str) {
		
		if (str.startsWith("not")) {
			return str;
		}
		
		return "not "+str;
		
	}
}
