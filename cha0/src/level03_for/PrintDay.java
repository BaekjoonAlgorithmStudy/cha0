package level03_for;

import java.util.Scanner;

/*
 * 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 빈 칸을 사이에 두고 와 이 주어진다. 
 * 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
 * 출력: 첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
 */

public class PrintDay {

	public static void main(String[] args) {
		//x월 y일 까지의 총 일수
		int totalDays = 0;
		//출력할 요일 문자열 배열
		String[] days = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
		
		System.out.println("x(1≤x≤12) y(1≤y≤31)");
		Scanner sc = new Scanner(System.in);
		
		//입력받은 월
		int x = sc.nextInt();
		//입력받은 일
		int y = sc.nextInt();
		
		//요일 배열 인덱스 구하기: 일수를 7로 나눈 나머지 값을 배열 인덱스로 할당 
		int idx = (getTotalDays(x - 1) + y - 1) % 7;
		//출력
		System.out.println("2007년 " + x + "월" + y + "일은 " + days[idx] + "입니다.");

	}

	//x월 y일 까지의 totalDays 구하기
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

	//월별 일수 구하기
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
