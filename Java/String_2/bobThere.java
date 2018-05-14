/**
 * @author Luis Teixeira
 *
 * @date   02/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package String_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.


bobThere("abcbob") --> true
bobThere("b9b") --> true
bobThere("bac") --> false
 */
public class bobThere {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("bobThere(\"abcbob\") --> true\n");
		assertEquals("bobThere(\"abcbob\") --> true", true, bobThere("abcbob"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("bobThere(\"b9b\") --> true\n");
		assertEquals("bobThere(\"b9b\") --> true", true, bobThere("b9b"));
		i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("bobThere(\"bac\") --> false\n");
		assertEquals("bobThere(\"bac\") --> false", false, bobThere("bac"));
		i++;
	}
	
	public boolean bobThere(String str) {
		
		for (int i = 0; i < array.length; i++) {
			
		}
		
		
	}

}
