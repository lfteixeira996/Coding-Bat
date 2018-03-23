package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Given a string, take the last char and return a new string 
with the last char added at the front and back, so "cat" yields "tcatt".
The original string will be length 1 or more.


backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
*/

public class backAround{
	
	@Test
	public void Test1()
	{
		/*Test 1*/
		System.out.println("**********Test 1**********");
		String actual = backAround("cat");
		System.out.println("Calculate backAround(\"cat\")\n");
		assertEquals("backAround(\"cat\") = \"tcatt\"", "tcatt", backAround("cat"));
	}
	
	@Test
	public void Test2()
	{
		/*Test 2*/
		System.out.println("**********Test 2**********");
		String actual = backAround("Hello");
		System.out.println("Calculate backAround(\"Hello\")\n");
		assertEquals("backAround(\"Hello\") = \"oHelloo\"", "oHelloo", backAround("Hello"));
	}
	
	@Test
	public void Test3()
	{
		/*Test 3*/
		System.out.println("**********Test 3**********");
		String actual = backAround("a");
		System.out.println("Calculate backAround(\"a\")\n");
		assertEquals("backAround(\"a\") = \"aaa\"", "aaa", backAround("a"));
	}
	
	/*********************************************************/
	public String backAround(String str) {
		  
		char last = str.charAt(str.length()-1);

		return (last + str + last);
		
	}

}	