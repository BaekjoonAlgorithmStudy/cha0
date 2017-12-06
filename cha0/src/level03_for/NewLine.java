package three;

import java.util.Scanner;

public class NewLine {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch;
		
		for(int i = 0; i < str.length(); i++) {
		
			ch = str.charAt(i);
			
			System.out.print(ch);
			
			if(i!=0 && i%10==0) System.out.println();
	
		}
		
	}
	
}
