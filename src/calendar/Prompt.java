package calendar;

import java.util.Scanner;

public class Prompt {

	private void runPrompt() {
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);

		int year, month;

		// 입력부

		do {
			// 년도 입력부
			do {
				System.out.println("년도를 입력해주세요. ( 0 입력 시 종료 )");
				System.out.print(("YEAR>"));

				try {
					year = scanner.nextInt();
					scanner.nextLine();
				} catch (Exception e) {
					scanner.nextLine();
					continue;
				}

				if (year <= -1) {
					continue;
				} else {
					break;
				}

			} while (true);

			if (year == 0)
				break;

			// 월 입력부
			do {
				System.out.println("월을 입력해주세요. ( 0 입력 시 종료)");
				System.out.print(("MONTH>"));
				try {
					month = scanner.nextInt();
					scanner.nextLine();
				} catch (Exception e) {
					scanner.nextLine();
					continue;
				}

				if (month <= -1 || month > 12)
					continue;
				else
					break;

			} while (true);

			if (month == 0)
				break;

			cal.printCalendar(year, month);

		} while (true);

		scanner.close();
		System.out.println("끝!");
	}

	public static void main(String[] args) {

		// 셸 입력
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
