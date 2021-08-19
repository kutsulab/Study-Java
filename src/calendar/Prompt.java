package calendar;

import java.util.Scanner;

/**
 * 
 * @kutsulab 
 * str_weekday : 입력한 요일
 * parse_weekday : week를 숫자로 환산한 값 (0 : 일요일 / 6 : 토요일)
 **/

public class Prompt {
	public int parse_weekday(String str_weekday) {
		switch (str_weekday) {
		default : return -2;
		case "일": return 0;
		case "월": return 1;
		case "화": return 2;
		case "수": return 3;
		case "목": return 4;
		case "금": return 5;
		case "토": return 6;
		case "그만해" : return -1;
		}
	}

	public void runPrompt() {
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);

		int year, month, weekday;
		String str_weekday;

		// 입력부 : 한계점 (int 타입의 변수가 아닐 경우 예외처리하지 못 함)

		do {
			// 년도 입력부
			do {
				System.out.println("년도를 입력해주세요. (-1 입력 시 종료)");
				System.out.print(("YEAR>"));
				year = scanner.nextInt();
				scanner.nextLine();

				if (year < -1) {
					continue;
				} else {
					break;
				}
			} while (true);

			if (year == -1) {
				break;
			}

			// 월 입력부
			do {
				System.out.println("월을 입력해주세요. (-1 입력 시 종료)");
				System.out.print(("MONTH>"));
				month = scanner.nextInt();
				scanner.nextLine();

				if (month == 0 || month < -1 || month > 12) {
					continue;
				}

				else {
					break;
				}

			} while (true);

			if (month == -1) {
				break;
			}

			do {
				System.out.println("첫번째 날의 요일을 입력하세요. (일, 월, 화, 수, 목, 금, 토) / (그만해 입력 시 종료)");
				System.out.print(("WEEKDAY>"));
				str_weekday = scanner.nextLine();
				
				weekday = parse_weekday(str_weekday);
				
				if (weekday>=-1) break;
				else continue;	
				
			} while (true);

			
			// 그만해 입력하면 do문 탈출 하게
			if (weekday==-1) {
				break;
			}
			
			else {
				cal.printCalendar(year, month, weekday);
			}
			
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
