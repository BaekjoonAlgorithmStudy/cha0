package level03_for;

import java.util.Scanner;

public class printGugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n>9 || n<1) return;
		
		for(int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}
}
