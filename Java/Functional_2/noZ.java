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

Given a list of strings, return a list of the strings, 
omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)


noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
noZ(["hziz", "hzello", "hi"]) → ["hi"]
noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
 */
public class noZ {

	private static int i = 1;
	List<String> num = new LinkedList<String>();
	List<String> exp = new LinkedList<String>();
	
	@Test
	public void Test1()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("noZ([\"aaa\", \"bbb\", \"aza\"]) → [\"aaa\", \"bbb\"]\n");
		
		//actual
		num.add("aaa");
		num.add("bbb");
		num.add("aza");
		
		//expected
		exp.add("aaa");
		exp.add("bbb");
		
		assertEquals("noZ([\"aaa\", \"bbb\", \"aza\"]) → [\"aaa\", \"bbb\"]", exp, noZ(num));
		i++;
	}

	@Test
	public void Test2()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("noZ([\"hziz\", \"hzello\", \"hi\"]) → [\"hi\"]\n");
		
		//actual
		num.add("hziz");
		num.add("hzello");
		num.add("hi");
		
		//expected
		exp.add("hi");
		
		assertEquals("noZ([\"hziz\", \"hzello\", \"hi\"]) → [\"hi\"]", exp, noZ(num));
		i++;
	}
	
	@Test
	public void Test3()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("noZ([\"hello\", \"howz\", \"are\", \"youz\"]) → [\"hello\", \"are\"]\n");
		
		//actual
		num.add("hello");
		num.add("howz");
		num.add("are");
		num.add("youz");
		
		//expected
		exp.add("hello");
		exp.add("are");
				
		assertEquals("noZ([\"hello\", \"howz\", \"are\", \"youz\"]) → [\"hello\", \"are\"]", exp, noZ(num));
		i++;
	}
	
	public List<String> noZ(List<String> strings) {
		
		List<String> ret = new LinkedList<String>();
		
		for (int i = 0; i < strings.size(); i++) {
			
			if (!strings.get(i).contains("z")) {
				ret.add(strings.get(i));
			}
		}
		
		return ret;
	}
}
