package level04_if;

import java.util.Scanner;

public class PrintMidNo {

	public static void main(String[] args) {
		
		//�������� ���е� �� �� A, B, C �Է¹ޱ� (ex: 30 40 50)
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//������ �������� ���ڿ� �и�
		String[] strNums = str.split(" ");
		
		//String �Է��� int�� �ٲٱ� 
		int[] nums = new int[3]; 
		for(int i = 0; i < strNums.length; i++) {
			nums[i] = Integer.parseInt(strNums[i]);
		}
		
		//���� ����
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
		
		//�߰��� ���
		System.out.println("�߰���: " + nums[1]);
	}
}
