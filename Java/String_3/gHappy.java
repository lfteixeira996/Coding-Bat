/**
 * @author Luis Teixeira
 *
 * @date   29/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package String_3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
We'll say that a lowercase 'g' in a string is "happy" if 
there is another 'g' immediately to its left or right.
Return true if all the g's in the given string are happy.


gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
 */
public class gHappy {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("gHappy(\"xxggxx\") → true\n");
		assertEquals("gHappy(\"xxggxx\") → true", true, gHappy("xxggxx"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("gHappy(\"xxgxx\") → false\n");
		assertEquals("gHappy(\"xxgxx\") → false", false, gHappy("xxgxx"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("gHappy(\"xxggyygxx\") → false\n");
		assertEquals("gHappy(\"xxggyygxx\") → false", false, gHappy("xxggyygxx"));
		i++;
	}
	
	public boolean gHappy(String str) {
		  
	}
}
