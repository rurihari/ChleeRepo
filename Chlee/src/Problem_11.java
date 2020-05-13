import java.util.Scanner;
public class Problem_11 {

	public static void main(String[] args) {
		int num1;
		int num2;
		char op;
		Scanner s = new Scanner(System.in);
		System.out.printf("첫번째 수를 입력하세요 : ");
		num1 = s.nextInt();
		
		System.out.printf("계산할 연산자를 입력하세요 : "); 
		op = s.next().charAt(0);
		
		System.out.printf("두번째 수를 입력하세요 : ");
		num2 = s.nextInt();
		
		if(op == '+')
			System.out.printf("%d + %d = %d입니다. \n", num1, num2, num1+num2);

		if(op == '-')
			System.out.printf("%d - %d = %d입니다. \n", num1, num2, num1-num2);
		
		if(op == '*')
			System.out.printf("%d * %d = %d입니다. \n", num1, num2, num1*num2);
		
		if(op == '/')
			System.out.printf("%d / %d = %d입니다. \n", num1, num2, num1/num2);
		
		if(op == '%')
			System.out.printf("%d %% %d = %d입니다. \n", num1, num2, num1%num2);
	}

}
