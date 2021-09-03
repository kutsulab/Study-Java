package calendar;

import java.util.Scanner;

public class Input {

	private static Scanner scanner = new Scanner(System.in);

	public static int inputYear() {
		int year;

		do {
			System.out.println("년도를 입력해주세요. ( 0 입력 시 종료 )");
			System.out.print(("YEAR> "));

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
		
		return year;
	}
	
	public static int inputMonth() {
		int month;
		
		do {
			System.out.println("월을 입력해주세요. ( 0 입력 시 종료)");
			System.out.print(("MONTH> "));
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
		
		return month;
	}
	
}
