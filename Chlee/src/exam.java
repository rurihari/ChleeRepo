import java.util.Scanner;

public class exam {

	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
		int i;
		int j;
		int k;
		int num;
		
		System.out.print("별 최대 개수 입력: ");
		num = s.nextInt();
		
		
		for(i=0; i<num; i++){
			for(j=0; j<num-1-i; j++)
				System.out.print(" ");
			
			for(k=0; k<=i; k++)
				System.out.print("*");
			
			System.out.println();
		}
		
		for(i=0; i<num; i++){
			for(j=0; j<=i; j++)
				System.out.print(" ");
			
			for(k=num-1; k>i; k--)
				System.out.print("*");
			
			System.out.println();
		}
		
	}

}
