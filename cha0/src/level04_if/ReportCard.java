package level04_if;

import java.util.Scanner;

public class ReportCard {
	public static void main(String[] args) {
		/*����
		 * ���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է�
		 * ù° �ٿ� ���� ������ �־�����. ���� ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �ڿ����̴�.
		 * ���
		 * ���� ������ ����Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		if(score < 0 || score > 100) {
			System.out.println("1~100������ ������ �Է��ϼ���.");
			return;
		}
		
		char grade = getGrade(score);
		System.out.println(grade);
		
	}
	
	public static char getGrade(int score) {
		char grade = 'F';
		
		if(score>=60) {
			grade = 'D';
			if(score>=70) {
				grade = 'C';
				if(score>=80) {
					grade = 'B';
					if(score>90) {
						grade = 'A';
					}
				}	
			}
		}//end of if
		
		return grade;
		
	}
}
