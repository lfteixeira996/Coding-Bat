/**
 * @author Luis Teixeira
 *
 * @date   05/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package AP_1;

import static org.junit.Assert.*;

import org.junit.Test;

/**

(A variation on the sumHeights problem.) We have an array of heights, 
representing the altitude along a walking trail. Given start/end indexes
into the array, return the sum of the changes for a walk beginning at 
the start index and ending at the end index, however increases in height count double.

For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7.
The start end end index will both be valid indexes into the array with start <= end.


sumHeights2([5, 3, 6, 7, 2], 2, 4) → 7
sumHeights2([5, 3, 6, 7, 2], 0, 1) → 2
sumHeights2([5, 3, 6, 7, 2], 0, 4) → 15
 */
public class sumHeights2 {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("sumHeights2([5, 3, 6, 7, 2], 2, 4) → 7\n");
		int[] inputA = {5, 3, 6, 7, 2};		
		assertEquals("sumHeights2([5, 3, 6, 7, 2], 2, 4) → 7", 7, sumHeights2(inputA, 2, 4));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("sumHeights2([5, 3, 6, 7, 2], 0, 1) → 2\n");
		int[] inputA = {5, 3, 6, 7, 2};		
		assertEquals("sumHeights2([5, 3, 6, 7, 2], 0, 1) → 2", 2, sumHeights2(inputA, 0, 1));
		i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("sumHeights2([5, 3, 6, 7, 2], 0, 4) → 15\n");
		int[] inputA = {5, 3, 6, 7, 2};		
		assertEquals("sumHeights2([5, 3, 6, 7, 2], 0, 4) → 15", 15, sumHeights2(inputA, 0, 4));
		i++;
	}
	
	public int sumHeights2(int[] heights, int start, int end) {
		  
	}
}
