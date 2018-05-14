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

Given a list of strings, return a list of the strings, omitting any string length 4 or more.


noLong(["this", "not", "too", "long"]) --> ["not", "too"]
noLong(["a", "bbb", "cccc"]) --> ["a", "bbb"]
noLong(["cccc", "cccc", "cccc"]) --> []
 */
public class noLong {

	private static int i = 1;
	List<String> num = new LinkedList<String>();
	List<String> exp = new LinkedList<String>();
	
	@Test
	public void Test1()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("noLong([\"this\", \"not\", \"too\", \"long\"]) --> [\"not\", \"too\"]\n");
		
		//actual
		num.add("this");
		num.add("not");
		num.add("too");
		num.add("long");
		
		//expected
		exp.add("not");
		exp.add("too");
		
		assertEquals("noLong([\"this\", \"not\", \"too\", \"long\"]) --> [\"not\", \"too\"]", exp, noLong(num));
		i++;
	}

	@Test
	public void Test2()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("noLong([\"a\", \"bbb\", \"cccc\"]) --> [\"a\", \"bbb\"]\n");
		
		//actual
		num.add("a");
		num.add("bbb");
		num.add("cccc");
		
		//expected
		exp.add("a");
		exp.add("bbb");
		
		assertEquals("noLong([\"a\", \"bbb\", \"cccc\"]) --> [\"a\", \"bbb\"]", exp, noLong(num));
		i++;
	}
	
	@Test
	public void Test3()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("noLong([\"cccc\", \"cccc\", \"cccc\"]) --> []\n");
		
		//actual
		num.add("cccc");
		num.add("cccc");
		num.add("cccc");
		
		//expected
		exp.add("");
		
		assertEquals("noLong([\"cccc\", \"cccc\", \"cccc\"]) --> []", exp, noLong(num));
		i++;
	}
	
	public List<String> noLong(List<String> strings) {
		  
		List<String> ret = new LinkedList<String>();
		int x = 0;
		
		for (int i = 0; i < strings.size(); i++) {
			
			if (strings.get(i).length()<4) {
				ret.add(x, strings.get(i));
				x++;
			}
		}
		
		return ret;		
	}
}
