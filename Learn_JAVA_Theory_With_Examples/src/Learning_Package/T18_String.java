package Learning_Package;

//In Java, a String is a sequence of characters, used to represent text. 
//Strings are one of the most commonly used data types in Java and are represented by the String class, 
//which is part of the java.lang package.
//________________________________________
//Key Features of Strings in Java
//   1.	Immutable: Strings in Java are immutable, meaning once a String object is created, 
//                 it cannot be changed. Any operation that modifies a string creates a new String object.
//   2.	Stored in String Pool: Java uses a String Pool (a special memory area in the heap) to store string 
//                             literals. If a string with the same value already exists in the pool, a new 
//                             reference to the existing string is returned instead of creating a new object.
//   3.	String Class: The String class is final, which means it cannot be subclassed.
//   4.	Implements Interfaces: The String class implements the CharSequence, Serializable, 
//                             and Comparable<String> interfaces.
//________________________________________
//Creating Strings
//Strings can be created in two ways:
//   1.	Using String Literals:
//               String str = "Hello, World!";
//      o	When a string is created using a literal, it is stored in the String Pool.
//   2.	Using the new Keyword:
//               String str = new String("Hello, World!");
//      o	This creates a new String object in the heap, even if the same string exists in the String Pool.
//________________________________________
//String Methods

