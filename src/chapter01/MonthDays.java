package chapter01;

import java.util.Scanner;

public class MonthDays {
	public static void main(String[] args) {
		System.out.print("월을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		ifMonthDays(month);
		switchMonthDays(month);
	}

	public static void ifMonthDays(int month) {
		int days = 0;

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			days = 31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		} else if (month == 2) {
			days = 28;
		}
		System.out.println("ifMonthDays : " + month + "월은 " + days + "일 까지 있습니다.");
	}

	public static void switchMonthDays(int month) {
		int days = 0;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			days = 28;
			break;

		default:
			break;
		}
		System.out.println("switchMonthDays : " + month + "월은 " + days + "일 까지 있습니다.");

	}
}
