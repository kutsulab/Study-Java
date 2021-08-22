package gugudan;

import java.util.Scanner;

public class Prompt {
	public static Scanner scanner = new Scanner(System.in);

	public void prompt() {

		System.out.println("+-----------------------");
		System.out.println("|       <<Gugudan>> ");
		System.out.println("| ");
		System.out.println("| 1. 1개 단 출력");
		System.out.println("| 2. 사용자 정의 구구단");
		System.out.println("| h. 도움말 q. 끝내기");
		System.out.println("+-----------------------");

		do {
			Order o = new Order();
			System.out.println("> 입력하세요. (1, 2, h, q)");
			System.out.print(">");
			String order = scanner.nextLine();

			if (order.equals("1")) o.order1();
			else if (order.equals("2")) o.order2();
			else if (order.equals("h")) o.orderHelp();
			else if (order.equals("q")) break;
			else continue;
			
		} while (true);

		scanner.close();
		System.out.println("프로그램을 종료합니다. 안뇽~~~");
		
	}

}
