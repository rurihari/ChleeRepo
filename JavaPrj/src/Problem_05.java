import java.util.Scanner;
public class Problem_05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1=0;
		int num2=0;
		String str;
		
		System.out.print("입력 진수 결정 <1>10 <2>16 <3>8 :  ");
		num1= s.nextInt();
		
		System.out.print("값 입력: ");
		if(num1 == 1) {
			str= s.next();
			num2 = Integer.parseInt(str, 10);
		}
		if(num1 == 2) {
			str= s.next();
			num2 = Integer.parseInt(str, 16);
		}
		if(num1 == 3) {
			str= s.next();
			num2 = Integer.parseInt(str, 18);
		}
		
		System.out.printf("10진수 ==> %d \n", num2);
		System.out.printf("16진수 ==> %x \n", num2);
		System.out.printf("8진수 ==> %o \n", num2);
		

	}

}
