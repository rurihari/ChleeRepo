import java.util.Scanner;
public class Ex06_12 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int i;
		int dan;
		
		System.out.printf("�� �� ?: ");
		dan = s.nextInt();

		
		for(i=1; i<=9; i= i++)
			System.out.printf("%d * %d = %d \n", dan, i ,dan*i);

	}

}