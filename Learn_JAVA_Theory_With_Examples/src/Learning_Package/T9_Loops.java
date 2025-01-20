package Learning_Package;

//Loops in Java (Interview-Oriented Explanation)
//Loops in Java are used to execute a block of code repeatedly based on a condition. There are three primary types of loops: for, while, and do-while. Each has its specific use cases.
//________________________________________
//1. For Loop
//Definition:
//•	A for loop is used when the number of iterations is known beforehand. It consists of an initialization, condition, and increment/decrement.
//Syntax:
//for (initialization; condition; update) {
//    // Code to execute
//}
//Example:
//for (int i = 1; i <= 5; i++) {
//    System.out.println("Iteration: " + i);
//}
//Key Points:
//•	Best for iterating over arrays or ranges.
//•	Combines initialization, condition, and update in one line for better readability.
//________________________________________
//2. While Loop
//Definition:
//•	A while loop is used when the number of iterations is not known, and the loop continues as long as the condition is true.
//Syntax:
//initialization
//while (condition) {
//    // Code to execute
//update
//}
//Example:
//int i = 1;
//while (i <= 5) {
//    System.out.println("Iteration: " + i);
//    i++;
//}
//Key Points:
//•	The condition is checked before executing the loop body.
//•	Suitable for situations where the loop may not run at all.
//________________________________________
//3. Do-While Loop
//Definition:
//•	A do-while loop is similar to the while loop, but the condition is checked after the loop body is executed. This ensures the loop executes at least once.
//Syntax:
//do {
//    // Code to execute
//} while (condition);
//Example:
//int i = 1;
//do {
//    System.out.println("Iteration: " + i);
//    i++;
//} while (i <= 5);
//Key Points:
//•	Ensures the loop body executes at least once.
//•	Useful when the condition depends on the code executed inside the loop.
//________________________________________
//4. Enhanced For Loop (For-Each Loop)
//Definition:
//•	An enhanced for loop is specifically designed to iterate over collections or arrays.
//Syntax:
//for (type variable : collection) {
//    // Code to execute
//}
//Example:
//int[] numbers = {1, 2, 3, 4, 5};
//for (int num : numbers) {
//    System.out.println("Number: " + num);
//}
//Key Points:
//•	Simplifies iteration over arrays and collections.
//•	Cannot modify the collection or array while iterating.
//________________________________________
//5. Choosing the Right Loop
//Scenario	Recommended Loop	Reason	
//Iterating over a range of numbers	for	Initialization, condition, and update in one line for better readability.	
//Iterating over an array or collection	Enhanced for (for-each)	Simplifies iteration without worrying about index management.	
//Unknown number of iterations (pre-check)	while	Executes as long as the condition is true.	
//At least one execution, even if false	do-while	Ensures the loop body executes at least once.	
//Modifying a collection during iteration	for	Provides control over index and allows modification of the collection.	
//________________________________________
//Comparison of Loops
//        Feature   	For Loop	While Loop	Do-While Loop	     Enhanced                 For Loop
//        Condition      Check	     Before     	Before	           After	                Before
//        Iterations     Known	      Yes	          No	            No	                 Yes (for collections)
//        Use Case	     Ranges,     counters	 Unknown iterations	  At least one execution	Arrays, collections
//         Flexibility	  High	     Moderate	    Moderate	       Low
//________________________________________
//Sample Code for All Loops
public class T9_Loops {
    public static void main(String[] args) {
        // For Loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("For Loop Iteration: " + i);
        }

        // While Loop
        int j = 1;
        while (j <= 3) {
            System.out.println("While Loop Iteration: " + j);
            j++;
        }

        // Do-While Loop
        int k = 1;
        do {
            System.out.println("Do-While Loop Iteration: " + k);
            k++;
        } while (k <= 3);

        // Enhanced For Loop
        int[] numbers = {1, 2, 3};
        for (int num : numbers) {
            System.out.println("Enhanced For Loop: " + num);
        }
    }
}


