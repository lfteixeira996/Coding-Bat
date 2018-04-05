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

Given a list of strings, return a list of the strings, omitting any string length 3 or 4.


no34(["a", "bb", "ccc"]) → ["a", "bb"]
no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
no34(["ccc", "dddd", "apple"]) → ["apple"]
 */
public class no34 {

	private static int i = 1;
	List<String> num = new LinkedList<String>();
	List<String> exp = new LinkedList<String>();
	
	@Test
	public void Test1()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("no34([\"a\", \"bb\", \"ccc\"]) → [\"a\", \"bb\"]\n");
		
		//actual
		num.add("a");
		num.add("bb");
		num.add("ccc");
		
		//expected
		exp.add("a");
		exp.add("bb");
		
		assertEquals("no34([\"a\", \"bb\", \"ccc\"]) → [\"a\", \"bb\"]", exp, no34(num));
		i++;
	}

	@Test
	public void Test2()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("no34([\"a\", \"bb\", \"ccc\", \"dddd\"]) → [\"a\", \"bb\"]\n");
		
		//actual
		num.add("a");
		num.add("bb");
		num.add("ccc");
		num.add("dddd");
		
		
		//expected
		exp.add("a");
		exp.add("bb");
		
		assertEquals("no34([\"a\", \"bb\", \"ccc\", \"dddd\"]) → [\"a\", \"bb\"]", exp, no34(num));
		i++;
	}
	
	@Test
	public void Test3()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("no34([\"ccc\", \"dddd\", \"apple\"]) → [\"apple\"]\n");
		
		//actual
		num.add("ccc");
		num.add("cccc");
		num.add("apple");
		
		//expected
		exp.add("apple");
		
		assertEquals("no34([\"ccc\", \"dddd\", \"apple\"]) → [\"apple\"]", exp, no34(num));
		i++;
	}
	
	public List<String> no34(List<String> strings) {
		
		List<String> ret = new LinkedList<String>();
		
		
		for (int i = 0; i < strings.size(); i++) {
			
			if (strings.get(i).length() != 3 && strings.get(i).length() != 4) {
				ret.add(strings.get(i));
			}
		}
		
		return ret;
	}
}
