import java.io.IOException;
import java.util.Scanner;

public class Ex07_04 {

	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(System.in);
		int a, b;
		char ch;

		while (true) {
			System.out.println("����� ù��° ���� �Է�: ");
			a = s.nextInt();

			System.out.println("����� �ι�° ���� �Է�: ");
			b = s.nextInt();

			System.out.println("����� �����ڸ� �Է�: ");
			ch = (char) System.in.read();

			// ctrl+alt+f �� ����

			switch (ch) {
			case '+':
				System.out.println(a + "+" + b + "=" + (a + b));
				break;

			case '-':
				System.out.println(a + "-" + b + "=" + (a - b));
				break;

			case '*':
				System.out.println(a + "*" + b + "=" + (a * b));
				break;

			case '/':
				System.out.println(a + "/" + b + "=" + (a / (float) b));
				break;

			case '%':
				System.out.println(a + "%%" + b + "=" + (a % b));
				break;

			default:
				System.out.println("�����ڸ� �߸� �Է��߽��ϴ�.");
			}
		}
	}
}
