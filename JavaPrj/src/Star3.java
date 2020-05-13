
public class Star3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int j;
		int k;
		
		for(i=0; i<6; i++){
			for(j=0; j<5-i; j++)
				System.out.print(" ");
			
			for(k=0; k<=i; k++)
				System.out.print("*");
			
			System.out.println();
		}
		
		
	}

}
