/**
 * @author Luis Teixeira
 *
 * @date   04/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package String_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
Return true if the string "cat" and "dog" appear the same number of times in the given string.


catDog("catdog") --> true
catDog("catcat") --> false
catDog("1cat1cadodog") --> true 
 */
public class catDog {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("catDog(\"catdog\") --> true\n");
		assertEquals("catDog(\"catdog\") --> true", true, catDog("catdog"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("catDog(\"catcat\") --> false\n");
		assertEquals("catDog(\"catcat\") --> false", false, catDog("catcat"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("catDog(\"1cat1cadodog\") --> true\n");
		assertEquals("catDog(\"1cat1cadodog\") --> true", true, catDog("1cat1cadodog"));
		i++;
	}

	
	public boolean catDog(String str) {
		
		if (!str.contains("cat")) {
			return false;
		}
		
		else if (!str.contains("dog")) {
			return false;
		}
		
		else {
			return true;
		}
	}

}
