import java.util.Scanner;
public class Problem_13 {

	public static void main(String[] args) {
		int num1;
		int num2;
		char op;
		Scanner s = new Scanner(System.in);
		String[] str;
		
		System.out.printf("������ ���ٷ� ����� �Է��ϼ��� : ");
		str = s.nextLine().split(" ");
		
		num1 = Integer.parseInt(str[0]);
		
		op = str[1].charAt(0);
		
		num2 = Integer.parseInt(str[2]);
		
		switch(op)
		{
		case '+':
			System.out.printf("%d + %d = %d�Դϴ�. \n", num1, num2, num1+num2);

		case '-':
			System.out.printf("%d - %d = %d�Դϴ�. \n", num1, num2, num1-num2);
		
		case '*':
			System.out.printf("%d * %d = %d�Դϴ�. \n", num1, num2, num1*num2);
		
		case '/':
			System.out.printf("%d / %d = %d�Դϴ�. \n", num1, num2, num1/num2);
		
		case '%':
			System.out.printf("%d %% %d = %d�Դϴ�. \n", num1, num2, num1%num2);
		default:
			System.out.println("�����ڸ� �߸� �Է��߽��ϴ�");
		}
	}

}