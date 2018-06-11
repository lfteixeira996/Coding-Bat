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
 
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.


makes10(9, 10) --> true
makes10(9, 9) --> false
makes10(1, 9) --> true

*/
public class makes10 {

	private static int i = 1;
	
	@Test
	public void Test1()
	{	
		System.out.println("**********Test "+i+"**********");
		assertEquals("makes10(9, 10) --> true", true, makes10(9, 10));
		i++;
	}
	
	@Test
	public void Test2()
	{	
		System.out.println("**********Test "+i+"**********");
		assertEquals("makes10(9, 9) --> false", false, makes10(9, 9));
		i++;
	}
	
	@Test
	public void Test3()
	{	
		System.out.println("**********Test "+i+"**********");
		assertEquals("makes10(1, 9) --> true", true, makes10(1, 9));
		i++;
	}
	
	
	
	
	public boolean makes10(int a, int b) {
		  
		if (a == 10 || b == 10 || a+b == 10) {
			return true;
		}
		
		return false;
	}
}
