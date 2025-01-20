package Learning_Package;

//Literals in Java are the constant values that are directly assigned to variables. 
//They represent fixed values that cannot be changed during program execution.
//________________________________________
//1. Types of Literals in Java
//A. Integer Literals
//   •	Represent whole numbers.
//   •	Can be written in: 
//      o	Decimal (Base 10): Default format. 
//                             int decimal = 10;
//      o	Octal (Base 8): Prefixed with 0. 
//                             int octal = 012; // Equivalent to 10 in decimal
//      o	Hexadecimal (Base 16): Prefixed with 0x or 0X. 
//                             int hex = 0xA; // Equivalent to 10 in decimal
//      o	Binary (Base 2): Prefixed with 0b or 0B. 
//                             int binary = 0b1010; // Equivalent to 10 in decimal
//________________________________________
//B. Floating-Point Literals
//   •	Represent decimal numbers.
//   •	By default, they are of type double. Use f or F to specify float. 
//              double pi = 3.14159;
//              float rate = 5.5f;
//________________________________________
//C. Character Literals
//   •	Represent a single character enclosed in single quotes (').
//              char letter = 'A';
//              char unicodeChar = '\u0041'; // Unicode for 'A'
//________________________________________
//D. String Literals
//   •	Represent a sequence of characters enclosed in double quotes ("). 
//   •	String message = "Hello, Java!";
//________________________________________
//E. Boolean Literals
//   •	Represent logical values: true or false. 
//   •	boolean isJavaFun = true;
//________________________________________
//F. Null Literal
//   •	Represents the absence of a value for reference types. 
//   •	String name = null;
//________________________________________
//2. Special Literals
//A. Underscore in Numeric Literals
//   •	Improves readability of large numbers (Java 7+). 
//           int million = 1_000_000;
//B. Literal Suffix
//   •	Used to specify the type of a literal explicitly: 
//          L for long 
//          long bigNumber = 100000L;
//          F for float 
//          float value = 3.14F;
//          D for double (optional, as double is default) 
//          double value = 3.14D;
//________________________________________
//3.                                      Key Points for Interviews
//    •	Why use underscores in numeric literals? To enhance readability, especially in large numbers.
//    •	What is the default type for floating-point literals? double.
//    •	What happens if you assign a large value to an int without suffixing L? Compilation error due to overflow.
//________________________________________
//4. Sample Code
public class T4_Literals {
    public static void main(String[] args) {
        int decimal = 100;
        int binary = 0b1100100;
        int hex = 0x64;
        float pi = 3.14F;
        char letter = 'J';
        String message = "Java Literals";
        boolean isFun = true;

        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Float: " + pi);
        System.out.println("Character: " + letter);
        System.out.println("String: " + message);
        System.out.println("Boolean: " + isFun);
    }
}


