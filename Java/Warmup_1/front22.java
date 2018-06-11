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
 
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, 
so "kitten" yields"kikittenki". 
If the string length is less than 2, use whatever chars are there.


front22("kitten") --> "kikittenki"
front22("Ha") --> "HaHaHa"
front22("abc") --> "ababcab"
 */
public class front22 {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("front22(\"kitten\") --> \"kikittenki\"\n");
		assertEquals("front22(\"kitten\") --> \"kikittenki\"", "kikittenki", front22("kitten"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("front22(\"Ha\") --> \"HaHaHa\"\n");
		assertEquals("front22(\"Ha\") --> \"HaHaHa\"", "HaHaHa", front22("Ha"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("front22(\"abc\") --> \"ababcab\"\n");
		assertEquals("front22(\"abc\") --> \"ababcab\"", "ababcab", front22("abc"));
		i++;
	}
	
	public String front22(String str) {
		  
		if (str.length()<2) {
			return str+str+str;
		}
		
		return str.substring(0, 2)+str+str.substring(0,2);
	}
}
