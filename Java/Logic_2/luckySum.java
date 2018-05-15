/**
 * @author Luis Teixeira
 *
 * @date   03/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Logic_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Given 3 int values, a b c, return their sum. 
However, if one of the values is 13 then it does not count towards 
the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.


luckySum(1, 2, 3) --> 6
luckySum(1, 2, 13) --> 3
luckySum(1, 13, 3) --> 1
 */
public class luckySum {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("luckySum(1, 2, 3) --> 6\n");
		assertEquals("luckySum(1, 2, 3) --> 6", 6, luckySum(1, 2, 3));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("luckySum(1, 2, 13) --> 3\n");
		assertEquals("luckySum(1, 2, 13) --> 3", 3, luckySum(1, 2, 13));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("luckySum(1, 13, 3) --> 1\n");
		assertEquals("luckySum(1, 13, 3) --> 1", 1, luckySum(1, 13, 3));
		i++;
	}
	
	public int luckySum(int a, int b, int c) {
	
		int sum = 0;
		int[] array = {a, b, c};
		
		for (int i : array) {
			
			if (!checkIf13(i)) {
				sum += i;
			}
			
			else {
				break;
			}
		}		
		return sum;
	}
	
	
	public boolean checkIf13(int x) {

		return (x==13);
	}
}
