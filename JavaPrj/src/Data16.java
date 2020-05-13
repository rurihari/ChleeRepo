
public class Data16 {

	public static void main(String[] args) {
		
		int num1 = 100;
		double num2 = 10.3;
		double result = num1 + num2; 
		System.out.printf("%d + %4.1f= %5.1f", num1, num2, result);
		System.out.println();

		result=num1/num2;
		System.out.printf("%d + %4.1f= %d", num1, num2, (int)result);
		System.out.println();
	}

}
