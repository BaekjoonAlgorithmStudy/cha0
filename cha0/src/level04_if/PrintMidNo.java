package level04_if;

import java.util.Scanner;

public class PrintMidNo {

	public static void main(String[] args) {
		
		//공백으로 구분된 세 수 A, B, C 입력받기 (ex: 30 40 50)
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//공백을 기준으로 문자열 분리
		String[] strNums = str.split(" ");
		
		//String 입력을 int로 바꾸기 
		int[] nums = new int[3]; 
		for(int i = 0; i < strNums.length; i++) {
			nums[i] = Integer.parseInt(strNums[i]);
		}
		
		//버블 정렬
		for(int i = 0; i < nums.length; i++) {
			
			for(int j = 1; j<nums.length; j++) {
				int tmp = 0;
				
				if (nums[j-1] > nums[j]) {
					tmp = nums[j];
					nums[j] = nums[j-1];
					nums[j-1] = tmp;
				}
			}
		}
		
		//중간값 출력
		System.out.println("중간값: " + nums[1]);
	}
}
