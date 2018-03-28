/**
 * @author Luis Teixeira
 *
 * @date   28/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Warmup_1;

import static org.junit.Assert.assertEquals;

import java.awt.font.NumericShaper.Range;

import org.junit.Test;

/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 3 int values, return true if 1 or more of them are teen.


hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
*/

public class hasTeen{
	
	
	@Test
	public void Test1()
	{
		/*Test 1*/
		System.out.println("**********Test 1**********");
		boolean actual = hasTeen(13, 20, 10);
		System.out.println("Calculate hasTeen(13, 20, 10)\n");
		assertEquals("hasTeen(13, 20, 10) = true", true, hasTeen(13, 20, 10));
	}
	
	@Test
	public void Test2()
	{
		/*Test 1*/
		System.out.println("**********Test 2**********");
		boolean actual = hasTeen(20, 19, 10);
		System.out.println("Calculate hasTeen(20, 19, 10)\n");
		assertEquals("hasTeen(20, 19, 10) = true", true, hasTeen(20, 19, 10));
	}
	
	@Test
	public void Test3()
	{
		/*Test 1*/
		System.out.println("**********Test 3**********");
		boolean actual = hasTeen(20, 10, 13);
		System.out.println("Calculate hasTeen(20, 10, 13)\n");
		assertEquals("hasTeen(20, 10, 13) = true", true, hasTeen(20, 10, 13));
	}
	

	/*********************************************/
	public boolean hasTeen(int a, int b, int c) {
		  
		if((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19)) 
		{
			return true;
		}
		
		return false;
	}

}	