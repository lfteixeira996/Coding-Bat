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

Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)


rightDigit([1, 22, 93]) → [1, 2, 3]
rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
rightDigit([10, 0]) → [0, 0]
 */
public class rightDigit {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("rightDigit([1, 22, 93]) → [1, 2, 3]\n");
		
		List<Integer> inputA = new ArrayList<Integer>();
		inputA.add(1);
		inputA.add(22);
		inputA.add(93);
		
		
		List<Integer> outputA = new ArrayList<Integer>();
		outputA.add(1);
		outputA.add(2);
		outputA.add(3);
				
		assertEquals("rightDigit([1, 22, 93]) → [1, 2, 3]", outputA, rightDigit(inputA));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]\n");
		
		List<Integer> inputA = new ArrayList<Integer>();
		inputA.add(16);
		inputA.add(8);
		inputA.add(886);
		inputA.add(8);
		inputA.add(1);
		
		
		List<Integer> outputA = new ArrayList<Integer>();
		outputA.add(6);
		outputA.add(8);
		outputA.add(6);
		outputA.add(8);
		outputA.add(1);
				
		assertEquals("rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]", outputA, rightDigit(inputA));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("rightDigit([10, 0]) → [0, 0]\n");
		
		List<Integer> inputA = new ArrayList<Integer>();
		inputA.add(10);
		inputA.add(0);		
		
		List<Integer> outputA = new ArrayList<Integer>();
		outputA.add(0);
		outputA.add(0);
				
		assertEquals("rightDigit([10, 0]) → [0, 0]", outputA, rightDigit(inputA));
		i++;
	}
	
	public List<Integer> rightDigit(List<Integer> nums) {
		 
		List<Integer> ret = new ArrayList<Integer>();
		
		for (int i = 0; i < nums.size(); i++) {
			
			ret.add(nums.get(i)%10);
		}
		
		return ret;
		
	}
}
