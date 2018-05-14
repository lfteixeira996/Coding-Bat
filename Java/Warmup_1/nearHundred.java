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

Given an int n, return true if it is within 10 of 100 or 200. 
Note: Math.abs(num) computes the absolute value of a number.


nearHundred(93) --> true
nearHundred(90) --> true
nearHundred(89) --> false

*/

public class nearHundred{
	
	@Test
	public void Test1()
	{
		/*Test 1*/
		System.out.println("**********Test 1**********");
		boolean actual = nearHundred(93);
		System.out.println("Calculate nearHundred(93)\n");
		assertEquals("nearHundred(93) = true", true, nearHundred(93));
	}
	
	@Test
	public void Test2()
	{
		/*Test 2*/
		System.out.println("**********Test 2**********");
		boolean actual = nearHundred(90);
		System.out.println("Calculate nearHundred(90)\n");
		assertEquals("nearHundred(90) = true", true, nearHundred(90));
	}
	
	@Test
	public void Test3()
	{
		/*Test 3*/
		System.out.println("**********Test 1**********");
		boolean actual = nearHundred(89);
		System.out.println("Calculate nearHundred(89)\n");
		assertEquals("nearHundred(89) = false", false, nearHundred(89));
	}
	
	/*********************************************************/
	public boolean nearHundred(int n) {
	
		n = Math.abs(n);
		
		if((n>=0 && n<=20) || ((n>=90 && n<=100) || (n>=190 && n<=210)))
		{
			return true;
		}
		
		return false;
		
	}

}