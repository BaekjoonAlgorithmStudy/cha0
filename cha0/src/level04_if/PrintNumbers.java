package level04_if;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		
		/*����
		 * ���� N���� �̷���� ���� A�� ���� X�� �־�����. �� ��, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է�
		 * ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
		 * ��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.
		 * ���
		 * X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.*/
		
		System.out.println("�ڿ��� N�� X�� �������� �����Ͽ� �Է��ϼ���. (1 �� N, X �� 10,000)");
		Scanner sc = new Scanner(System.in);
		String strInputNum = sc.nextLine();
		
		String[] strInputNums = new String[2];
		strInputNums = strInputNum.split(" ");
		
		int N = Integer.parseInt(strInputNums[0]);
		int X = Integer.parseInt(strInputNums[1]);
		
		int[] nums = new int[N];
		
		System.out.println(N + "���� ���� �������� �����Ͽ� �Է��ϼ���.");
		String strNum = sc.nextLine();
		
		String[] strNums = strNum.split(" ");
		
		System.out.println("�Է��� �� ��" + X + " ���� ���� ���� ����մϴ�.");
		for(int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(strNums[i]);
			
			if(nums[i] < X) System.out.print(nums[i] + " ");
		}
	
	}

}
