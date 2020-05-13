
public class Problem_15 {

	public static void main(String[] args) {
		
		int i;
		System.out.println("---------------------");
		System.out.println("10진수    16진수    문자");
		System.out.println("---------------------");
		for(i=0; i<=127; i++){
			System.out.printf("%5d %5x %5c \n", i, i, i);
		}
	}
}
