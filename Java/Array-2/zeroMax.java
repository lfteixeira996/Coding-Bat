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

Return a version of the given array where each zero value in the array is
replaced by the largest odd value to the right of the zero in the array. 
If there is no odd value to the right of the zero, leave the zero as a zero.


zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]
 */
public class zeroMax {

	private static int i = 1;
	
	@Test
	public void Test1()

	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]\n");
		int[] inputA  = {0, 5, 0, 3};
		int[] outputA = {5, 5, 3, 3};
		
		assertArrayEquals(outputA, zeroMax(inputA));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]\n");
		int[] inputA  = {0, 4, 0, 3};
		int[] outputA = {3, 4, 3, 3};
		
		assertArrayEquals(outputA, zeroMax(inputA));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("zeroMax([0, 1, 0]) → [1, 1, 0]\n");
		int[] inputA  = {0, 1, 0};
		int[] outputA = {1, 1, 0};
		
		assertArrayEquals(outputA, zeroMax(inputA));
		i++;
	}
	
	public int[] zeroMax(int[] nums) {
	
		
	}
}
