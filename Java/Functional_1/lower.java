/**
 * @author Luis Teixeira
 *
 * @date   03/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Functional_1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).


lower(["Hello", "Hi"]) → ["hello", "hi"]
lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
 */
public class lower {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("lower([\"Hello\", \"Hi\"]) → [\"hello\", \"hi\"]\n");
		
		List<String> inputA = new ArrayList<String>();
		inputA.add("Hello");
		inputA.add("Hi");
		
		List<String> outputA = new ArrayList<String>();
		outputA.add("hello");
		outputA.add("hi");
				
		assertEquals("lower([\"Hello\", \"Hi\"]) → [\"hello\", \"hi\"]", outputA, lower(inputA));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("lower([\"AAA\", \"BBB\", \"ccc\"]) → [\"aaa\", \"bbb\", \"ccc\"]\n");
		
		List<String> inputA = new ArrayList<String>();
		inputA.add("AAA");
		inputA.add("BBB");
		inputA.add("ccc");
		
		List<String> outputA = new ArrayList<String>();
		outputA.add("aaa");
		outputA.add("bbb");
		outputA.add("ccc");
				
		assertEquals("lower([\"AAA\", \"BBB\", \"ccc\"]) → [\"aaa\", \"bbb\", \"ccc\"]", outputA, lower(inputA));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("lower([\"KitteN\", \"ChocolaTE\"]) → [\"kitten\", \"chocolate\"]\n");
		
		List<String> inputA = new ArrayList<String>();
		inputA.add("KitteN");
		inputA.add("ChocolaTE");
		
		List<String> outputA = new ArrayList<String>();
		outputA.add("kitten");
		outputA.add("chocolate");
				
		assertEquals("lower([\"KitteN\", \"ChocolaTE\"]) → [\"kitten\", \"chocolate\"]", outputA, lower(inputA));
		i++;
	}
		
	public List<String> lower(List<String> strings) {
		  
		List<String> ret = new ArrayList<String>();
		
		for (int i = 0; i < strings.size(); i++) {
		
			ret.add(i, strings.get(i).toLowerCase());
		}
		
		return ret;
	}
}
