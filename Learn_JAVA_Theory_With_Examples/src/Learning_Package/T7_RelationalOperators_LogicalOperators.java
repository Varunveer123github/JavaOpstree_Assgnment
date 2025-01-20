package Learning_Package;
//Relational Operators in Java (Interview-Oriented Explanation)
//Relational operators in Java are used to compare two values. 
//They return a boolean result (true or false) based on the comparison.
//________________________________________
//1. List of Relational Operators
//      Operator	Description       	        Example 	Result
//     -------------------------------------------------------------------
//        ==    	Equal to        	        5 == 5	    true
//        !=	    Not equal to     	        5 != 3   	true
//        >     	Greater than    	        5 > 3   	true
//        <     	Less than       	        3 < 5   	true
//        >=    	Greater than or equal to	5 >= 5  	true
//        <=    	Less than or equal to    	3 <= 5  	true
//      --------------------------------------------------------------------
//________________________________________
//2. Example Code
//    public class RelationalOperatorsDemo {
//    public static void main(String[] args) {
//        int a = 10, b = 20;
//
//        System.out.println("a == b: " + (a == b)); // false
//        System.out.println("a != b: " + (a != b)); // true
//        System.out.println("a > b: " + (a > b));   // false
//        System.out.println("a < b: " + (a < b));   // true
//        System.out.println("a >= b: " + (a >= b)); // false
//        System.out.println("a <= b: " + (a <= b)); // true
//    }
//}
//________________________________________
//3.                                      Key Points for Interviews
//         1.	Relational operators are commonly used in conditional statements like if and loops.
//         2.	The == operator checks for value equality for primitives and reference equality for objects.
//         3.	Use .equals() for comparing object content instead of ==.
// 
//________________________________________
//1. == Operator
//   •	Purpose: Compares references (memory addresses) for objects and values for primitive types.
//   •	Use Case:
//      o	For primitives: It checks if the two values are the same.
//      o	For objects: It checks if the two references point to the same memory location 
//                         (i.e., the same object in memory).
//2. .equals() Method
//   •	Purpose: Compares the content (logical equality) of two objects.
//   •	Use Case:
//      o	Defined in the Object class, and by default, it behaves like ==.
//      o	Typically overridden in classes like String, Integer, and user-defined classes to provide 
//          content-based equality.
// =============================================================================================================
// =============================================================================================================
//Logical Operators in Java (Interview-Oriented Explanation)
//Logical operators in Java are used to perform logical operations, primarily in decision-making and conditional expressions. They operate on boolean values and return a boolean result.
//________________________________________
//1. List of Logical Operators
//        Operator         	Description           	Example    	           Result
//---------------------------------------------------------------------------------------
//           &&	             Logical AND	     (5 > 3) && (8 > 6)	        true
//           ||	             Logical OR          (5 > 3) || (8 > 6)         true
//           !	             Logical NOT	       !(5 > 3)	                false
//---------------------------------------------------------------------------------------
//________________________________________
//2. Explanation of Logical Operators
//A. Logical AND (&&)
//   •	Returns true if both conditions are true.
//   •	Short-circuiting: Stops evaluating if the first condition is false.
//B. Logical OR (||)
//   •	Returns true if at least one condition is true.
//   •	Short-circuiting: Stops evaluating if the first condition is true.
//C. Logical NOT (!)
//   1.	Reverses the boolean value of the condition.
//________________________________________
//3. Example Code
public class T7_RelationalOperators_LogicalOperators {
    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("condition1 && condition2: " + (condition1 && condition2)); // false
        System.out.println("condition1 || condition2: " + (condition1 || condition2)); // true
        System.out.println("!condition1: " + (!condition1)); // false
    }
}
//________________________________________
//4.                                   Key Points for Interviews
//    •	Short-Circuit Behavior: 
//      o	&& stops evaluating if the first condition is false.
//      o	|| stops evaluating if the first condition is true.
//    •	Logical operators are commonly used in complex conditional statements.
//________________________________________
//Relational vs Logical Operators
//-------------------------------------------------------------------------------------------------------
//           Aspect             	Relational Operators	Logical Operators
//-------------------------------------------------------------------------------------------------------
//           Purpose            	Compare two values	    Combine multiple boolean conditions
//           Return Type	        Boolean             	Boolean
//           Examples            	==, !=, <, >	        &&, `
//-------------------------------------------------------------------------------------------------------


