/**
 * @author Luis Teixeira
 *
 * @date   03/04/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package Logic_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**

Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.


blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
 */
public class blackjack {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("blackjack(19, 21) → 21\n");
		assertEquals("blackjack(19, 21) → 21", 21, blackjack(19, 21));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("blackjack(21, 19) → 21\n");
		assertEquals("blackjack(21, 19) → 21", 21, blackjack(21, 19));
		i++;
	}

	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("blackjack(19, 22) → 19\n");
		assertEquals("blackjack(19, 22) → 19", 19, blackjack(19, 22));
		i++;
	}
	
	public int blackjack(int a, int b) {
		  
		if (a>21 && b>21) {
			return 0;
		}
		
		if (a>21) {
			return b;
		}
		
		if (b>21) {
			return a;
		}
		
		
		int auxA = Math.abs(21-a);
		int auxB = Math.abs(21-b);
		
		if (auxA == auxB) {
			return 0;
		}
		
		else if (auxA < auxB) {
			return a;
		}
		
		else {
			return b;
		}
		
	}
}
