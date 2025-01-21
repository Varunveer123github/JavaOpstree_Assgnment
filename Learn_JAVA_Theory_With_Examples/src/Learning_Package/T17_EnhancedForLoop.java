package Learning_Package;

//The enhanced for loop (also known as the for-each loop) in Java is a simpler and more readable way  
//to iterate over arrays or collections. It was introduced in Java 5 and is particularly useful when 
//you need to traverse all elements in a collection or array without worrying about index management.
//________________________________________
//Syntax
//        for (type variable : collection) {
//               // code block
//          }
//Components:
//   1.	type: The data type of the elements in the collection or array.
//   2.	variable: A temporary variable that holds each element during iteration.
//   3.	collection: The array or collection being traversed.
//________________________________________
//Examples
//      Example 1: Iterating Over an Array
//           public class EnhancedForLoopExample {
//           public static void main(String[] args) {
//           int[] numbers = {1, 2, 3, 4, 5};
//
//         for (int num : numbers) {
//            System.out.println("Number: " + num);
//               }
//            }
//           }
//Output:
//Number: 1
//Number: 2
//Number: 3
//Number: 4
//Number: 5
//________________________________________
//Example 2: Iterating Over a Collection (e.g., List)
//         import java.util.ArrayList;
//         import java.util.List;
//
//          public class EnhancedForLoopExample {
//             public static void main(String[] args) {
//               List<String> names = new ArrayList<>();
//                names.add("Alice");
//                names.add("Bob");
//                names.add("Charlie");
//
//             for (String name : names) {
//               System.out.println("Name: " + name);
//                       }
//                  }
//             }
//Output:
//Name: Alice
//Name: Bob
//Name: Charlie
//________________________________________
//Example 3: Iterating Over a 2D Array
//public class EnhancedForLoopExample {
//    public static void main(String[] args) {
//        int[][] matrix = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//        };
//
//        for (int[] row : matrix) {
//            for (int num : row) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//Output:
//1 2 3 
//4 5 6 
//7 8 9
//________________________________________
//Advantages of Enhanced For Loop
//   1.	Simpler Syntax: No need to manage loop counters or worry about IndexOutOfBoundsException.
//   2.	Readability: Easier to read and understand, especially for beginners.
//   3.	Safety: Reduces the risk of off-by-one errors since there are no explicit indices.
//________________________________________
//Limitations of Enhanced For Loop
//   1.	Read-Only Access: The enhanced for loop does not provide access to the index of the current element. If you need to modify elements or access their indices, you must use a traditional for loop or an iterator.
//   2.	Non-Backward Traversal: You cannot iterate in reverse order using the enhanced for loop.
//   3.	Limited Control: Cannot remove elements from a collection during iteration.
//________________________________________
//Comparison with Traditional For Loop
//Traditional For Loop:
//int[] numbers = {1, 2, 3, 4, 5};
//
//for (int i = 0; i < numbers.length; i++) {
//    System.out.println("Number: " + numbers[i]);
//}
//Enhanced For Loop:
//int[] numbers = {1, 2, 3, 4, 5};
//
//for (int num : numbers) {
//    System.out.println("Number: " + num);
//}
//Enhanced for loop is more concise and eliminates the need for manual indexing, making the 
//code cleaner and less error-prone.
//________________________________________
//When to Use Enhanced For Loop
//   1.	When you need to iterate through all elements of an array or collection.
//   2.	When you do not need access to the element indices.
//   3.	When you do not need to modify the structure of the collection during iteration.
//________________________________________
//Conclusion
//The enhanced for loop is a powerful feature for simplifying iteration over arrays and collections. 
//It improves code readability and reduces the likelihood of errors, making it a preferred choice for 
//most iteration tasks. However, for scenarios requiring index-based operations or modifications, a 
//traditional for loop or an iterator is more appropriate.


