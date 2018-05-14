/**
 * @author Luis Teixeira
 *
 * @date   03/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Functional_1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
Given a list of integers, return a list where each integer is multiplied with itself.


square([1, 2, 3]) --> [1, 4, 9]
square([6, 8, -6, -8, 1]) --> [36, 64, 36, 64, 1]
square([]) --> []
 */
public class square {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("square([1, 2, 3]) --> [1, 4, 9]\n");
		
		List<Integer> inputA = new ArrayList<Integer>();
		inputA.add(1);
		inputA.add(2);
		inputA.add(3);
		
		
		List<Integer> outputA = new ArrayList<Integer>();
		outputA.add(1);
		outputA.add(4);
		outputA.add(9);
				
		assertEquals("square([1, 2, 3]) --> [1, 4, 9]", outputA, square(inputA));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("square([6, 8, -6, -8, 1]) --> [36, 64, 36, 64, 1]\n");
		
		List<Integer> inputA = new ArrayList<Integer>();
		inputA.add(6);
		inputA.add(8);
		inputA.add(-6);
		inputA.add(-8);
		inputA.add(1);
		
		
		List<Integer> outputA = new ArrayList<Integer>();
		outputA.add(36);
		outputA.add(64);
		outputA.add(36);
		outputA.add(64);
		outputA.add(1);
				
		assertEquals("square([6, 8, -6, -8, 1]) --> [36, 64, 36, 64, 1]", outputA, square(inputA));
		i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("square([]) --> []\n");
		
		List<Integer> inputA = new ArrayList<Integer>();
	
		List<Integer> outputA = new ArrayList<Integer>();
				
		assertEquals("square([]) --> []", outputA, square(inputA));
		i++;
	}
	
	public List<Integer> square(List<Integer> nums) {
		 
		List<Integer> ret = new ArrayList<Integer>();
		
		for (int i = 0; i < nums.size(); i++) {
			
			ret.add(i, nums.get(i)*nums.get(i));
		}
		
		return ret;
	}
}
