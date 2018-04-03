/**
 * @author Luis Teixeira
 *
 * @date   03/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package AP_1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2.


scores100([1, 100, 100]) → true
scores100([1, 100, 99, 100]) → false
scores100([100, 1, 100, 100]) → true
 */
public class scores100 {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("scores100([1, 100, 100]) → true\n");
		int[] inputA = {1, 100, 100};	
		assertEquals("scores100([1, 100, 100]) → true", true, scores100(inputA));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("scores100([1, 100, 99, 100]) → false\n");
		int[] inputA = {1, 100, 99, 100};	
		assertEquals("scores100([1, 100, 99, 100]) → false", false, scores100(inputA));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("scores100([100, 1, 100, 100]) → true\n");
		int[] inputA = {100, 1, 100, 100};	
		assertEquals("scores100([100, 1, 100, 100]) → true", true, scores100(inputA));
		i++;
	}
	
	public boolean scores100(int[] scores) {
		  
		
		
	}
}
