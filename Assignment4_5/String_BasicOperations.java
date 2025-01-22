package Assignment_Package;

//Tasks:
//1.	Write a program to demonstrate basic string operations:
//  a.	Concatenation.
//  b.	Substring.
//  c.	Replace characters.
//  d.	Convert to uppercase and lowercase.
//2.	Create a method that takes a string as input and counts:
//  a.	Number of vowels.
//  b.	Number of consonants.

public class String_BasicOperations {

	

	  

	    public static void main(String[] args) {
	        String str1 = "Hello";
	        String str2 = "World";

	        String concatenated = str1 + " " + str2;
	        System.out.println("Concatenated String: " + concatenated);

	        String substring = concatenated.substring(6, 11); 
	        System.out.println("Substring: " + substring);

	        String replacedString = concatenated.replace('l', '*');
	        System.out.println("Replaced String: " + replacedString);

	        System.out.println("Uppercase: " + concatenated.toUpperCase());
	        System.out.println("Lowercase: " + concatenated.toLowerCase());

	       
	    }
	}


