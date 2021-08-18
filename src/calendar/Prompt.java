package calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal>";
	
	public void runPrompt() {
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);

		int month;

		// 달을 입력하면 그 달의 달력을 출력 (1일은 일요일로 가정)
		while (true) {
			System.out.println("달을 입력하면 그 달의 달력을 출력합니다. (1일이 일요일)");
			System.out.print(PROMPT);
			month = scanner.nextInt();

			if (month > 12 || month == 0 || month <= -2) {
				continue;
			}

			else if (month == -1) {
				break;
			}

			else {
				Calendar.printCalendar(2021,month);
			}
		}
		scanner.close();
		System.out.println("끝!");

	}
	
	
	public static void main(String[] args) {
		
		//셸 입력
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
