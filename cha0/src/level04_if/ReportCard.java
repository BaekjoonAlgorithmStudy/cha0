package level04_if;

import java.util.Scanner;

public class ReportCard {
	public static void main(String[] args) {
		/*문제
		 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		 * 입력
		 * 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 자연수이다.
		 * 출력
		 * 시험 성적을 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		if(score < 0 || score > 100) {
			System.out.println("1~100까지의 정수를 입력하세요.");
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
