# Java Recursion Functions

This repository contains a Java solution with recursive functions for various tasks, along with corresponding JUnit test cases to verify their correctness. 
Below are the details of the functions implemented in the `Solution` class and their associated unit tests.

## Functions Implemented

### 1. **Factorial Function (`fact(int n)`)**

This function calculates the factorial of a given number `n` recursively. The factorial of a number is the product of all positive integers less than or equal to that number.

**Example:**

* Input: `5`
* Output: `120` (because `5! = 5 * 4 * 3 * 2 * 1`)

**Base Case:** `n <= 1` returns 1.
**Recursive Case:** `n * fact(n - 1)`.

### 2. **Reverse String Function (`reverseString(String input)`)**

This function reverses the given string using recursion. It recursively reverses the substring and appends the first character at the end.

**Example:**

* Input: `"hello"`
* Output: `"olleh"`

**Base Case:** Empty string returns itself.
**Recursive Case:** `reverseString(input.substring(1)) + input.charAt(0)`.

### 3. **Palindrome Check Function (`isPalindrome(String input)`)**

This function checks if the given string is a palindrome. A palindrome is a word, phrase, or sequence that reads the same forward as backward.

**Example:**

* Input: `"madam"`
* Output: `true` (because `"madam"` is a palindrome)

**Base Case:** String with 0 or 1 character is a palindrome.
**Recursive Case:** Check if the first and last characters are the same, and recursively check the substring without them.

### 4. **Sum of Natural Numbers (`sum(int n)`)**

This function returns the sum of the first `n` natural numbers using recursion.

**Example:**

* Input: `5`
* Output: `15` (because `1 + 2 + 3 + 4 + 5 = 15`)

**Base Case:** `n <= 1` returns `n`.
**Recursive Case:** `n + sum(n - 1)`.

## Example Output

The `main` method demonstrates how to use these functions:

```java
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
```

### Sample Output:

```
The factorial of 5 is 120
Sum of natural numbers from 1 to 100 is 5050
HowDoesitWork reversed is kroWtisedoH
amanaplanacanalpanama is a Palindrome
```

## Testing

JUnit test cases are included to verify the correctness of the recursive functions. The tests cover various edge cases and different inputs for each function:

1. **Factorial Tests:**

   * `fact(5)` returns `120`.
   * `fact(0)` returns `1`.
   * `fact(1)` returns `1`.

2. **Reverse String Tests:**

   * `reverseString("hello")` returns `"olleh"`.
   * `reverseString("")` returns `""` (empty string).
   * `reverseString("a")` returns `"a"`.

3. **Palindrome Tests:**

   * `isPalindrome("madam")` returns `true`.
   * `isPalindrome("hello")` returns `false`.
   * `isPalindrome("")` returns `true` (empty string is considered a palindrome).
   * `isPalindrome("a")` returns `true`.

4. **Sum of Natural Numbers Tests:**

   * `sum(5)` returns `15`.
   * `sum(0)` returns `0`.
   * `sum(1)` returns `1`.

## How to Run

1. Clone this repository.
2. Open the project in your favorite IDE (e.g., IntelliJ, Eclipse).
3. Ensure you have JUnit installed for running tests.
4. Run the `Solution` class to see the example output.
5. To run the unit tests, run the `SolutionTest` class with your IDE's JUnit support or via the command line.

## Conclusion

This repository demonstrates several common recursive problems, including factorial calculation, string reversal, palindrome checking, and summing natural numbers. 
The recursive solutions are efficient and showcase the power of recursion in solving problems elegantly.

## DISCLAIMER

UNDER NO CIRCUMSTANCES SHOULD IMAGES OR EMOJIS BE INCLUDED DIRECTLY 
IN THE README FILE. ALL VISUAL MEDIA, INCLUDING SCREENSHOTS AND IMAGES 
OF THE APPLICATION, MUST BE STORED IN A DEDICATED FOLDER WITHIN THE 
PROJECT DIRECTORY. THIS FOLDER SHOULD BE CLEARLY STRUCTURED AND NAMED 
ACCORDINGLY TO INDICATE THAT IT CONTAINS ALL VISUAL CONTENT RELATED TO 
THE APPLICATION (FOR EXAMPLE, A FOLDER NAMED IMAGES, SCREENSHOTS, OR MEDIA).

I AM NOT LIABLE OR RESPONSIBLE FOR ANY MALFUNCTIONS, DEFECTS, OR ISSUES 
THAT MAY OCCUR AS A RESULT OF COPYING, MODIFYING, OR USING THIS SOFTWARE. 
IF YOU ENCOUNTER ANY PROBLEMS OR ERRORS, PLEASE DO NOT ATTEMPT TO FIX THEM 
SILENTLY OR OUTSIDE THE PROJECT. INSTEAD, KINDLY SUBMIT A PULL REQUEST 
OR OPEN AN ISSUE ON THE CORRESPONDING GITHUB REPOSITORY, SO THAT IT CAN 
BE ADDRESSED APPROPRIATELY BY THE MAINTAINERS OR CONTRIBUTORS.

---
