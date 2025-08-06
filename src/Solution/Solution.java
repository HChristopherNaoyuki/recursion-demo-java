package Solution;

public class Solution
{
    // Factorial function: Returns the factorial of a number
    public static int fact(int n)
    {
        if (n <= 1)
        {
            return 1;  // Base case: if n is 1 or 0, factorial is 1
        }
        else
        {
            return n * fact(n - 1);  // Recursive case: n * factorial of (n-1)
        }
    }

    // Reverse a string: Returns the reversed version of the input string
    public static String reverseString(String input)
    {
        if (input.isEmpty())
        {
            return input;  // Base case: if the string is empty, return it as is
        }
        else
        {
            // Recursive case: reverse the substring and add the first character at the end
            return reverseString(input.substring(1)) + input.charAt(0);
        }
    }

    // Palindrome check: Returns true if the string is a palindrome, otherwise false
    public static boolean isPalindrome(String input)
    {
        // Base case: if the string has 0 or 1 character, it's a palindrome
        if (input.length() <= 1)
        {
            return true;
        }

        // Check if the first and last characters are the same
        if (input.charAt(0) == input.charAt(input.length() - 1))
        {
            // Recursive case: check the substring without the first and last characters
            return isPalindrome(input.substring(1, input.length() - 1));
        }

        return false;  // Return false if the characters don't match
    }

    // Sum of first n natural numbers: Returns the sum from 1 to n
    public static int sum(int n)
    {
        if (n <= 1)
        {
            return n;  // Base case: if n is 1 or 0, return n
        }
        return n + sum(n - 1);  // Recursive case: n + sum of (n-1)
    }

    // Main method: Runs the example operations
    public static void main(String[] args)
    {
        // Factorial of a number (example: 5)
        System.out.println("The factorial of 5 is " + fact(5));

        // Sum of natural numbers from 1 to n (example: 100)
        int n = 100;
        System.out.println("Sum of natural numbers from 1 to " + n + " is " + sum(n));

        // Reverse a string (example: "HowDoesitWork")
        String aString = "HowDoesitWork";
        System.out.println(aString + " reversed is " + reverseString(aString));

        // Palindrome check (example: "amanaplanacanalpanama")
        aString = "amanaplanacanalpanama";
        if (isPalindrome(aString))
        {
            System.out.println(aString + " is a Palindrome");
        }
        else
        {
            System.out.println(aString + " is not a Palindrome");
        }
    }
}
