import java.util.Scanner;

public class Ex08_02 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int [] aa= new int[4];
		int hap=0;
		int i;
		
		for(i=0; i<=3; i++) {
			System.out.print((i+1)+"��° ���ڸ� �Է��ϼ���: ");
			aa[i] = s.nextInt();
			hap += aa[i];
			
		}
		
		System.out.print("�հ� ==>" + hap);

	}

}
