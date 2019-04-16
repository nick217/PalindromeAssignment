# Palindrome Assignment

NearestHigherPalindrome class has a function findNextHigherPalindrome(String s). It finds the smallest palindrome larger than P (the integer value of String s). <br>
The functions tries to keep maximum MSB bits same in between the input value and to be generated palindrome number.


Note: 
- The function only expects positive integers and returns exception otherwise.
- As largest possible long type palindrome number is 9223372036302733229L, any input value equal or greater than it will result in an exception.

## How to execute:
1. Run the main() in class NearestHigherPalindrome.
2. The program will prompt for the number of test cases. Please enter 7.
3. The program will then ask to input integer for each test case.
4. Please enter following numbers (P) and program will generate corresponding smallest palindrome larger than P.

    | T | Input                 | Output                                  |
    | - | :-------------------: | --------------------------------------: |
    | 1 | 8                     | 9                                       |
    | 2 | 2345                  | 2442                                    |
    | 3 | 57775                 | 57875                                   |
    | 4 | 9234328               | 9234329                                 |
    | 5 | 99999                 | 100001                                  |
    | 6 | -6754                 | Please enter a positive integer         |
    | 7 | 9223372036302733230   | Next higher palindrome is out of bounds |
