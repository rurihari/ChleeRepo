import java.util.Scanner;
public class Problem_11 {

	public static void main(String[] args) {
		int num1;
		int num2;
		char op;
		Scanner s = new Scanner(System.in);
		System.out.printf("ù��° ���� �Է��ϼ��� : ");
		num1 = s.nextInt();
		
		System.out.printf("����� �����ڸ� �Է��ϼ��� : "); 
		op = s.next().charAt(0);
		
		System.out.printf("�ι�° ���� �Է��ϼ��� : ");
		num2 = s.nextInt();
		
		if(op == '+')
			System.out.printf("%d + %d = %d�Դϴ�. \n", num1, num2, num1+num2);

		if(op == '-')
			System.out.printf("%d - %d = %d�Դϴ�. \n", num1, num2, num1-num2);
		
		if(op == '*')
			System.out.printf("%d * %d = %d�Դϴ�. \n", num1, num2, num1*num2);
		
		if(op == '/')
			System.out.printf("%d / %d = %d�Դϴ�. \n", num1, num2, num1/num2);
		
		if(op == '%')
			System.out.printf("%d %% %d = %d�Դϴ�. \n", num1, num2, num1%num2);
	}

}
