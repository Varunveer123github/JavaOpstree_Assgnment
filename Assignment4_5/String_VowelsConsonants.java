package Assignment_Package;

//2.	Create a method that takes a string as input and counts:
//  a.	Number of vowels.
//  b.	Number of consonants.
public class String_VowelsConsonants {

	

    public static void countVowelsAndConsonants(String input) {
        int vowels = 0, consonants = 0;
        String lowercaseInput = input.toLowerCase();
        for (char c : lowercaseInput.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        String inputString = "Programming is fun!";
        System.out.println("Input String: " + inputString);
        countVowelsAndConsonants(inputString);    }
}



