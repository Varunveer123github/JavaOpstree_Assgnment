package Learning_Package;

//Type conversion in Java refers to changing the data type of a variable from one type to another. 
//It ensures compatibility between different types during operations or assignments.
//________________________________________
//1. Types of Type Conversion

//A. Implicit Type Conversion (Widening)
//   •	Definition: Automatically performed by Java when converting a smaller data type into a larger 
//                  data type.
//   •	Key Points: 
//      o	No data loss occurs.
//      o	Automatically handled by the compiler.
//   •	Order of Widening:
//      byte → short → int → long → float → double
//   •	Example: 
//       int num = 100;
//       double result = num; // int to double
//       System.out.println(result); // Output: 100.0
//________________________________________
//B. Explicit Type Conversion (Narrowing)
//   •	Definition: Manually performed by the programmer when converting a larger data type into a 
//                  smaller data type.
//   •	Key Points: 
//      o	May result in data loss.
//      o	Requires casting using parentheses (type).
//   •	Example: 
//       double value = 100.99;
//       int result = (int) value; // double to int
//       System.out.println(result); // Output: 100
//________________________________________
//2. Conversion Between Primitive and Reference Types

//A. Autoboxing
//   •	Definition: Automatic conversion of a primitive type into its corresponding wrapper class.
//   •	Example: 
//       int num = 10;
//       Integer boxedNum = num; // Autoboxing
//B. Unboxing
//   •	Definition: Automatic conversion of a wrapper class back into its corresponding primitive type.
//   •	Example: 
//       Integer boxedNum = 10;
//       int num = boxedNum; // Unboxing
//________________________________________
//3. String Conversion

//A. Primitive to String
//   •	Use String.valueOf() or concatenation with an empty string.
//   •	Example: 
//       int num = 123;
//       String str = String.valueOf(num); // or str = num + "";
//       System.out.println(str); // Output: "123"
//
//
//B. String to Primitive
//   •	Use parsing methods like Integer.parseInt(), Double.parseDouble(), etc.
//   •	Example: 
//       String str = "123";
//       int num = Integer.parseInt(str);
//       System.out.println(num); // Output: 123
//________________________________________
//4. Type Conversion Between Objects
//   Upcasting and Downcasting in Java
//    In Java, upcasting and downcasting are concepts related to typecasting in the object-oriented paradigm, 
//    where one class type is converted into another within an inheritance hierarchy.
//
//1. Upcasting
//     Definition: Converting a subclass type to its superclass type.
//     Why Use It?: To generalize code and treat derived objects as their base class type.
//     How It Works: It’s implicit and requires no explicit casting.
//     Example: Upcasting
//               
//              class Animal {
//                  void speak() {
//                 System.out.println("Animal speaks");
//                    }
//                   }
//
//                 class Dog extends Animal {
//                   void bark() {
//                   System.out.println("Dog barks");
//                      }
//                     }
//
//                 public class Main {
//                    public static void main(String[] args) {
//                     Animal animal = new Dog(); // Upcasting
//                     animal.speak(); // Calls the overridden method in Dog
//                     // animal.bark(); // Compile-time error, reference type is Animal
//                        }
//                       }
//                  Here, the Dog object is treated as an Animal due to upcasting.
//2. Downcasting
//    Definition: Converting a superclass type back to a subclass type.
//    Why Use It?: To access subclass-specific features.
//    How It Works: It must be done explicitly using a cast operator.
//    Example: Downcasting
//            public class Main {
//               public static void main(String[] args) {
//                Animal animal = new Dog(); // Upcasting
//                Dog dog = (Dog) animal;    // Downcasting
//                dog.speak(); // Calls the method from Dog
//                dog.bark();  // Calls the Dog-specific method
//                  }
//                }
//Important Notes for Downcasting:
//Runtime Check: Java performs a runtime check to ensure the object being cast is of the correct type.
//ClassCastException: If the object is not of the correct type, a ClassCastException is thrown.
//3. Key Points
//               Feature	Upcasting	               Downcasting
//           -------------------------------------------------------------------------------------
//                 Type	     Subclass → Superclass	    Superclass → Subclass
//              Explicit?	 No (Implicit)	            Yes (Explicit)
//              Use Case	 Generalizing objects	    Accessing subclass-specific methods
//              Safety	     Always safe	            Risky; requires runtime validation
//           -------------------------------------------------------------------------------------
//________________________________________
//5.                                   Key Points for Interviews
//   •	Why does widening not require explicit casting?: Because there’s no risk of data loss.
//   •	Why is narrowing risky?: It may lead to data truncation or overflow.
//   •	How does Java handle type safety?: By requiring explicit casting for narrowing conversions 
//                                           and by providing wrapper classes for type compatibility.
//   •	What is the difference between autoboxing and casting?: Autoboxing converts primitives to 
//                         wrapper classes, while casting changes one type to another within compatible types.
//________________________________________

       public class T5_Type_Conversion {

       public static void main(String[] args) {
      // Implicit Conversion
      int num = 50;
      double result = num; // Widening
      System.out.println("Implicit Conversion (int to double): " + result);

      // Explicit Conversion
      double value = 99.99;
      int truncated = (int) value; // Narrowing
      System.out.println("Explicit Conversion (double to int): " + truncated);

      // Autoboxing
      int primitive = 10;
      Integer boxed = primitive;
      System.out.println("Autoboxing: " + boxed);

      // Unboxing
      Integer wrapper = 20;
      int unboxed = wrapper;
      System.out.println("Unboxing: " + unboxed);

      // String Conversion
      String str = Integer.toString(num);
      int parsed = Integer.parseInt(str);
      System.out.println("String to int: " + parsed);
  }
}
