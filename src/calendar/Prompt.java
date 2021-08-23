package calendar;

public class Prompt {

	private void runPrompt() {

		// 입력부
		do {
			// 년도 입력부
			int year = Input.inputYear();
			if (year == 0)
				break;

			// 월 입력부
			int month = Input.inputMonth();
			if (month == 0)
				break;

			Calendar cal = new Calendar(year, month);
			cal.printCalendar();

		} while (true);
		System.out.println("끝!");
	}

	public static void main(String[] args) {

		// 셸 입력
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