//The String class provides a wide range of methods for string manipulation. 
//Below are some commonly used methods:
//1. Length of a String
//        String str = "Hello";
//        System.out.println(str.length());  // Output: 5
//2. Concatenation
//        String str1 = "Hello";
//        String str2 = "World";
//        String result = str1.concat(", ").concat(str2);
//        System.out.println(result);  // Output: Hello, World
//3. Character at a Specific Index
//        String str = "Hello";
//        System.out.println(str.charAt(1));  // Output: e
//4. Substring
//        String str = "Hello, World!";
//        System.out.println(str.substring(7));     // Output: World!
//        System.out.println(str.substring(0, 5));  // Output: Hello
//5. Replace Characters
//        String str = "Hello";
//        System.out.println(str.replace('l', 'p'));  // Output: Heppo
//6. Convert to Upper/Lower Case
//        String str = "Hello";
//        System.out.println(str.toUpperCase());  // Output: HELLO
//        System.out.println(str.toLowerCase());  // Output: hello
//7. Trim Whitespace
//        String str = "  Hello  ";
//        System.out.println(str.trim());  // Output: Hello
//8. Check Equality
//        String str1 = "Hello";
//        String str2 = "hello";
//        System.out.println(str1.equals(str2));         // Output: false
//        System.out.println(str1.equalsIgnoreCase(str2));  // Output: true
//9. Split a String
//        String str = "apple,banana,orange";
//        String[] fruits = str.split(",");
//           for (String fruit : fruits) {
//                System.out.println(fruit);
//                }
//      Output:
//          apple
//          banana
//          orange
//10. Check if String Contains a Substring
//        String str = "Hello, World!";
//        System.out.println(str.contains("World"));  // Output: true
//________________________________________
//String Comparison
//    1.Using equals: Compares the content of two strings.
//        	String str1 = "Hello";
//        	String str2 = "Hello";
//       	System.out.println(str1.equals(str2));  // Output: true
//    2.Using ==: Compares the references of two strings.
//      	String str1 = "Hello";
//       	String str2 = new String("Hello");
//         	System.out.println(str1 == str2);  // Output: false
//    3.Using compareTo: Compares strings lexicographically.
//      	String str1 = "apple";
//      	String str2 = "banana";
//       	System.out.println(str1.compareTo(str2));  // Output: -1
//________________________________________
//StringBuffer and StringBuilder
//If you need a mutable sequence of characters, you can use:
//  1.	StringBuffer: Thread-safe, but slower.
//  2.	StringBuilder: Not thread-safe, but faster.
//________________________________________
//Why Strings Are Immutable
//  1.	Security: Immutable strings are safer for sensitive data like usernames or passwords.
//  2.	String Pool Optimization: Allows Java to reuse strings, saving memory.
//  3.	Thread-Safety: Immutable objects are inherently thread-safe.
//________________________________________
//Conclusion
//Strings are an essential part of Java programming. Their immutability, combined with a rich set of methods, 
//makes them versatile and efficient for text manipulation. However, for performance-critical applications 
//requiring frequent modifications, StringBuffer or StringBuilder should be used.
//=========================================================================================================
//=========================================================================================================
//mutable or immutable String
// 
//In Java, strings can be mutable or immutable based on the class used to create them. 
//The String class represents immutable strings, while the StringBuilder and StringBuffer classes 
//represent mutable strings.
//________________________________________
//1. Immutable String
//   An immutable string is a string whose content cannot be changed after it is created. 
//   The String class in Java is immutable.
//Key Characteristics of Immutable Strings:
//   1.	No Modification: Any operation that modifies a string (e.g., concatenation, replacement) creates 
//                       a new String object instead of modifying the existing one.
//   2.	Thread-Safe: Immutable strings are inherently thread-safe because their state cannot be changed after creation.
//   3.	Memory Efficiency: Java maintains a String Pool for string literals. If two strings have the same content, they can share the same memory in the pool.
//Example:
//public class ImmutableStringExample {
//    public static void main(String[] args) {
//        String str = "Hello";
//        str.concat(" World");  // Creates a new string "Hello World", but `str` still points to "Hello"
//        System.out.println(str);  // Output: Hello
//
//        str = str.concat(" World");  // Assigns the new string to `str`
//        System.out.println(str);  // Output: Hello World
//    }
//}
//________________________________________
//2. Mutable String
//   A mutable string is a string whose content can be modified after it is created. 
//   In Java, StringBuilder and StringBuffer classes are used to create mutable strings.
//Key Characteristics of Mutable Strings:
//   1.	Modification Allowed: Methods like append(), insert(), delete(), etc., modify the original object instead of creating a new one.
//   2.	Better Performance: Mutable strings are more efficient for scenarios involving frequent modifications, as they avoid creating multiple objects.
//   3.	Thread-Safety: 
//      o	StringBuilder: Not thread-safe but faster.
//      o	StringBuffer: Thread-safe but slower due to synchronization.
//   Example with StringBuilder:
//       public class MutableStringExample {
//       public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.append(" World");  // Modifies the original object
//        System.out.println(sb);  // Output: Hello World
//           }
//        }
//   Example with StringBuffer:
//       public class MutableStringBufferExample {
//       public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer("Hello");
//        sb.append(" World");  // Modifies the original object
//        System.out.println(sb);  // Output: Hello World
//    }
//}
//________________________________________
//Comparison: Immutable vs Mutable Strings

