import java.util.Scanner;
public class Problem_01 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int result;
		
		Scanner s = new Scanner(System.in);
		System.out.print("ù��° ����� ���� �Է��ϼ��� ==> ");
		a = s.nextInt();
		System.out.print("�ι�° ����� ���� �Է��ϼ��� ==> ");
		b = s.nextInt();
		System.out.print("����° ����� ���� �Է��ϼ��� ==> ");
		c = s.nextInt();
		System.out.print("�׹�° ����� ���� �Է��ϼ��� ==> ");
		d = s.nextInt();
		
		result = a+b+c+d;
		System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + result);
		
	}

}