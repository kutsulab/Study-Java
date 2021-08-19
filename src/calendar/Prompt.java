package calendar;

import java.util.Scanner;

public class Prompt {
	
	//private final static String PROMPT = "cal>";
	
	public void runPrompt() {
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);

		int year, month;
		
		
		// 입력부 : 한계점 (int 타입의 변수가 아닐 경우 예외처리하지 못 함)
		
		do {
			// 년도 입력부
			do {
				System.out.println("년도를 입력해주세요. (-1 입력 시 종료)");
				System.out.print("YEAR>");
				year = scanner.nextInt();
				if (year <-1) {
					continue;
				}
				else {
					break;
				}
			} while (true);
			
			if (year == -1) break;
			
			
			// 월 입력부
			do {
				System.out.println("월을 입력하면 달력을 출력합니다. 월을 입력해주세요. (-1 입력 시 종료)");
				System.out.print("MONTH>");
				month = scanner.nextInt();
				
				if (month ==0 || month <-1||month >12) {
					continue;
				}
				
				else {
					break;
				}
				
			} while (true);
			
			if (month == -1) break;
			else {
				cal.printCalendar(year, month);
			}
	
		
		} while (true);
		

		scanner.close();
		System.out.println("끝!");

	}
	
	
	public static void main(String[] args) {
		
		//셸 입력
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
