package three;

import java.util.Scanner;

public class printStar01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n>100 || n<1) return;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
