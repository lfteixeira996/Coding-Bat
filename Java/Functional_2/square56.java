/**
 * @author Luis Teixeira
 *
 * @date   04/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Functional_2;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**

Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.

square56([3, 1, 4]) → [19, 11]
square56([1]) → [11]
square56([2]) → [14]
 */
public class square56 {

	private static int i = 1;
	List<Integer> num = new LinkedList<Integer>();
	List<Integer> exp = new LinkedList<Integer>();
	
	@Test
	public void Test1()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("square56([3, 1, 4]) → [19, 11]\n");
		
		//actual
		num.add(3);
		num.add(1);
		num.add(4);
		
		//expected
		exp.add(19);
		exp.add(11);
		
		assertEquals("square56([3, 1, 4]) → [19, 11]", exp, square56(num));
		i++;
	}

	@Test
	public void Test2()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("square56([1]) → [11]\n");
		
		//actual
		num.add(1);
		
		//expected
		exp.add(11);
		
		assertEquals("square56([1]) → [11]", exp, square56(num));
		i++;
	}
	
	@Test
	public void Test3()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("square56([2]) → [14]\n");
		
		//actual
		num.add(2);
		
		//expected
		exp.add(14);
		
		assertEquals("square56([2]) → [14]", exp, square56(num));
		i++;
	}
	
	public List<Integer> square56(List<Integer> nums) {
		 
		List<Integer> ret = new LinkedList<Integer>();
		int aux = 0;
		
		for (int i = 0; i < nums.size(); i++) {
			
			aux = (int) Math.pow(nums.get(i), 2) +10;  
			
			if (aux%10 != 5 && aux%10 != 6) {
				ret.add(aux);
			}
		}
		
		return ret;
	}
}
