/**
 * @author Luis Teixeira
 *
 * @date   04/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Warmup_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Given an array of ints, return true if it contains a 2, 7, 1 pattern: 
a value, followed by the value plus 5, followed by the value minus 1. 
Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.


has271([1, 2, 7, 1]) --> true
has271([1, 2, 8, 1]) --> false
has271([2, 7, 1]) --> true
 */
public class has271 {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("has271([1, 2, 7, 1]) --> true\n");
		
		//array
		int[] input = {1, 2, 7, 1};
				
	    assertEquals(true, has271(input));
	    i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("has271([1, 2, 8, 1]) --> false\n");
		
		//array
		int[] input = {1, 2, 8, 1};
				
	    assertEquals(false, has271(input));
	    i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("has271([2, 7, 1]) --> true\n");
		
		//array
		int[] input = {2, 7, 1};
				
	    assertEquals(true, has271(input));
	    i++;
	}
		
	public boolean has271(int[] nums) {
		  
	}
}