//  Feature	              Strings (String)	                           Mutable Strings (StringBuilder / StringBuffer)
//----------------------------------------------------------------------------------------------------------
//  Modifiability	       be modified (immutable).	                               Can be modified (mutable).
//  Thread-Safety	       Thread-safe by default.	            StringBuilder: Not thread-safe.StringBuffer: Thread-safe.
//  Performance  Slower for frequent modifications (creates new objects).	Faster for frequent modifications (modifies the same object).
//  Memory Usage	May create multiple objects in memory.	    Uses the same object, reducing memory usage.
//  Use Case	When strings are rarely modified or shared across threads.	When strings are frequently modified.
//  Example               Classes	 String	                                          StringBuilder, StringBuffer
//________________________________________
//When to Use Which?
//1.	Use String:
//      o	When strings are rarely modified.
//      o	When working with string literals.
//      o	When thread-safety is not a concern, and immutability is desired for security or simplicity.
//2.	Use StringBuilder:
//      o	When strings are frequently modified (e.g., concatenation in loops).
//      o	When thread-safety is not required.
//3.	Use StringBuffer:
//      o	When strings are frequently modified and thread-safety is required.
//________________________________________
//Example: Performance Comparison
//public class T18_String {
//
//    public static void main(String[] args) {
//
//        // Immutable String
//        String immutableString = "Hello";
//        System.out.println("Original String: " + immutableString);
//
//        // Trying to modify immutable String
//        immutableString += " World"; // Creates a new String object
//        System.out.println("After Modification (String): " + immutableString);
//
//        // StringBuilder (not thread-safe, but faster)
//        StringBuilder stringBuilder = new StringBuilder("Hello");
//        System.out.println("\nOriginal StringBuilder: " + stringBuilder);
//
//        // Append operation
//        stringBuilder.append(" World");
//        System.out.println("After Append (StringBuilder): " + stringBuilder);
//
//        // Insert operation
//        stringBuilder.insert(6, "Beautiful ");
//        System.out.println("After Insert (StringBuilder): " + stringBuilder);
//
//        // Reverse operation
//        stringBuilder.reverse();
//        System.out.println("After Reverse (StringBuilder): " + stringBuilder);
//
//        // Replace operation
//        stringBuilder.reverse(); // Reversing back
//        stringBuilder.replace(6, 15, "Amazing");
//        System.out.println("After Replace (StringBuilder): " + stringBuilder);
//
//        // StringBuffer (thread-safe, but slower)
//        StringBuffer stringBuffer = new StringBuffer("Hello");
//        System.out.println("\nOriginal StringBuffer: " + stringBuffer);
//
//        // Append operation
//        stringBuffer.append(" World");
//        System.out.println("After Append (StringBuffer): " + stringBuffer);
//
//        // Insert operation
//        stringBuffer.insert(6, "Great ");
//        System.out.println("After Insert (StringBuffer): " + stringBuffer);
//
//        // Reverse operation
//        stringBuffer.reverse();
//        System.out.println("After Reverse (StringBuffer): " + stringBuffer);
//
//        // Replace operation
//        stringBuffer.reverse(); // Reversing back
//        stringBuffer.replace(6, 11, "Fantastic");
//        System.out.println("After Replace (StringBuffer): " + stringBuffer);
//
//        // Performance Comparison
//        long startTime, endTime;
//
//        // String performance
//        startTime = System.currentTimeMillis();
//        String str = "";
//        for (int i = 0; i < 10000; i++) {
//            str += i; // Creates new String objects each time
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println("\nTime taken by String: " + (endTime - startTime) + "ms");
//
//        // StringBuilder performance
//        startTime = System.currentTimeMillis();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 10000; i++) {
//            sb.append(i);
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + "ms");
//
//        // StringBuffer performance
//        startTime = System.currentTimeMillis();
//        StringBuffer sf = new StringBuffer();
//        for (int i = 0; i < 10000; i++) {
//            sf.append(i);
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + "ms");
//    }
//}

//output
//Original String: Hello
//After Modification (String): Hello World
//
//Original StringBuilder: Hello
//After Append (StringBuilder): Hello World
//After Insert (StringBuilder): Hello Beautiful World
//After Reverse (StringBuilder): dlroW lufituaeB olleH
//After Replace (StringBuilder): Hello Amazing World
//
//Original StringBuffer: Hello
//After Append (StringBuffer): Hello World
//After Insert (StringBuffer): Hello Great World
//After Reverse (StringBuffer): dlroW taerG olleH
//After Replace (StringBuffer): Hello Fantastic World
//
//Time taken by String: 69ms
//Time taken by StringBuilder: 1ms
//Time taken by StringBuffer: 0ms

