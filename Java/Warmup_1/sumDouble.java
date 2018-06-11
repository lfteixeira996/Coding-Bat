/**
 * @author 	Luis Teixeira
 *
 * @data 	30 May 2018
 *
 * @mail	filipe.teixeira.996@gmail.com 
 */
package Warmup_1;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/*
Given two int values, return their sum. 
Unless the two values are the same, then return double their sum.


sumDouble(1, 2) --> 3
sumDouble(3, 2) --> 5
sumDouble(2, 2) --> 8 

*/

public class sumDouble {

	private static int i = 1;
	
	@Test
	public void Test1()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("sumDouble(1, 2) → 3\n");
				
		assertEquals("sumDouble(1, 2) --> 3", 3, sumDouble(1, 2));
		i++;
	}
	
	@Test
	public void Test2()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("sumDouble(3, 2) --> 5\n");
				
		assertEquals("sumDouble(3, 2) --> 5", 5, sumDouble(3, 2));
		i++;
	}
	
	@Test
	public void Test3()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("sumDouble(2, 2) --> 8 \n");
				
		assertEquals("sumDouble(2, 2) --> 8 ", 8, sumDouble(2, 2));
		i++;
	}
	
	
	
	
	public int sumDouble(int a, int b) {
		  
		
		if (a == b) {
			return (a+b)*2;
		}
		
		return a+b;
	}

}
