import java.util.Scanner;
public class Problem_09 {

	public static void main(String[] args) {
		
		
		int money;
		int co500;
		int co100;
		int co50;
		int co10;
		Scanner s = new Scanner(System.in);
		
		System.out.printf("## ��ȯ�� ���� ? ");
		money = s.nextInt();
		
		co500 = money / 500;
		money = money % 500;
		co100 = money / 100;
		money = money % 100;
		co50 = money / 50;
		money = money % 50;
		co10 = money / 10;
		money = money % 10;
		
		System.out.printf("�����¥�� ==> %d�� \n", co500);
		System.out.printf("�����¥�� ==> %d�� \n", co100);
		System.out.printf("�����¥�� ==> %d�� \n", co50);
		System.out.printf("�����¥�� ==> %d�� \n", co10);
		System.out.printf("�ٲ��� ���� �ܵ� ==> %d�� \n", money);

	}

}
