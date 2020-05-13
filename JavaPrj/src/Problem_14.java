
public class Problem_14 {

	public static void main(String[] args) {
		int i;
		int j;
		
		for(i=2; i<=9; i++) 
			System.out.printf(" #Á¦%d´Ü#", i);
			
			System.out.println();
			System.out.println();
			
			for(i=2; i<=9; i++) {
				
				for(j=1; j<=9; j++){
					System.out.printf("%2d * %2d = %2d \n", i, j, i*j );
				}
				System.out.println();
			}
			
			
		}

	}