//________________________________________
//Conclusion
// •	Use immutable strings (String) when immutability is required for thread safety, security, or simplicity.
// •	Use mutable strings (StringBuilder or StringBuffer) for better performance in scenarios involving frequent string modifications.
// 
//StringBuffer and StringBuilder
//
// 
//In Java, StringBuffer and StringBuilder are classes used to create and manipulate mutable strings, meaning their content can be modified after creation. Both are alternatives to the immutable String class when frequent modifications to strings are needed.
//________________________________________
//Key Differences Between StringBuffer and StringBuilder
//   Feature	              StringBuffer	                  StringBuilder
//------------------------------------------------------------------------------------------
// Mutability	                 Mutable	                     Mutable
// Thread-Safety	          Thread-safe (synchronized).	Not thread-safe (no synchronization).
// Performance	            Slower due to synchronization.	Faster as it is not synchronized.
// Use Case	            Use in multithreaded environments.	Use in single-threaded environments.
//________________________________________
//StringBuffer
//The StringBuffer class is thread-safe because its methods are synchronized. This makes it suitable for use in multithreaded applications where multiple threads may access or modify the same string.
//Example:
//public class StringBufferExample {
//    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer("Hello");
//        sb.append(" World");  // Appends to the existing string
//        sb.insert(6, "Java ");  // Inserts "Java " at index 6
//        sb.replace(6, 10, "Beautiful");  // Replaces "Java" with "Beautiful"
//        sb.delete(6, 15);  // Deletes "Beautiful"
//        sb.reverse();  // Reverses the string
//        System.out.println(sb);  // Output: !dlroW olleH
//    }
//}
//________________________________________
//StringBuilder
//The StringBuilder class is not thread-safe but is faster than StringBuffer because it does not have synchronized methods. It is suitable for single-threaded applications.
//Example:
//public class StringBuilderExample {
//    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.append(" World");  // Appends to the existing string
//        sb.insert(6, "Java ");  // Inserts "Java " at index 6
//        sb.replace(6, 10, "Beautiful");  // Replaces "Java" with "Beautiful"
//        sb.delete(6, 15);  // Deletes "Beautiful"
//        sb.reverse();  // Reverses the string
//        System.out.println(sb);  // Output: !dlroW olleH
//    }
//}
//
//________________________________________
//Performance Comparison
//Code Example:
//public class PerformanceComparison {
//    public static void main(String[] args) {
//        long startTime, endTime;
//
//        // StringBuffer
//        StringBuffer sbf = new StringBuffer("Hello");
//        startTime = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++) {
//            sbf.append(" World");
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println("StringBuffer Time: " + (endTime - startTime) + "ms");
//
//        // StringBuilder
//        StringBuilder sbd = new StringBuilder("Hello");
//        startTime = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++) {
//            sbd.append(" World");
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println("StringBuilder Time: " + (endTime - startTime) + "ms");
//    }
//}
//Output (Example):
//StringBuffer Time: 15ms
//StringBuilder Time: 5ms
//________________________________________
//When to Use Which?
//1.	Use StringBuffer:
//o	When working in a multithreaded environment.
//o	When thread safety is required.
//2.	Use StringBuilder:
//o	When working in a single-threaded environment.
//o	When performance is critical, and thread safety is not a concern.
//________________________________________
//Conclusion
//•	Use StringBuffer for thread-safe mutable strings in concurrent environments.
//•	Use StringBuilder for faster mutable strings in single-threaded applications.
//•	Both are better choices than String when frequent modifications are needed, as they avoid creating multiple objects.
// 

//=======================================================================================================
//=======================================================================================================

