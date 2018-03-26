package test;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * 
Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */

public class frontBack {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("frontBack(\"code\") → \"eodc\"\n");
		assertEquals("frontBack(\"code\") → \"eodc\"", "eodc", frontBack("code"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("frontBack(\"a\") → \"a\"\n");
		assertEquals("frontBack(\"a\") → \"a\"", "a", frontBack("a"));
		i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("frontBack(\"ab\") → \"ba\"\n");
		assertEquals("frontBack(\"ab\") → \"ba\"", "ba", frontBack("ab"));
		i++;
	}
	
	public String frontBack(String str) {
		
		if(str.length() <2) {
			return str;
		}
		
		else {
			return str.charAt(str.length()-1) + str.substring(1, str.length()-1) + str.charAt(0);
		}
		
	}

	
}
