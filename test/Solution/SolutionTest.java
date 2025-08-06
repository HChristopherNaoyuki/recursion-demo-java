package Solution;

import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionTest
{
    // Test case for the factorial function
    @Test
    public void testFact()
    {
        // Test for factorial of 5
        int result = Solution.fact(5);
        assertEquals(120, result);  // 5! = 5 * 4 * 3 * 2 * 1 = 120

        // Test for factorial of 0 (should return 1)
        result = Solution.fact(0);
        assertEquals(1, result);  // 0! = 1

        // Test for factorial of 1 (should return 1)
        result = Solution.fact(1);
        assertEquals(1, result);  // 1! = 1
    }

    // Test case for the reverseString function
    @Test
    public void testReverseString()
    {
        // Test for reversing a regular string
        String result = Solution.reverseString("hello");
        assertEquals("olleh", result);

        // Test for reversing an empty string
        result = Solution.reverseString("");
        assertEquals("", result);  // Empty string should return empty string

        // Test for reversing a single character string
        result = Solution.reverseString("a");
        assertEquals("a", result);  // Single character string should return itself
    }

    // Test case for the isPalindrome function
    @Test
    public void testIsPalindrome()
    {
        // Test for a valid palindrome
        boolean result = Solution.isPalindrome("madam");
        assertTrue(result);  // "madam" is a palindrome

        // Test for a non-palindrome
        result = Solution.isPalindrome("hello");
        assertFalse(result);  // "hello" is not a palindrome

        // Test for an empty string (should be considered a palindrome)
        result = Solution.isPalindrome("");
        assertTrue(result);  // Empty string is a palindrome

        // Test for a single character string (should be considered a palindrome)
        result = Solution.isPalindrome("a");
        assertTrue(result);  // Single character is a palindrome
    }

    // Test case for the sum function
    @Test
    public void testSum()
    {
        // Test for sum of numbers from 1 to 5
        int result = Solution.sum(5);
        assertEquals(15, result);  // 1 + 2 + 3 + 4 + 5 = 15

        // Test for sum of numbers from 1 to 0 (edge case)
        result = Solution.sum(0);
        assertEquals(0, result);  // Sum of numbers from 1 to 0 is 0

        // Test for sum of numbers from 1 to 1
        result = Solution.sum(1);
        assertEquals(1, result);  // Sum of numbers from 1 to 1 is 1
    }
}