//### **Commonly Used String Methods**
//Here are some of the most frequently used built-in methods:
//
//#### **1. Length and Character Access**
//  - `int length()`  
//  Returns the number of characters in the string.  
//  Example:
//  ```java
//  String str = "Java";
//  System.out.println(str.length()); // Output: 4
//  ```
//   - `char charAt(int index)`  
//  Returns the character at the specified index.  
//  Example:
//  ```java
//  String str = "Java";
//  System.out.println(str.charAt(1)); // Output: 'a'
//  ```
//
//#### **2. Case Conversion**
//   - `String toUpperCase()`  
//  Converts all characters to uppercase.  
//  Example:
//  ```java
//  String str = "java";
//  System.out.println(str.toUpperCase()); // Output: "JAVA"
//  ```
//   - `String toLowerCase()`  
//  Converts all characters to lowercase.  
//  Example:
//  ```java
//  String str = "JAVA";
//  System.out.println(str.toLowerCase()); // Output: "java"
//  ```
//
//#### **3. Substring Extraction**
//   - `String substring(int beginIndex)`  
//  Returns a substring from the specified index to the end.  
//  Example:
//  ```java
//  String str = "Hello World";
//  System.out.println(str.substring(6)); // Output: "World"
//  ```
//   - `String substring(int beginIndex, int endIndex)`  
//  Returns a substring from `beginIndex` to `endIndex - 1`.  
//  Example:
//  ```java
//  String str = "Hello World";
//  System.out.println(str.substring(0, 5)); // Output: "Hello"
//  ```
//
//#### **4. String Comparison**
//   - `boolean equals(Object another)`  
//  Compares two strings for equality.  
//  Example:
//  ```java
//  String str1 = "Java";
//  String str2 = "Java";
//  System.out.println(str1.equals(str2)); // Output: true
//  ```
//   - `boolean equalsIgnoreCase(String another)`  
//  Compares two strings, ignoring case.  
//  Example:
//  ```java
//  String str1 = "java";
//  String str2 = "JAVA";
//  System.out.println(str1.equalsIgnoreCase(str2)); // Output: true
//  ```
//
//#### **5. String Searching**
//   - `boolean contains(CharSequence seq)`  
//  Checks if the string contains the specified sequence.  
//  Example:
//  ```java
//  String str = "Hello World";
//  System.out.println(str.contains("World")); // Output: true
//  ```
//   - `int indexOf(String str)`  
//  Returns the index of the first occurrence of the specified substring.  
//  Example:
//  ```java
//  String str = "Hello World";
//  System.out.println(str.indexOf("World")); // Output: 6
//  ```
//   - `int lastIndexOf(String str)`  
//  Returns the index of the last occurrence of the specified substring.  
//  Example:
//  ```java
//  String str = "Hello World";
//  System.out.println(str.lastIndexOf("o")); // Output: 7
//  ```
//
//#### **6. String Replacement**
//   - `String replace(char oldChar, char newChar)`  
//  Replaces all occurrences of `oldChar` with `newChar`.  
//  Example:
//  ```java
//  String str = "Java";
//  System.out.println(str.replace('a', 'o')); // Output: "Jovo"
//  ```
//   - `String replace(CharSequence target, CharSequence replacement)`  
//  Replaces all occurrences of `target` with `replacement`.  
//  Example:
//  ```java
//  String str = "Java is fun";
//  System.out.println(str.replace("fun", "awesome")); // Output: "Java is awesome"
//  ```
//
//#### **7. Trimming**
//   - `String trim()`  
//  Removes leading and trailing whitespaces.  
//  Example:
//  ```java
//  String str = "  Java  ";
//  System.out.println(str.trim()); // Output: "Java"
//  ```
//
//#### **8. String Splitting and Joining**
//   - `String[] split(String regex)`  
//  Splits the string based on a regular expression.  
//  Example:
//  ```java
//  String str = "Java,Python,C++";
//  String[] languages = str.split(",");
//  ```
//   - `String join(CharSequence delimiter, CharSequence... elements)`  
//  Joins strings using the specified delimiter.  
//  Example:
//  ```java
//  String joined = String.join("-", "Java", "Python", "C++");
//  System.out.println(joined); // Output: "Java-Python-C++"
//  ```
//
//---
//
//
//
//### **Key Differences Between `String`, `StringBuilder`, and `StringBuffer`**
//
//| Feature           | `String`   | `StringBuilder` | `StringBuffer` |
//|--------------------|------------|-----------------|----------------|
//| **Mutability**     | Immutable  | Mutable         | Mutable        |
//| **Thread-Safety**  | No         | No              | Yes            |
//| **Performance**    | Slow       | Faster          | Slower         |
//

