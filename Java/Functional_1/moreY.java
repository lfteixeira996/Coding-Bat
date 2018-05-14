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

Given a list of strings, return a list where each string has "y" added at its start and end.


moreY(["a", "b", "c"]) --> ["yay", "yby", "ycy"]
moreY(["hello", "there"]) --> ["yhelloy", "ytherey"]
moreY(["yay"]) --> ["yyayy"]
 */
public class moreY {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("moreY([\"a\", \"b\", \"c\"]) --> [\"yay\", \"yby\", \"ycy\"]\n");
		
		List<String> inputA = new ArrayList<String>();
		inputA.add("a");
		inputA.add("b");
		inputA.add("c");
		
		
		List<String> outputA = new ArrayList<String>();
		outputA.add("yay");
		outputA.add("yby");
		outputA.add("ycy");
				
		assertEquals("moreY([\"a\", \"b\", \"c\"]) --> [\"yay\", \"yby\", \"ycy\"]", outputA, moreY(inputA));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("moreY([\"hello\", \"there\"]) --> [\"yhelloy\", \"ytherey\"]\n");
		
		List<String> inputA = new ArrayList<String>();
		inputA.add("hello");
		inputA.add("there");
		
		List<String> outputA = new ArrayList<String>();
		outputA.add("yhelloy");
		outputA.add("ytherey");
				
		assertEquals("moreY([\"hello\", \"there\"]) --> [\"yhelloy\", \"ytherey\"]", outputA, moreY(inputA));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("moreY([\"yay\"]) --> [\"yyayy\"]\n");
		
		List<String> inputA = new ArrayList<String>();
		inputA.add("yay");
		
		List<String> outputA = new ArrayList<String>();
		outputA.add("yyayy");
				
		assertEquals("moreY([\"yay\"]) --> [\"yyayy\"]", outputA, moreY(inputA));
		i++;
	}
	
	public List<String> moreY(List<String> strings) {
		  
		List<String> ret = new ArrayList<String>();
		
		
		for (int i = 0; i < strings.size(); i++) {
			ret.add(i,"y" + strings.get(i) + "y");
		}
		
		return ret;
	}
}
