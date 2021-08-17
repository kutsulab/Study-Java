package calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return maxDays[month - 1];
	}

	public void printSampleCalendar() {
		System.out.println("=======달력 샘플=======");
		System.out.println(" 일   월   화   수   목   금   토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {

		Calendar cal = new Calendar();
		String prompt = "cal> ";
		Scanner scanner = new Scanner(System.in);

		int month = 0;
		// 달을 입력하면 그 달의 최대 일수 출력
		while (true) {
			System.out.println("달을 입력하면 최대 일수를 알려드립니다. (-1 입력시 프로그램 중지, 1~12 이외 정수 입력시 다시 질문)");
			System.out.print(prompt);
			month = scanner.nextInt();

			if (month > 12 || month == 0 || month <= -2) {
				continue;
			}

			if (month == -1) {
				break;
			}

			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
		}
		scanner.close();
		System.out.println("끝!");

	}
}
