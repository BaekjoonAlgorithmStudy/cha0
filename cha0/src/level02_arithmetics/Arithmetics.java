package two;

import java.util.Scanner;

public class Arithmetics {
	public static void main(String[] args) {
		//�� �ڿ��� A�� B�� �־�����. �� ��, A+B, A-B, A*B, A/B(��), A%B(������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int[] result = {a+b, a-b, a*b, a/b, a%b};
	
		for(int tmp:result) {
			System.out.println(tmp);
		}
	}

}
