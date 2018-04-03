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

Given a list of strings, return a list where each string has "*" added at its end.


addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
addStar(["hello", "there"]) → ["hello*", "there*"]
addStar(["*"]) → ["**"]
 */
public class addStar {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("addStar([\"a\", \"bb\", \"ccc\"]) → [\"a*\", \"bb*\", \"ccc*\"]\n");
		
		List<String> inputA = new ArrayList<String>();
		inputA.add("a");
		inputA.add("bb");
		inputA.add("ccc");
		
		List<String> outputA = new ArrayList<String>();
		outputA.add("a*");
		outputA.add("bb*");
		outputA.add("ccc*");
				
		assertEquals("addStar([\"a\", \"bb\", \"ccc\"]) → [\"a*\", \"bb*\", \"ccc*\"]", outputA, addStar(inputA));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("addStar([\"hello\", \"there\"]) → [\"hello*\", \"there*\"]\n");
		
		List<String> inputA = new ArrayList<String>();
		inputA.add("hello");
		inputA.add("there");
		
		List<String> outputA = new ArrayList<String>();
		outputA.add("hello*");
		outputA.add("there*");
				
		assertEquals("addStar([\"hello\", \"there\"]) → [\"hello*\", \"there*\"]", outputA, addStar(inputA));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("addStar([\"*\"]) → [\"**\"]\n");
		
		List<String> inputA = new ArrayList<String>();
		inputA.add("*");
		
		List<String> outputA = new ArrayList<String>();
		outputA.add("**");
				
		assertEquals("addStar([\"*\"]) → [\"**\"]", outputA, addStar(inputA));
		i++;
	}
	
	public List<String> addStar(List<String> strings) {
		  
		List<String> ret = new ArrayList<String>();
		
		for (int i = 0; i < strings.size(); i++) {
			ret.add(i, strings.get(i) + "*");
		}
		
		return ret;
	}
}
