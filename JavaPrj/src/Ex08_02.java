import java.util.Scanner;

public class Ex08_02 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int [] aa= new int[4];
		int hap=0;
		int i;
		
		for(i=0; i<=3; i++) {
			System.out.print((i+1)+"번째 숫자를 입력하세요: ");
			aa[i] = s.nextInt();
			hap += aa[i];
			
		}
		
		System.out.print("합계 ==>" + hap);

	}

}
