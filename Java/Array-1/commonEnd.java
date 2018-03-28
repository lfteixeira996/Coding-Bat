/**
 * @author Luis Teixeira
 *
 * @date   28/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Array_1;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * 
Given 2 arrays of ints, a and b, return true if 
they have the same first element or they have the 
same last element. Both arrays will be length 1 or more.


commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true

 */
public class commonEnd {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("commonEnd([1, 2, 3], [7, 3]) → true\n");
		int[] numA = {1, 2, 3};
		int[] numB = {7, 3};
		assertEquals("commonEnd([1, 2, 3], [7, 3]) → true", true, commonEnd(numA, numB));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("commonEnd([1, 2, 3], [7, 3, 2]) → false\n");
		int[] numA = {1, 2, 3};
		int[] numB = {7, 3, 2};
		assertEquals("commonEnd([1, 2, 3], [7, 3, 2]) → false", false, commonEnd(numA, numB));
		i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("commonEnd([1, 2, 3], [1, 3]) → true\n");
		int[] numA = {1, 2, 3};
		int[] numB = {1, 3};
		assertEquals("commonEnd([1, 2, 3], [1, 3]) → true", true, commonEnd(numA, numB));
		i++;
	}
	
	public boolean commonEnd(int[] a, int[] b) {
		  
		
	}

}
