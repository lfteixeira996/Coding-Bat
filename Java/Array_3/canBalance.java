/**
 * @author Luis Teixeira
 *
 * @date   29/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Array_3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
Given a non-empty array, return true if there is a place to split
the array so that the sum of the numbers on one side is equal to 
the sum of the numbers on the other side.


canBalance([1, 1, 1, 2, 1]) --> true
canBalance([2, 1, 1, 2, 1]) --> false
canBalance([10, 10]) --> true 
 */
public class canBalance {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("canBalance([1, 1, 1, 2, 1]) --> true\n");
		int[] numA = {1, 1, 1, 2, 1};
		assertEquals("canBalance([1, 1, 1, 2, 1]) --> true", true, canBalance(numA));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("canBalance([2, 1, 1, 2, 1]) --> false\n");
		int[] numA = {2, 1, 1, 2, 1};
		assertEquals("canBalance([2, 1, 1, 2, 1]) --> false", false, canBalance(numA));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("canBalance([10, 10]) --> true\n");
		int[] numA = {10, 10};
		assertEquals("canBalance([10, 10]) --> true", true, canBalance(numA));
		i++;
	}
	
	public boolean canBalance(int[] nums) {
		  
		int init_index = 0;
		int last_index = (nums.length)-1;
		int init_sum   = 0;
		int last_sum   = 0;
				
		do
		{
			init_sum += nums[init_index];
			last_sum += nums[last_index];
			
			init_index++;
			last_index--;
		}while(init_index != last_index);
		
		System.out.println("init_index = " + init_index);
		System.out.println("last_index = " + last_index);
		
		System.out.println("init_sum = " + init_sum);
		System.out.println("last_sum = " + last_sum);
		
		if (init_sum == last_sum) {
			return true;
		}
		
		return false;
	}

}
