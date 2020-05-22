
public class Ex08_08 {

	public static void main(String[] args) {
		int[][]aa= new int[3][4];
		int i,j;
		int num=1;
		
		for(i=0;i<3;i++)
			for(j=0; j<4; j++) {
				aa[i][j]=num;
				num++;
			}	
		
		System.out.println("aa[0][0]부터 aa[2][3]까지 출력");
		
		for(i=0; i<3; i++) {
			for(j=0; j<4; j++) {
				System.out.printf("%3d ", aa[i][j]);
			}
			System.out.println();
		}
				
	}

}
