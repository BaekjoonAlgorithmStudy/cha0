package level02_arithmetics;

import java.util.Scanner;

public class SugarDelivery {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sugar = sc.nextInt();
		int noOfBags = (sugar/5) + (sugar%5/3);
		
		if(sugar<3 || sugar>5000) {
			return;
		}
		
		if((sugar%5)%3==0) {
			System.out.println(noOfBags);
		} else {
			System.out.println(-1);
		}			
	}
}
