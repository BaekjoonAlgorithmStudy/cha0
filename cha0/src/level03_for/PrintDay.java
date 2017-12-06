package level03_for;

import java.util.Scanner;

/*
 * ������ 2007�� 1�� 1�� �������̴�. �׷��ٸ� 2007�� x�� y���� ���� �����ϱ�? �̸� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
 * �Է�: ù° �ٿ� �� ĭ�� ���̿� �ΰ� �� �� �־�����. 
 * ����� 2007�⿡�� 1, 3, 5, 7, 8, 10, 12���� 31�ϱ���, 4, 6, 9, 11���� 30�ϱ���, 2���� 28�ϱ��� �ִ�.
 * ���: ù° �ٿ� x�� y���� ���� ���������� ���� SUN, MON, TUE, WED, THU, FRI, SAT�� �ϳ��� ����Ѵ�.
 */

public class PrintDay {

	public static void main(String[] args) {
		//x�� y�� ������ �� �ϼ�
		int totalDays = 0;
		//����� ���� ���ڿ� �迭
		String[] days = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
		
		System.out.println("x(1��x��12) y(1��y��31)");
		Scanner sc = new Scanner(System.in);
		
		//�Է¹��� ��
		int x = sc.nextInt();
		//�Է¹��� ��
		int y = sc.nextInt();
		
		//���� �迭 �ε��� ���ϱ�: �ϼ��� 7�� ���� ������ ���� �迭 �ε����� �Ҵ� 
		int idx = (getTotalDays(x - 1) + y - 1) % 7;
		//���
		System.out.println("2007�� " + x + "��" + y + "���� " + days[idx] + "�Դϴ�.");

	}

	//x�� y�� ������ totalDays ���ϱ�
	public static int getTotalDays(int month) {

		int totalDays = 0;
		int[] year = new int[12];

		for (int i = 0; i < year.length; i++) {
			year[i] = getDaysInMonth(i+1);
		}

		for (int i = 0; i < month; i++) {
			totalDays += year[i];
		}

		return totalDays;
	}

	//���� �ϼ� ���ϱ�
	public static int getDaysInMonth(int month) {

		int daysInMonth = 0;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			daysInMonth = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			daysInMonth = 30;
			break;
		case 2:
			daysInMonth = 28;
			break;
		}
		return daysInMonth;
	}
}
