import java.util.Scanner;
import java.io.IOException;

public class Problem_03 {

	public static void main(String[] args) throws IOException {
		int a;
		int b;
		char k;
		int result;
		
		Scanner s = new Scanner(System.in);
		System.out.print("ù��° ����� ���� �Է��ϼ��� ==> ");
		a = s.nextInt();
		System.out.print("+ - * / % ==> ");
		k = (char) System.in.read();
		System.out.print("�ι�° ����� ���� �Է��ϼ��� ==> ");
		b = s.nextInt();
		
		if(k=='+') {
			result = a+b;
			System.out.println(a + "+" + b + "=" + result);
		}
		
		if(k=='-') {
			result = a-b;
			System.out.println(a + "-" + b + "=" + result);
		}
		
		if(k=='*') {
			result = a*b;
			System.out.println(a + "*" + b + "=" + result);
		}
		
		if(k=='/') {
			result = a/b;
			System.out.println(a + "/" + b + "=" + result);
		}
		
		if(k=='%') {
			result = a%b;
			System.out.println(a + "%" + b + "=" + result);
		}

	}

}
