import java.util.Scanner;
public class Ex06_11 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int hap =0;
		int i;
		int num1, num2, num3;
		
		System.out.printf("���۰� �Է�: ");
		num1 = s.nextInt();
		System.out.printf("�߰��� �Է�: ");
		num2 = s.nextInt();
		System.out.printf("������ �Է�: ");
		num3 = s.nextInt();
		
		for(i=num1; i<=num2; i= i+ num3)
			hap += i;
		System.out.printf("%d���� %d���� %d�� ������ ���� ��: %d \n", num1, num2, num3, hap);

	}

}
