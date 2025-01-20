package Assignment_Package;
//2.	Implement a program with methods to:
//        a.	Check if a number is even or odd.

public class CreateMethodEven_Odd {
        public void isEven_Odd(int x)
        {
        	if(x%2==0) {
        		System.out.println("The given number is Even");
        	}else {
        		System.out.println("The given number is Odd");

        	}
        }
	public static void main(String[] args) {
              int num= 6403;
		CreateMethodEven_Odd obj= new CreateMethodEven_Odd();
		obj.isEven_Odd(num);
	}

}
