/**
 * @author Luis Teixeira
 *
 * @date   05/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Array_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
Given a number n, create and return a new int array of length n, 
containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return a length 0 array. 
You do not need a separate if-statement for the length-0 case; 
the for-loop should naturally execute 0 times in that case, so it just works. 
The syntax to make a new int array is: new int[desired_length]   (See also: FizzBuzz Code)


fizzArray(4) --> [0, 1, 2, 3]
fizzArray(1) --> [0]
fizzArray(10) --> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */
public class fizzArray {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("fizzArray(4) --> [0, 1, 2, 3]\n");
		int[] outputA = {0, 1, 2, 3};
		assertArrayEquals(outputA, fizzArray(4));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("fizzArray(1) --> [0]\n");
		int[] outputA = {0};
		assertArrayEquals(outputA, fizzArray(1));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("fizzArray(10) --> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]\n");
		int[] outputA = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		assertArrayEquals(outputA, fizzArray(10));
		i++;
	}

	public int[] fizzArray(int n) {
		
		int[] ret = new int[n];
		
		for (int i = 0; i < n; i++) {
			ret[i] = i;
		}
		
		return ret;
	}
}
