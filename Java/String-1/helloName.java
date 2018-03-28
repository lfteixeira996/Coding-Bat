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
 * 
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
 */
public class helloName {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("helloName(\"Bob\") → \"Hello Bob!\"\n");
		assertEquals("helloName(\"Bob\") → \"Hello Bob!\"", "Hello Bob!", helloName("Bob"));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("helloName(\"Alice\") → \"Hello Alice!\"\n");
		assertEquals("helloName(\"Alice\") → \"Hello Alice!\"", "Hello Alice!", helloName("Alice"));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("helloName(\"X\") → \"Hello X!\"\n");
		assertEquals("helloName(\"X\") → \"Hello X!\"", "Hello X!", helloName("X"));
		i++;
	}
	
	public String helloName(String name) {
		  
		return "Hello "+name+"!";
	}
}
