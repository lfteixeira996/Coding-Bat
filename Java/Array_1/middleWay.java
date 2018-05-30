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
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) --> [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) --> [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) --> [2, 4]
 */
public class middleWay {

	private static int i = 1;
		
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("middleWay([1, 2, 3], [4, 5, 6]) --> [2, 5]\n");
		int[] numA = {1, 2, 3};
		int[] numB = {4, 5, 6};
		int[] exp  = {2, 5};	
		
		int[] rec = middleWay(numA, numB);
		assertEquals("middleWay([1, 2, 3], [4, 5, 6]) --> [2, 5]", exp, rec);
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("middleWay([7, 7, 7], [3, 8, 0]) --> [7, 8]\n");
		int[] numA = {7, 7, 7};
		int[] numB = {3, 8, 0};
		int[] exp  = {7, 8};		
		assertEquals("middleWay([7, 7, 7], [3, 8, 0]) --> [7, 8]", exp, middleWay(numA, numB));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("middleWay([5, 2, 9], [1, 4, 5]) --> [2, 4]\n");
		int[] numA = {5, 2, 9};
		int[] numB = {1, 4, 5};
		int[] exp  = {2, 4};		
		assertEquals("middleWay([5, 2, 9], [1, 4, 5]) --> [2, 4]", exp, middleWay(numA, numB));
		i++;
	}
	
	public int[] middleWay(int[] a, int[] b) {

		int[] num = new int[2];
		num[0] = a[1];
		num[1] = b[1];
		
		return num;
	}

}
