import java.util.Scanner;  //ctrl + shift + o

public class Ex07_03 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in); //�޸𸮴� Ŭ���� ������ �ö� new��� ��ɾ�ιۿ� �޸𸮿� ���ø�
		
		int a,b; 
		
		while(true) {    // ctrl+shift �ڵ��ϼ�
			System.out.println("���� ù ��° �� �Է�: "); //ctrl + alt + ����Ű �ش��� ����
			a = s.nextInt();
			System.out.println("���� �� ��° �� �Է�: ");
			b = s.nextInt();
			
			System.out.println(a+"+"+ b + "=" +(a+b)); 
		}

		
	}

}
