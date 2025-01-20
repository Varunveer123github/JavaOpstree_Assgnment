package Learning_Package;

//Data types in Java specify the type of data that a variable can hold. 
//They are essential for defining the nature of variables and ensuring type safety during program execution.
//________________________________________
//
//1. Types of Data Types in Java

//A. Primitive Data Types
//Java has 8 built-in primitive data types categorized based on the type of data they store.
//### 1. **Integer Types**:
//   - **`byte`**: 
//     - Size: 1 byte (8 bits)
//     - Range: -128 to 127
//     - Example: `byte b = 100;`
//   - **`short`**: 
//     - Size: 2 bytes (16 bits)
//     - Range: -32,768 to 32,767
//     - Example: `short s = 30000;`
//   - **`int`**: 
//     - Size: 4 bytes (32 bits)
//     - Range: -2,147,483,648 to 2,147,483,647
//     - Example: `int i = 100000;`
//   - **`long`**: 
//     - Size: 8 bytes (64 bits)
//     - Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//     - Example: `long l = 100000L;`
//
//---
//
//### 2. **Floating-Point Types**:
//   - **`float`**: 
//     - Size: 4 bytes (32 bits)
//     - Precision: 6-7 decimal digits
//     - Example: `float f = 3.14f;`
//   - **`double`**:    // default
//     - Size: 8 bytes (64 bits)
//     - Precision: 15-16 decimal digits
//     - Example: `double d = 3.14159265359;`
//
//---
//
//### 3. **Character Type**:
//   - **`char`**: 
//     - Size: 2 bytes (16 bits)
//     - Range: '\u0000' (0) to '\uffff' (65,535), supports Unicode
//     - Example: `char c = 'A';`
//
//---
//
//### 4. **Boolean Type**:
//   - **`boolean`**: 
//     - Size: Not precisely defined (usually 1 bit or 1 byte depending on implementation)
//     - Values: `true` or `false`
//     - Example: `boolean isJavaFun = true;`
//
//-------------------------------------------------------------------------------------------------------
//
//### Summary Table:
//        | Type    | Size      | Range (Approx)                                          |
//        |---------|-----------|-------------------------------------------              |
//        | `byte`  | 1 byte    | -128 to 127                                             |
//        | `short` | 2 bytes   | -32,768 to 32,767                                       |
//        | `int`   | 4 bytes   | -2,147,483,648 to 2,147,483,647                         |
//        | `long`  | 8 bytes   | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
//        | `float` | 4 bytes   | ~6-7 decimal digits                                     |
//        | `double`| 8 bytes   | ~15-16 decimal digits                                   |
//        | `char`  | 2 bytes   | '\u0000' to '\uffff'                                    |
//        | `boolean`| Varies   | true or false                                           |
//--------------------------------------------------------------------------------------------------------
//B. Non-Primitive (Reference) Data Types
//    These types refer to objects or arrays and are more complex than primitive types.
//       String: Stores a sequence of characters. 
//               String name = "Java";
//       Array: Stores a collection of elements of the same type. 
//               int[] numbers = {1, 2, 3};
//       Class/Objects: Represent user-defined data types. 
//               class Person {
//                 String name;
//                 }
//       Interface: Defines a contract that classes can implement. 
//               interface Drawable {
//                  void draw();
//                 }
//________________________________________
//2. Type Conversion and Casting
//   A. Implicit Type Conversion (Widening)
//        •	Automatically converts smaller types to larger types.
//        •	Example: 
//          int num = 100;
//          long bigNum = num; // int to long
//   B. Explicit Type Conversion (Narrowing)
//        •	Requires manual casting when converting larger types to smaller types.Automatically converts smaller types to larger types.
//        •	Example: 
//           double decimal = 10.5;
//           int wholeNumber = (int) decimal; // double to int
//________________________________________
//3. Default Values of Data Types
// 
//
//         Data Type	      Default Value	     Example Code
//        ----------------------------------------------------------------------
//          byte	             0	         byte b; // b = 0 by default
//          short	             0	         short s; // s = 0 by default
//          int	                 0	         int i; // i = 0 by default
//          long	             0L	         long l; // l = 0L by default
//          float	             0.0f	     float f; // f = 0.0f by default
//          double               0.0d	     double d; // d = 0.0d by default
//          char	             '\u0000'	 char c; // c = '\u0000' (null char)
//          boolean              false	     boolean b; // b = false by default
//        -----------------------------------------------------------------------
//________________________________________
//4. Wrapper Classes
//     Each primitive type has a corresponding wrapper class in Java, used for object representation of primitives.
// 
//         -----------------------------------------------------
//               Primitive Type	   Wrapper Class
//                   byte	        Byte
//                   short	        Short
//                   int	        Integer
//                   long	        Long
//                   float	        Float
//                   double	        Double
//                   char	        Character
//                   boolean        Boolean
//          ------------------------------------------------------
//5.                                         Key Points for Interviews
//   •	Why Java has 8 primitive types?: To optimize memory usage and provide flexibility for different data requirements.
//   •	Difference between float and double: float is single-precision, while double is double-precision and more accurate & default as well.
//   •	Why char is 2 bytes?: To support Unicode characters, allowing representation of global alphabets.
//   •	Default values: Primitive types have defaults; local variables don’t and must be initialized.
//________________________________________


public class T3_Data_types {
	
	 public static void main(String[] args) {
       int age = 25;          // Primitive type
       String name = "Java";  // Reference type
       boolean isJavaFun = true;

       System.out.println("Age: " + age);
       System.out.println("Name: " + name);
       System.out.println("Is Java Fun: " + isJavaFun);
   }
}
