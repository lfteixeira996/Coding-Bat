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
Given a string of even length, return the first half.
So the string "WooHoo" yields "Woo".


firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
 */
public class firstHalf {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("firstHalf(\"WooHoo\") → \"Woo\"\n");
		assertEquals("firstHalf(\"WooHoo\") → \"Woo\"", "Woo", firstHalf("WooHoo"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("firstHalf(\"HelloThere\") → \"Hello\"\n");
		assertEquals("firstHalf(\"HelloThere\") → \"Hello\"", "Hello", firstHalf("HelloThere"));
		i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("firstHalf(\"abcdef\") → \"abc\"\n");
		assertEquals("firstHalf(\"abcdef\") → \"abc\"", "abc", firstHalf("abcdef"));
		i++;
	}
	
	public String firstHalf(String str) {
		  
	}

}
