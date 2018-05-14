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
Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.


math1([1, 2, 3]) --> [20, 30, 40]
math1([6, 8, 6, 8, 1]) --> [70, 90, 70, 90, 20]
math1([10]) --> [110]
 */
public class math1 {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("math1([1, 2, 3]) --> [20, 30, 40]\n");
		
		List<Integer> inputA = new ArrayList<Integer>();
		inputA.add(1);
		inputA.add(2);
		inputA.add(3);
		
		
		List<Integer> outputA = new ArrayList<Integer>();
		outputA.add(20);
		outputA.add(30);
		outputA.add(40);
				
		assertEquals("math1([1, 2, 3]) --> [20, 30, 40]", outputA, math1(inputA));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("math1([6, 8, 6, 8, 1]) --> [70, 90, 70, 90, 20]\n");
		
		List<Integer> inputA = new ArrayList<Integer>();
		inputA.add(6);
		inputA.add(8);
		inputA.add(6);
		inputA.add(8);
		inputA.add(1);
		
		List<Integer> outputA = new ArrayList<Integer>();
		outputA.add(70);
		outputA.add(90);
		outputA.add(70);
		outputA.add(90);
		outputA.add(20);
				
		assertEquals("math1([6, 8, 6, 8, 1]) --> [70, 90, 70, 90, 20]", outputA, math1(inputA));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("math1([10]) --> [110]\n");
		
		List<Integer> inputA = new ArrayList<Integer>();
		inputA.add(10);
		
		List<Integer> outputA = new ArrayList<Integer>();
		outputA.add(110);
				
		assertEquals("math1([10]) --> [110]", outputA, math1(inputA));
		i++;
	}
	
	public List<Integer> math1(List<Integer> nums) {
	
		List<Integer> ret = new ArrayList<Integer>();
		
		for (int i = 0; i < nums.size(); i++) {
			ret.add(i,(nums.get(i)+1)*10);
		}
		
		return ret;		
	}
}
