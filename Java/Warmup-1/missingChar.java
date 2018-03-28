/**
 * @author Luis Teixeira
 *
 * @date   28/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Warmup_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
Given a non-empty string and an int n, return a new string where
the char at index n has been removed. The value of n will be a valid 
index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).


missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
 */





public class missingChar{
	
	@Test
	public void Test1()
	{
		/*Test 1*/
		System.out.println("**********Test 1**********");
		String actual = missingChar("kitten", 1);
		System.out.println("Calculate missingChar(\"kitten\", 1)\n");
		assertEquals("missingChar(\"kitten\", 1) = \"ktten\"", "ktten", missingChar("kitten", 1));
	}
	
	@Test
	public void Test2()
	{
		/*Test 2*/
		System.out.println("**********Test 2**********");
		String actual = missingChar("kitten", 0);
		System.out.println("Calculate missingChar(\"kitten\", 0)\n");
		assertEquals("missingChar(\"kitten\", 0) = \"itten\"", "itten", missingChar("kitten", 0));
	}
	
	@Test
	public void Test3()
	{
		/*Test 3*/
		System.out.println("**********Test 1**********");
		String actual = missingChar("kitten", 4);
		System.out.println("Calculate missingChar(\"kitten\", 4)\n");
		assertEquals("missingChar(\"kitten\", 4) = \"kittn\"", "kittn", missingChar("kitten", 4));
	}
	
	/*********************************************************/
	public String missingChar(String str, int n) {
	
		String str1 = str.substring(0, n);
		String str2 = str.substring(n+1, str.length());
		
		return str1+str2;	
	}

}