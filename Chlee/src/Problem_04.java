import java.util.Scanner;
public class Problem_04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.print("������ �Է��ϼ��� ==> ");
		num = s.nextInt();

		System.out.printf("10���� ==> %d \n", num);
		System.out.printf("16���� ==> %x \n", num);
		System.out.printf("8���� ==> %o \n", num);
	}

}
