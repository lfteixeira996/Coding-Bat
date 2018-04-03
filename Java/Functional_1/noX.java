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
Given a list of strings, return a list where each string has all its "x" removed.


noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
noX(["x"]) → [""]
 */
public class noX {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("noX([\"ax\", \"bb\", \"cx\"]) → [\"a\", \"bb\", \"c\"]\n");
		
		List<String> inputA = new ArrayList<String>();
		inputA.add("ax");
		inputA.add("bb");
		inputA.add("cx");
		
		
		List<String> outputA = new ArrayList<String>();
		outputA.add("a");
		outputA.add("bb");
		outputA.add("c");
				
		assertEquals("noX([\"ax\", \"bb\", \"cx\"]) → [\"a\", \"bb\", \"c\"]", outputA, noX(inputA));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("noX([\"xxax\", \"xbxbx\", \"xxcx\"]) → [\"a\", \"bb\", \"c\"]\n");
		
		List<String> inputA = new ArrayList<String>();
		inputA.add("xxax");
		inputA.add("xbxbx");
		inputA.add("xxcx");
		
		
		List<String> outputA = new ArrayList<String>();
		outputA.add("a");
		outputA.add("bb");
		outputA.add("c");
				
		assertEquals("noX([\"xxax\", \"xbxbx\", \"xxcx\"]) → [\"a\", \"bb\", \"c\"]", outputA, noX(inputA));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("noX([\"x\"]) → [\"\"]\n");
		
		List<String> inputA = new ArrayList<String>();
		inputA.add("x");
		
		List<String> outputA = new ArrayList<String>();
		outputA.add("");
				
		assertEquals("noX([\"x\"]) → [\"\"]", outputA, noX(inputA));
		i++;
	}
	
	public List<String> noX(List<String> strings) {
		  
		List<String> ret = new ArrayList<String>();	
		
		for (int i = 0; i < strings.size(); i++) {
			
			ret.add(i, strings.get(i).replaceAll("x", ""));
		}
		
		return ret;	
	}

}
