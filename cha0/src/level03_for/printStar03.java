package level03_for;

import java.util.Scanner;

public class printStar03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = n; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
