/**
 * @author Luis Teixeira
 *
 * @date   29/03/2018
 *
 * @mail   filipe.teixeira.996@gmail.com
 */
package AP_1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.


scoresIncreasing([1, 3, 4]) --> true
scoresIncreasing([1, 3, 2]) --> false
scoresIncreasing([1, 1, 4]) --> true
 */
public class scoresIncreasing {

	private static int i = 0;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("scoresIncreasing([1, 3, 4]) --> true\n");
		int[] num = {1, 2, 3};
		assertEquals("scoresIncreasing([1, 3, 4]) --> true", true, scoresIncreasing(num));
		i++;
	}
	
	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("scoresIncreasing([1, 3, 2]) --> false\n");
		int[] num = {1, 3, 2};
		assertEquals("scoresIncreasing([1, 3, 2]) --> false", false, scoresIncreasing(num));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("scoresIncreasing([1, 1, 4]) --> true\n");
		int[] num = {1, 1, 4};
		assertEquals("scoresIncreasing([1, 1, 4]) --> true", true, scoresIncreasing(num));
		i++;
	}
	
	public boolean scoresIncreasing(int[] scores) {
 	
		for (int i = 0; i < scores.length-1; i++) {
			
			if (scores[i] >= scores[++i]) {
				return false;
			}
		}
		
		return true;
	}
}
