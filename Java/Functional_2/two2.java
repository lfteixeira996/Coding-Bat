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
Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.


two2([1, 2, 3]) → [4, 6]
two2([2, 6, 11]) → [4]
two2([0]) → [0]
 */
public class two2 {

	private static int i = 1;
	List<Integer> num = new LinkedList<Integer>();
	List<Integer> exp = new LinkedList<Integer>();
	
	@Test
	public void Test1()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("two2([1, 2, 3]) → [4, 6]\n");
		
		//actual
		num.add(1);
		num.add(2);
		num.add(3);
		
		//expected
		exp.add(4);
		exp.add(6);
		
		assertEquals("two2([1, 2, 3]) → [4, 6]", exp, two2(num));
		i++;
	}

	@Test
	public void Test2()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("two2([2, 6, 11]) → [4]\n");
		
		//actual
		num.add(2);
		num.add(6);
		num.add(11);
		
		//expected
		exp.add(4);
		
		assertEquals("two2([2, 6, 11]) → [4]", exp, two2(num));
		i++;
	}
	
	@Test
	public void Test3()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("two2([0]) → [0]\n");
		
		//actual
		num.add(0);
		
		//expected
		exp.add(0);
		
		assertEquals("two2([0]) → [0]", exp, two2(num));
		i++;
	}
	
	public List<Integer> two2(List<Integer> nums) {
		
		List<Integer> ret = new LinkedList<Integer>();
		int aux = 0;
		
		for (int i = 0; i < nums.size(); i++) {
			
			aux = nums.get(i)*2;
			
			if (aux % 10 != 2) {
				ret.add(aux);
			}
			
		}
		
		return ret;		
	}
}
