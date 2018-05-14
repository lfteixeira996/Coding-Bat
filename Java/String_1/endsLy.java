/**
 * @author Luis Teixeira
 *
 * @date   28/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package String_1;

import static org.junit.Assert.*;

import org.junit.Test;

/*
Given a string, return true if it ends in "ly".

endsLy("oddly") --> true
endsLy("y") --> false
endsLy("oddy") --> false

 */
public class endsLy {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("endsLy(\"oddly\") --> true\n");
		assertEquals("endsLy(\"oddly\") --> true", true, endsLy("oddly"));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("endsLy(\"y\") --> false\n");
		assertEquals("endsLy(\"y\") --> false", false, endsLy("y"));
		i++;
	}

	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("endsLy(\"oddy\") --> false\n");
		assertEquals("endsLy(\"oddy\") --> false", false, endsLy("oddy"));
		i++;
	}
	
	public boolean endsLy(String str) {
		
		if (str.length() < 2) {
			return false;
		}

		return str.substring(str.length()-2, str.length()).equals("ly");
	}

}
