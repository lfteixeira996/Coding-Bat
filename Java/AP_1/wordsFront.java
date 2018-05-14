/**
 * @author Luis Teixeira
 *
 * @date   03/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package AP_1;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.


wordsFront(["a", "b", "c", "d"], 1) --> ["a"]
wordsFront(["a", "b", "c", "d"], 2) --> ["a", "b"]
wordsFront(["a", "b", "c", "d"], 3) --> ["a", "b", "c"]
 */
public class wordsFront {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("wordsFront([\"a\", \"b\", \"c\", \"d\"], 1) --> [\"a\"]\n");
		String[] inputA = {"a", "b", "c", "d"};
		String[] outputA = {"a"};		
		assertEquals("wordsFront([\"a\", \"b\", \"c\", \"d\"], 1) --> [\"a\"]", outputA, wordsFront(inputA, 1));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("wordsFront([\"a\", \"b\", \"c\", \"d\"], 2) --> [\"a\", \"b\"]\n");
		String[] inputA = {"a", "b", "c", "d"};
		String[] outputA = {"a", "b"};		
		assertEquals("wordsFront([\"a\", \"b\", \"c\", \"d\"], 2) --> [\"a\", \"b\"]", outputA, wordsFront(inputA, 2));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("wordsFront([\"a\", \"b\", \"c\", \"d\"], 3) --> [\"a\", \"b\", \"c\"]\n");
		String[] inputA = {"a", "b", "c", "d"};
		String[] outputA = {"a", "b", "c"};		
		assertEquals("wordsFront([\"a\", \"b\", \"c\", \"d\"], 3) --> [\"a\", \"b\", \"c\"]", outputA, wordsFront(inputA, 3));
		i++;
	}
	
	public String[] wordsFront(String[] words, int n) {
		  
		String[] ret = new String[n];
	
		for (int i = 0; i < n; i++) {
			
			ret[i] = words[i];
		}
		
		return ret;
	}
}
