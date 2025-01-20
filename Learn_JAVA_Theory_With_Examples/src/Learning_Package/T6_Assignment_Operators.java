package Learning_Package;

//Assignment operators in Java are used to assign values to variables. 
//The most basic operator is the = operator, but Java also provides compound assignment operators 
//to perform operations and assignments in a single step.
//________________________________________
//1. Types of Assignment Operators
//A. Basic Assignment Operator
//   •	Assigns the right-hand operand's value to the left-hand operand.
//   •	Syntax: 
//        variable = value;
//   •	Example: 
//        int a = 10; // Assigns 10 to variable 'a'
//B. Compound Assignment Operators
//   •	Combine an arithmetic or bitwise operation with an assignment.
//   •	Syntax: 
//        variable op= value; // Equivalent to variable = variable op value;
//________________________________________
//2. List of Compound Assignment Operators
//             Operator	Description	Example	Equivalent To
//                +=	Adds and assigns	a += 5;	a = a + 5;
//                -=	Subtracts and assigns	a -= 5;	a = a - 5;
//                *=	Multiplies and assigns	a *= 5;	a = a * 5;
//                /=	Divides and assigns	a /= 5;	a = a / 5;
//                %=	Modulus and assigns	a %= 5;	a = a % 5;
//                &=	Bitwise AND and assigns	a &= 5;	a = a & 5;
//                `	=`	Bitwise OR and assigns	`a
//                ^=	Bitwise XOR and assigns	a ^= 5;	a = a ^ 5;
//                <<=	Left shift and assigns	a <<= 2;	a = a << 2;
//                >>=	Right shift and assigns	a >>= 2;	a = a >> 2;
//                >>>=	Unsigned right shift and assigns	a >>>= 2;	a = a >>> 2;
//________________________________________
//3. Examples
//A. Basic Assignment
//            int x = 10;
//            System.out.println(x); // Output: 10
//B. Compound Assignment
//            int a = 10;
//            a += 5; // a = a + 5
//            System.out.println(a); // Output: 15
//C. Using Bitwise Compound Operators
//            int b = 6;  // Binary: 110
//            b &= 3;     // b = b & 3 (Binary: 110 & 011 = 010)
//            System.out.println(b); // Output: 2
//D. Using Shift Operators
//            int c = 8;  // Binary: 1000
//            c <<= 2;    // c = c << 2 (Shift left by 2 bits: 1000 → 100000)
//            System.out.println(c); // Output: 32
//________________________________________
//4. Key Points for Interviews
//    •	Why use compound operators?
//      They reduce redundancy and improve code readability.
//    •	What happens during += with strings?
//      It concatenates the string with the value.
//      String text = "Hello";
//      text += " World!";
//      System.out.println(text); // Output: Hello World!
//    •	Difference between /= and %=:
//      o	/= performs division and assigns the quotient.
//      o	%= performs division and assigns the remainder.
//    •	Can you use assignment operators with constants?
//      No, because constants (final variables) cannot be reassigned.
//________________________________________
//5. Sample Code

public class T6_Assignment_Operators {
public static void main(String[] args) {
  int a = 10;
  System.out.println("Initial value of a: " + a);

  a += 5; // Add and assign
  System.out.println("After a += 5: " + a);

  a -= 3; // Subtract and assign
  System.out.println("After a -= 3: " + a);

  a *= 2; // Multiply and assign
  System.out.println("After a *= 2: " + a);

  a /= 4; // Divide and assign
  System.out.println("After a /= 4: " + a);

  a %= 3; // Modulus and assign
  System.out.println("After a %= 3: " + a);
}
}
