/**
 * @author Luis Teixeira
 *
 * @date   04/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Array_1;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.


start1([1, 2, 3], [1, 3]) --> 2
start1([7, 2, 3], [1]) --> 1
start1([1, 2], []) --> 1
 */
public class start1 {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("start1([1, 2, 3], [1, 3]) --> 2\n");
		
		//input array
		int[] input1 = {1, 2, 3};
		int[] input2 = {1, 3};
		
		assertEquals("start1([1, 2, 3], [1, 3]) --> 2", 2, start1(input1, input2));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("start1([7, 2, 3], [1]) --> 1\n");
		
		//input array
		int[] input1 = {7, 2, 3};
		int[] input2 = {1};
		
		assertEquals("start1([7, 2, 3], [1]) --> 1", 1, start1(input1, input2));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("start1([1, 2], []) --> 1\n");
		
		//input array
		int[] input1 = {1, 2};
		int[] input2 = {};
		
		assertEquals("start1([1, 2], []) --> 1", 1, start1(input1, input2));
		i++;
	}
	
	public int start1(int[] a, int[] b) {
	
		int aux = 0;
		
		if (a[0] == 1 && a.length !=0) {
			aux++;
		}
		
		if (b[0] == 1 && b.length !=0) {
			aux++;
		}
		
		return aux;
	}
}
