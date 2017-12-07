package level04_if;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		
		/*문제
		 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이 때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		 * 입력
		 * 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
		 * 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
		 * 출력
		 * X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.*/
		
		System.out.println("자연수 N과 X를 공백으로 구분하여 입력하세요. (1 ≤ N, X ≤ 10,000)");
		Scanner sc = new Scanner(System.in);
		String strInputNum = sc.nextLine();
		
		String[] strInputNums = new String[2];
		strInputNums = strInputNum.split(" ");
		
		int N = Integer.parseInt(strInputNums[0]);
		int X = Integer.parseInt(strInputNums[1]);
		
		int[] nums = new int[N];
		
		System.out.println(N + "개의 수를 공백으로 구분하여 입력하세요.");
		String strNum = sc.nextLine();
		
		String[] strNums = strNum.split(" ");
		
		System.out.println("입력한 값 중" + X + " 보다 작은 수를 출력합니다.");
		for(int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(strNums[i]);
			
			if(nums[i] < X) System.out.print(nums[i] + " ");
		}
	
	}

}
