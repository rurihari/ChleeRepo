import java.util.Scanner;  //ctrl + shift + o

public class Ex07_03 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in); //메모리는 클래스 단위로 올라감 new라는 명령어로밖에 메모리에 못올림
		
		int a,b; 
		
		while(true) {    // ctrl+shift 자동완성
			System.out.println("더할 첫 번째 수 입력: "); //ctrl + alt + 방향키 해당줄 복사
			a = s.nextInt();
			System.out.println("더할 두 번째 수 입력: ");
			b = s.nextInt();
			
			System.out.println(a+"+"+ b + "=" +(a+b)); 
		}

		
	}

}
