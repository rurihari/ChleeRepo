import java.util.Scanner;
public class Problem_02 {
	public static void main(String[] args) {
		int a;
		int b;
		int num;
		int result;
		
		Scanner s = new Scanner(System.in);
		System.out.print("ù��° ����� ���� �Է��ϼ��� ==> ");
		a = s.nextInt();
		System.out.print("<1>���� <2>���� <3>���� <4>������ ==> ");
		num = s.nextInt();
		System.out.print("�ι�° ����� ���� �Է��ϼ��� ==> ");
		b = s.nextInt();
		
		if(num==1) {
			result = a+b;
			System.out.println(a + "+" + b + "=" + result);
		}
		
		if(num==2) {
			result = a-b;
			System.out.println(a + "-" + b + "=" + result);
		}
		
		if(num==3) {
			result = a*b;
			System.out.println(a + "*" + b + "=" + result);
		}
		
		if(num==4) {
			result = a/b;
			System.out.println(a + "/" + b + "=" + result);
		}
		
	}

}
