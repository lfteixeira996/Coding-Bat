/**
 * @author Luis Teixeira
 *
 * @date   04/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Warmup_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


altPairs("kitten") --> "kien"
altPairs("Chocolate") --> "Chole"
altPairs("CodingHorror") --> "Congrr"
 */
public class altPairs {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("altPairs(\"kitten\") --> \"kien\"\n");
		
		//array
		String input = "kitten";
				
	    assertEquals("kien", altPairs(input));
	    i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("altPairs(\"Chocolate\") --> \"Chole\"\n");
		
		//array
		String input = "Chocolate";
				
	    assertEquals("Chole", altPairs(input));
	    i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("altPairs(\"CodingHorror\") --> \"Congrr\"\n");
		
		//array
		String input = "CodingHorror";
				
	    assertEquals("Congrr", altPairs(input));
	    i++;
	}
	
	
	public String altPairs(String str) {
		  
	}
}
