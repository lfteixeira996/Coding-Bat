/**
 * @author Luis Teixeira
 *
 * @date   03/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Functional_2;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)


no9([1, 2, 19]) → [1, 2]
no9([9, 19, 29, 3]) → [3]
no9([1, 2, 3]) → [1, 2, 3]
 */
public class no9 {

	private static int i = 1;
	List<Integer> num = new LinkedList<Integer>();
	List<Integer> exp = new LinkedList<Integer>();
	
	@Test
	public void Test1()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("no9([1, 2, 19]) → [1, 2]\n");
		
		//actual
		num.add(1);
		num.add(2);
		num.add(19);
		
		//expected
		exp.add(1);
		exp.add(2);
		
		assertEquals("no9([1, 2, 19]) → [1, 2]", exp, no9(num));
		i++;
	}
	
	@Test
	public void Test2()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("no9([9, 19, 29, 3]) → [3]\n");
		
		//actual
		num.add(9);
		num.add(19);
		num.add(29);
		num.add(3);
		
		//expected
		exp.add(3);
		
		assertEquals("no9([9, 19, 29, 3]) → [3]", exp, no9(num));
		i++;
	}

	@Test
	public void Test3()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("no9([1, 2, 3]) → [1, 2, 3]\n");
		
		//actual
		num.add(1);
		num.add(2);
		num.add(3);
		
		//expected
		exp.add(1);
		exp.add(2);
		exp.add(3);
		
		assertEquals("no9([1, 2, 3]) → [1, 2, 3]", exp, no9(num));
		i++;
	}
	
	public List<Integer> no9(List<Integer> nums) {
		
		List<Integer> ret = new LinkedList<Integer>();
			
		for (int i = 0; i < nums.size(); i++) {
			
			if (nums.get(i) % 10 != 9) {
				ret.add(nums.get(i));
			}
		}
		
		return ret;
	}

}

