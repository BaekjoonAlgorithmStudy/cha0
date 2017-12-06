package two;

import java.util.Scanner;

public class Arithmetics {
	public static void main(String[] args) {
		//두 자연수 A와 B가 주어진다. 이 때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int[] result = {a+b, a-b, a*b, a/b, a%b};
	
		for(int tmp:result) {
			System.out.println(tmp);
		}
	}

}
