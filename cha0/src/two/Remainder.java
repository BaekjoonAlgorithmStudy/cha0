package two;

import java.util.Scanner;

public class Remainder {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int[] results = {(A+B)%C, (A%C + B%C)%C, (A*B)%C, (A%C * B%C)%C};
		
		for(int tmp:results) {
			System.out.println(tmp);
		}
		
		
		
		
		
	}

}
