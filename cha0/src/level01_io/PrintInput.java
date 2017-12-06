package level01_io;

import java.util.Scanner;

public class PrintInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			System.out.println(str);
		}
	}
}
