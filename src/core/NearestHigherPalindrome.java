package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NearestHigherPalindrome {

	static String reverseString(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	static boolean isPalindrome(String possiblePalindrome) {
		return possiblePalindrome.equals(reverseString(possiblePalindrome));
	}

	static String findNextHigherPalindrome(String s) {
		long num = Long.parseLong(s);
		if (num < 0) {
			throw new RuntimeException("Please enter a positive integer");
		} else if (num > 9223372036302733228L) {
			throw new RuntimeException("Next higher palindrome is out of bounds");
		}
		int len, k, isLengthOdd;
		String temp;
		if (isPalindrome(s)) {
			num++;
			s = String.valueOf(num);
		}
		len = s.length();
		if (len % 2 != 0) {
			temp = s.substring(0, len / 2) + s.charAt(len / 2) + reverseString(s.substring(0, len / 2));
			isLengthOdd = 1;
		} else {
			temp = s.substring(0, len / 2) + reverseString(s.substring(0, len / 2));
			isLengthOdd = 0;
		}
		if (temp.compareTo(s) < 0) {
			k = 1;
			for (int i = 1; i <= (len - len / 2) - isLengthOdd; i++) {
				k *= 10;
			}
			num /= k;
			num++;
			num *= k;
			return findNextHigherPalindrome(String.valueOf(num));
		}
		return temp;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter number of test cases: ");
			int t = Integer.parseInt(br.readLine());

			while (t-- > 0) {
				try {
					System.out.print("Enter Integer: ");
					String s = br.readLine();
					System.out.println("Smallest palindrome larger than " + s + ": "+ findNextHigherPalindrome(s));
				} catch (NumberFormatException e) {
					System.out.println("Entered string could not be converted into a valid integer!");
				} catch (RuntimeException e) {
					System.out.println(e.getMessage());
				}
			}

		} catch (IOException e) {
			System.out.println("Error in IO !");
			e.printStackTrace();
		}

	}
}
