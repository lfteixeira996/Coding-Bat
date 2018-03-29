/**
 * @author Luis Teixeira
 *
 * @date   29/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Functional_2;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
Given a list of integers, return a list of the integers, omitting any that are less than 0.

noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → []
 */
public class noNeg {

	private static int i = 0;
	List<Integer> num = new LinkedList<Integer>();
	List<Integer> exp = new LinkedList<Integer>();
	
	@Test
	public void Test1()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("noNeg([1, -2]) → [1]\n");
		
		//actual
		num.add(1);
		num.add(-2);
		
		//expected
		exp.add(1);

		assertEquals("noNeg([1, -2]) → [1]", exp, noNeg(num));
		i++;
	}

	@Test
	public void Test2()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("noNeg([-3, -3, 3, 3]) → [3, 3]\n");
		
		//actual
		num.add(-3);
		num.add(-3);
		num.add(3);
		num.add(3);
		
		//expected
		exp.add(3);
		exp.add(3);

		assertEquals("noNeg([-3, -3, 3, 3]) → [3, 3]", exp, noNeg(num));
		i++;
	}
	
	@Test
	public void Test3()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("noNeg([-1, -1, -1]) → []\n");
		
		//actual
		num.add(-1);
		num.add(-1);
		num.add(-1);
		
		assertEquals("noNeg([-1, -1, -1]) → []", exp, noNeg(num));
		i++;
	}
	
	public List<Integer> noNeg(List<Integer> nums) {
		  
		List<Integer> ret = new LinkedList<Integer>();
		
		for (int i = 0; i < nums.size(); i++) {
			
			if (nums.get(i) >= 0) {
				ret.add(nums.get(i));
			}
		}
		
		return ret;
	}

}
