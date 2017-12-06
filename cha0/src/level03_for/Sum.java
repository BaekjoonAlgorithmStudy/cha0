package three;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int inputNo = sc.nextInt();
		
		if(inputNo < 0 || inputNo > 10000) return;
		
		System.out.println(sum(inputNo));
		
	}
	
	public static int sum(int num) {
		int sum = 0;
		
		for(int i = 0; i <=num; i++) {
			sum += i;
			
		}
		
		return sum;
	}

}
