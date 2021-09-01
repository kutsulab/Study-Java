package Inputter;

import java.util.Scanner;

class Input {
	static Scanner scanner = new Scanner(System.in);
	
	public static int getInt() {
		//1. 값 입력 요청 + 값 입력 + int 타입이 아닌 값을 입력했을 때에 대한 예외처리
		int temp_int = getTemp_int();

		// 2. 값의 유효성 검사 (추가 안 함)

		// 3. 유효한 값을 입력했을 경우 반환
		int returnInt = temp_int;
		return returnInt;
	}
	
	static int getTemp_int() {	
		int temp_int;
		
		do {
			try {
				Request r = new GuGuDanRequest();
				r.request();
				temp_int = scanner.nextInt();
				scanner.nextLine();
			} catch (Exception e) {
				scanner.nextLine();
				int_exceptionMessage();
				continue;
			}		
			
			break;
			
		} while (true);

		return temp_int;
	}


	static void int_exceptionMessage() {
		System.out.println("정수가 아닌 값을 입력했습니다. 정수를 입력하세요.");
		return;
	}
	
}