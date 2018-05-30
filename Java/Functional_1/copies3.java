/**
 * @author Luis Teixeira
 *
 * @date   03/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Functional_1;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**

Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.


copies3(["a", "bb", "ccc"]) --> ["aaa", "bbbbbb", "ccccccccc"]
copies3(["24", "a", ""]) --> ["242424", "aaa", ""]
copies3(["hello", "there"]) --> ["hellohellohello", "theretherethere"]
 */
public class copies3 {

	private static int i = 1;
	List<String> num = new LinkedList<String>();
	List<String> exp = new LinkedList<String>();
	
	@Test
	public void Test1()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("copies3([\"a\", \"bb\", \"ccc\"]) --> [\"aaa\", \"bbbbbb\", \"ccccccccc\"]\n");
		
		//actual
		num.add("a");
		num.add("bb");
		num.add("ccc");
		
		//expected
		exp.add("aaa");
		exp.add("bbbbbb");
		exp.add("ccccccccc");

		assertEquals("doubling([1, 2, 3]) --> [2, 4, 6]", exp, copies3(num));
		i++;
	}

	@Test
	public void Test2()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("copies3([\"24\", \"a\", \"\"]) --> [\"242424\", \"aaa\", \"\"]\n");
		
		//actual
		num.add("24");
		num.add("a");
		num.add("");
		
		//expected
		exp.add("242424");
		exp.add("aaa");
		exp.add("");

		assertEquals("copies3([\"24\", \"a\", \"\"]) --> [\"242424\", \"aaa\", \"\"]", exp, copies3(num));
		i++;
	}
	
	@Test
	public void Test3()
	{	
		System.out.println("**********Test "+i+"**********");
		System.out.println("copies3([\"hello\", \"there\"]) --> [\"hellohellohello\", \"theretherethere\"]\n");
		
		//actual
		num.add("hello");
		num.add("there");
		
		//expected
		exp.add("hellohellohello");
		exp.add("theretherethere");

		assertEquals("copies3([\"hello\", \"there\"]) --> [\"hellohellohello\", \"theretherethere\"]", exp, copies3(num));
		i++;
	}
	
	public List<String> copies3(List<String> strings) {
		List<String> ret = new LinkedList<String>(); 
		
		for (int i = 0; i < strings.size(); i++) {	
			ret.add(i, strings.get(i) + strings.get(i) + strings.get(i)); 
		}
		
		return ret;	
	}
}
