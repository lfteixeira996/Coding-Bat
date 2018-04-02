/**
 * @author Luis Teixeira
 *
 * @date   02/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Logic_1;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Given three ints, a b c, return true if it is possible to add two of the ints to get the third.


twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false
 */
public class twoAsOne {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("twoAsOne(1, 2, 3) → true\n");
		assertEquals(true, twoAsOne(1, 2, 3));
	    i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("twoAsOne(3, 1, 2) → true\n");
		assertEquals(true, twoAsOne(3, 1, 2));
	    i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("twoAsOne(3, 2, 2) → false\n");
		assertEquals(false, twoAsOne(3, 2, 2));
	    i++;
	}
	
	
	public boolean twoAsOne(int a, int b, int c) {
		
		if (a+b == c) {
			return true;
		}
		
		else if (a+c == b) {
			return true;
		}
		
		else if (b+c == a) {
			return true;
		}
		
		else {
			return false;
		}
	}

}
