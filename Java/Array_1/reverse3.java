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
Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.


reverse3([1, 2, 3]) --> [3, 2, 1]
reverse3([5, 11, 9]) --> [9, 11, 5]
reverse3([7, 0, 0]) --> [0, 0, 7]
 */
public class reverse3 {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("reverse3([1, 2, 3]) --> [3, 2, 1]\n");
		int[] numA = {1, 2, 3};
		int[] exp  = {3, 2, 1}; 
		assertArrayEquals("reverse3([1, 2, 3]) --> [3, 2, 1]", exp, reverse3(numA));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("reverse3([5, 11, 9]) --> [9, 11, 5]\n");
		int[] numA = {5, 11, 9};
		int[] exp  = {9, 11, 5}; 
		assertArrayEquals("reverse3([5, 11, 9]) --> [9, 11, 5]", exp, reverse3(numA));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("reverse3([7, 0, 0]) --> [0, 0, 7]\n");
		int[] numA = {7, 0, 0};
		int[] exp  = {0, 0, 7}; 
		assertArrayEquals("reverse3([7, 0, 0]) --> [0, 0, 7]", exp, reverse3(numA));
		i++;
	}
	
	public int[] reverse3(int[] nums) {
		  
		int aux = nums[nums.length-1];
		nums[nums.length-1]=nums[0];
		nums[0] = aux;
		
		return nums;
	}

}
