/**
 * @author Luis Teixeira
 *
 * @date   29/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Recursion_1;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).


factorial(1) --> 1
factorial(2) --> 2
factorial(3) --> 6
 */
public class factorial {

	private static int i = 1;
	
	@Test
	public void Test1()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("factorial(1) --> 1\n");
		assertEquals("factorial(1) --> 1", 1, factorial(1));
		i++;
	}
	
	@Test
	public void Test2()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("factorial(2) --> 2\n");
		assertEquals("factorial(2) --> 2", 2, factorial(2));
		i++;
	}
	
	@Test
	public void Test3()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("factorial(3) --> 6\n");
		assertEquals("factorial(3) --> 6", 6, factorial(3));
		i++;
	}
	
	public int factorial(int n) {
		  
		if (n==0) {
			return 1;
		}
		
		else {
			return n*factorial(n-1);
		}
	}
}
