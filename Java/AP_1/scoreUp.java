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

The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}.
the "answers" array contains a student's answers, with "?" representing a question left blank. 
The two arrays are not empty and are the same length. Return the score for this array of answers,
giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.


scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16
 */
public class scoreUp {

	private static int i = 1;
	
	@Test
	public void Test1()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"c\", \"b\", \"c\"]) → 6\n");
		String[] inputA = {"a", "a", "b", "b"};
		String[] inputB = {"a", "c", "b", "c"};		
		assertEquals("scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"c\", \"b\", \"c\"]) → 6", 6, scoreUp(inputA, inputB));
		i++;
	}

	@Test
	public void Test2()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"a\", \"b\", \"c\"]) → 11\n");
		String[] inputA = {"a", "a", "b", "b"};
		String[] inputB = {"a", "a", "b", "c"};		
		assertEquals("scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"a\", \"b\", \"c\"]) → 11", 11, scoreUp(inputA, inputB));
		i++;
	}
	
	@Test
	public void Test3()
	{
		System.out.println("**********Test "+i+"**********");
		System.out.println("scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"a\", \"b\", \"b\"]) → 16\n");
		String[] inputA = {"a", "a", "b", "b"};
		String[] inputB = {"a", "a", "b", "b"};		
		assertEquals("scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"a\", \"b\", \"b\"]) → 16", 16, scoreUp(inputA, inputB));
		i++;
	}
	
	public int scoreUp(String[] key, String[] answers) {
		  
		int score = 0;
		
		for (int i = 0; i < answers.length; i++) {
			
			if (key[i] == answers[i]) {
				score += 4;
			}
			
			else if (answers[i] == "?") {
				score += 0;
			}
			
			else if (key[i] != answers[i]) {
				score -= 1;
			}
		}
		
		return score;
	}
}
