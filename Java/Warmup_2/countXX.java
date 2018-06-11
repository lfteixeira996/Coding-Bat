/**
 * @author 	Luis Teixeira
 *
 * @data 	5 Jun 2018
 *
 * @mail	filipe.teixeira.996@gmail.com 
 */
package Warmup_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".


countXX("abcxx") --> 1
countXX("xxx") --> 2
countXX("xxxx") --> 3

 */
public class countXX {

	private static int i = 1;
	
	@Test
	public void Test1()
	{	
		System.out.println("**********Test "+i+"**********");
		assertEquals("countXX(\"abcxx\") --> 1", 1, countXX("abcxx"));
		i++;
	}
	
	@Test
	public void Test2()
	{	
		System.out.println("**********Test "+i+"**********");
		assertEquals("countXX(\"xxx\") --> 2", 2, countXX("xxx"));
		i++;
	}
	
	@Test
	public void Test3()
	{	
		System.out.println("**********Test "+i+"**********");
		assertEquals("countXX(\"xxxx\") --> 3", 3, countXX("xxxx"));
		i++;
	}
	
	
	int countXX(String str) {
		  
		
	}

}
