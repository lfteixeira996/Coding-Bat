/**
 * @author Luis Teixeira
 *
 * @date   04/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Map_2;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**

We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
Loop over and then return the given array of non-empty strings as follows: if a string matches 
an earlier string in the array, swap the 2 strings in the array. A particular first char can 
only cause 1 swap, so once a char has caused a swap, its later swaps are disabled. 
Using a map, this can be solved making just one pass over the array. More difficult than it looks.


firstSwap(["ab", "ac"]) → ["ac", "ab"]
firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
 */
public class firstSwap {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("firstSwap([\"ab\", \"ac\"]) → [\"ac\", \"ab\"]\n");

		//Input array
	    String[] input =  {"ab", "ac"};
	    
	    //Expected map
	    String[] output =  {"ac", "ab"};
	    
	    assertEquals(output, firstSwap(input));
	    i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("firstSwap([\"ax\", \"bx\", \"cx\", \"cy\", \"by\", \"ay\", \"aaa\", \"azz\"]) → [\"ay\", \"by\", \"cy\", \"cx\", \"bx\", \"ax\", \"aaa\", \"azz\"]\n");

		//Input array
	    String[] input =  {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
	    
	    //Expected map
	    String[] output =  {"ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"};
	    
	    assertEquals(output, firstSwap(input));
	    i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("firstSwap([\"ax\", \"bx\", \"ay\", \"by\", \"ai\", \"aj\", \"bx\", \"by\"]) → [\"ay\", \"by\", \"ax\", \"bx\", \"ai\", \"aj\", \"bx\", \"by\"]\n");

		//Input array
	    String[] input =  {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
	    
	    //Expected map
	    String[] output =  {"ay", "by", "ax", "bx", "ai", "aj", "bx", "by"};
	    
	    assertEquals(output, firstSwap(input));
	    i++;
	}
	
	public String[] firstSwap(String[] strings) {
		  
	}
}
