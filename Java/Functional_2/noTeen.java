/**
 * @author Luis Teixeira
 *
 * @date   04/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Functional_2;

import static org.hamcrest.CoreMatchers.allOf;
import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**

Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.


noTeen([12, 13, 19, 20]) → [12, 20]
noTeen([1, 14, 1]) → [1, 1]
noTeen([15]) → []
 */
public class noTeen {

	private static int i = 1;
	List<Integer> num = new LinkedList<Integer>();
	List<Integer> exp = new LinkedList<Integer>();
	
	@Test
	public void Test1()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("noTeen([12, 13, 19, 20]) → [12, 20]\n");
		
		//actual
		num.add(12);
		num.add(13);
		num.add(19);
		num.add(20);
		
		
		//expected
		exp.add(12);
		exp.add(20);
		
		assertEquals("noTeen([12, 13, 19, 20]) → [12, 20]", exp, noTeen(num));
		i++;
	}

	@Test
	public void Test2()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("noTeen([1, 14, 1]) → [1, 1]\n");
		
		//actual
		num.add(1);
		num.add(14);
		num.add(1);
		
		//expected
		exp.add(1);
		exp.add(1);
		
		assertEquals("noTeen([1, 14, 1]) → [1, 1]", exp, noTeen(num));
		i++;
	}
	
	@Test
	public void Test3()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("noTeen([15]) → []\n");
		
		//actual
		num.add(15);
				
		assertEquals("noTeen([15]) → []", exp, noTeen(num));
		i++;
	}
	
	public List<Integer> noTeen(List<Integer> nums) {
		  
		List<Integer> ret = new LinkedList<Integer>();
		
		for (int i = 0; i < nums.size(); i++) {
			
			if (nums.get(i)<13 || nums.get(i)>19) {
				ret.add(nums.get(i));
			}
		}
		return ret;		
	}
}
