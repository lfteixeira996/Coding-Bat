/**
 * @author Luis Teixeira
 *
 * @date   28/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Warmup_1;

import static org.junit.Assert.*;

import org.junit.Test;

/* 
Given two non-negative int values, return true if they have the same last digit,
such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.


lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
 */

public class lastDigit {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("lastDigit(7, 17) → true\n");
		assertEquals("lastDigit(7, 17) → true", true, lastDigit(7, 17));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("lastDigit(6, 17) → false\n");
		assertEquals("lastDigit(6, 17) → false", false, lastDigit(6, 17));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("lastDigit(3, 113) → true\n");
		assertEquals("lastDigit(3, 113) → true", true, lastDigit(3, 113));
		i++;
	}

	public boolean lastDigit(int a, int b) {
		
		if (a%10 == b%10) {
			return true;
		}
		
		else {
			return false;
		}
	}

}
