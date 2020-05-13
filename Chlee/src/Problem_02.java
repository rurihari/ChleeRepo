import java.util.Scanner;
public class Problem_02 {
	public static void main(String[] args) {
		int a;
		int b;
		int num;
		int result;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Ã¹¹øÂ° °è»êÇÒ °ªÀ» ÀÔ·ÂÇÏ¼¼¿ä ==> ");
		a = s.nextInt();
		System.out.print("<1>µ¡¼À <2>»¬¼À <3>°ö¼À <4>³ª´°¼À ==> ");
		num = s.nextInt();
		System.out.print("µÎ¹øÂ° °è»êÇÒ °ªÀ» ÀÔ·ÂÇÏ¼¼¿ä ==> ");
		b = s.nextInt();
		
		if(num==1) {
			result = a+b;
			System.out.println(a + "+" + b + "=" + result);
		}
		
		if(num==2) {
			result = a-b;
			System.out.println(a + "-" + b + "=" + result);
		}
		
		if(num==3) {
			result = a*b;
			System.out.println(a + "*" + b + "=" + result);
		}
		
		if(num==4) {
			result = a/b;
			System.out.println(a + "/" + b + "=" + result);
		}
		
	}

}
