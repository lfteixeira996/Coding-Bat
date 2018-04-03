/**
 * @author Luis Teixeira
 *
 * @date   29/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Functional_1;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
Given a list of integers, return a list where each integer is multiplied by 2.


doubling([1, 2, 3]) → [2, 4, 6]
doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
doubling([]) → []
 */
public class doubling {

	private static int i = 0;
	List<Integer> num = new LinkedList<Integer>();
	List<Integer> exp = new LinkedList<Integer>();
	
	@Test
	public void Test1()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("doubling([1, 2, 3]) → [2, 4, 6]\n");
		
		//actual
		num.add(1);
		num.add(2);
		num.add(3);
		
		//expected
		exp.add(2);
		exp.add(4);
		exp.add(6);

		assertEquals("doubling([1, 2, 3]) → [2, 4, 6]", exp, doubling(num));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]\n");
		
		//actual
		num.add(6);
		num.add(8);
		num.add(6);
		num.add(8);
		num.add(-1);
		
		//expected
		exp.add(12);
		exp.add(16);
		exp.add(12);
		exp.add(16);
		exp.add(-2);

		assertEquals("doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]", exp, doubling(num));
		i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("doubling([]) → []\n");

		assertEquals("doubling([]) → []", exp, doubling(num));
		i++;
	}
	
	public List<Integer> doubling(List<Integer> nums) {
		 
		List<Integer> ret = new LinkedList<Integer>();
		
		for (int i = 0; i < nums.size(); i++) {	
			ret.add(i, nums.get(i)*2); 
		}
		
		return ret;
	}
}
