package level03_for;

import java.util.Scanner;

public class printN01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i <n; i++) {
			System.out.println(i+1);
		}
	}
}
