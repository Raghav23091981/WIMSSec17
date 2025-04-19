/*Design a program for an online word game platform where players enter 
two words and need to determine if the second word is an anagram of the 
first. Ensure the program ignores case sensitivity and spaces in the input. 
Provide appropriate messages for both positive and negative cases.*/

import java.util.Scanner;
import java.util.Arrays;
public class Anangram
{
	public static boolean isAnagram(String str1, String str2)
	{
		str1 = str1.toLowerCase();
	        	str2 = str2.toLowerCase();

	        	if (str1.length() != str2.length()) 
		{
            			return false;
	        	}
		char[] strArray1 = str1.toCharArray();
	        	char[] strArray2 = str2.toCharArray();
        		Arrays.sort(strArray1);
	        	Arrays.sort(strArray2);
        		return Arrays.equals(strArray1, strArray2);
 	}	

    	public static void main(String[] args)
	{
        		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first string:");
        		String msg1 = sc.nextLine();

	        	System.out.println("Enter the second string:");
        		String msg2 = sc.nextLine();

	        	if (isAnagram(msg1, msg2)) 
		{
            			System.out.println("The given strings are anagrams.");
        		}
		else 
		{
            			System.out.println("The given strings are not anagrams.");
        		}
      	}
}