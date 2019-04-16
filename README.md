# PalindromeAssignment

NearestHigherPalindrome class has a function findNextHigherPalindrome(String s). It finds the smallest palindrome larger than P (the integer value of String s).
The functions tries to keep maximum of MSB bits same in between the input value and to be generated palindrome number.


Note: 
- The function only expects positive integers and returns exception otherwise.
- As largest possible long type palindrome number is 9223372036302733229L, any input value equal or greater than it will result in an exception.

How to execute:
1. Run the main() in class NearestHigherPalindrome.
2. The program will prompt for the number of test cases. Please enter 7.
3. The program will then ask to input integer for each test case.
4. Please enter following numbers (P) and program will generate corresponding smallest palindrome larger than P.
        Input                   Output
    T1: 8                       9
    T2: 2345                    2442
    T3: 57775                   57875
    T4: 9234328                 9234329
    T5: 99999                   100001
    T6: -6754                   Please enter a positive integer
    T7: 9223372036302733230     Next higher palindrome is out of bounds
