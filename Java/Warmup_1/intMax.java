/**
 * @author 	Luis Teixeira
 *
 * @data 	30 May 2018
 *
 * @mail	filipe.teixeira.996@gmail.com 
 */
package Warmup_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*

Given three int values, a b c, return the largest.


intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3

*/
public class intMax {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("intMax(1, 2, 3) → 3\n");
		assertEquals("intMax(1, 2, 3) → 3", 3, intMax(1, 2, 3));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("intMax(1, 3, 2) → 3\n");
		assertEquals("intMax(1, 3, 2) → 3", 3, intMax(1, 3, 2));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("intMax(3, 2, 1) → 3\n");
		assertEquals("intMax(3, 2, 1) → 3", 3, intMax(3, 2, 1));
		i++;
	}
	
	public int intMax(int a, int b, int c) {
		  
	
	}
}
