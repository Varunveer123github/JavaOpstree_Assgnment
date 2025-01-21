package Assignment_Package;
// 1.	 Create a method calculateSum that takes two integers 
//       as parameters and returns their sum. Write another method with the 
//       same name that takes three integers as parameters and returns their sum.
public class CreateMethodCalculateSum {

	public int calculateSum(int x, int y) {
		int result2sum= x+y;
		return result2sum;
	}
	
public int calculateSum(int x, int y, int z) {
		int result3sum= x+y+z;
		return result3sum;
	}
	public static void main(String[] args) {
		
		CreateMethodCalculateSum obj= new CreateMethodCalculateSum();
		int result1=obj.calculateSum(5,6);
		int result2=obj.calculateSum(5,6,7);
		
		System.out.println("the sum of two intefger is : "+ result1);
		System.out.println("the sum of two intefger is : "+ result2);

	}

}
