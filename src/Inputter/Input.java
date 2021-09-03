package Inputter;

import java.util.Scanner;

class Input {
	static Scanner scanner = new Scanner(System.in);

	public static int getInt() {
		
		int tempInt = 0;
		int returnInt = 0;
		Request_Int rqi = new GuGuDanRequest();

		do {
			// 1. 값 입력 요청 + 값 입력 + int 타입이 아닌 값을 입력했을 때에 대한 예외처리
			tempInt = getTemp_int(rqi);

			// 2. 값의 유효성 검사
			if (rqi.int_condition(tempInt)) {
				returnInt = tempInt;
				break;
			} else {
				rqi.notValidIntMessage();
				continue;
			}
			
		} while (true);
		
		// 3. 유효한 값을 입력했을 경우 반환
		return returnInt;
	}

	private static int getTemp_int(Request_Int rqi) {
		int tempInt = 0;
		
		do {
			try {
				rqi.request();
				tempInt = scanner.nextInt();
				scanner.nextLine();
			} catch (NumberFormatException ne) {
				scanner.nextLine();
				rqi.exceptionMessage(); // int 타입이 아닌 값을 입력했을 때의 경고 메세지
				continue;
			}
			
			break;
			
		} while (true);
		return tempInt;
	}
}