package gugudan;

public class Order {

	public void order1() {
		do {
			int dan;
			System.out.println("몇 단을 출력하시겠습니까?");
			System.out.print("Dan > ");

			try {
				dan = Prompt.scanner.nextInt();
				Prompt.scanner.nextLine();
			} catch (Exception e) {
				Prompt.scanner.nextLine();
				System.out.println("단을 잘못 입력하셨습니다. 단을 다시 입력해주세요.");
				continue;
			}

			if (dan > 9 || dan < 2) {
				System.out.println("단을 잘못 입력하셨습니다. 단을 다시 입력해주세요.");
				continue;
			}

			else {
				System.out.println("입력하신 단 : " + dan);
				Dan d = new Dan(dan, dan, 9);
				d.printDan();
				break;
			}
		} while (true);
	}

	public void order2() {
		do {
			int firstdan, finaldan, size;

			// 시작하는 단
			do {

				System.out.println("몇 단부터 출력하시겠습니까?");
				System.out.print("FirstDan > ");

				try {
					firstdan = Prompt.scanner.nextInt();
					Prompt.scanner.nextLine();
				} catch (Exception e) {
					Prompt.scanner.nextLine();
					System.out.println("오류 발생! 다시 입력해주세요.");
					continue;
				}

				if (firstdan > 9 || firstdan < 1) {
					System.out.println("2 이상 9 이하의 정수를 다시 입력해주세요.");
					continue;
				}

				else {
					System.out.println("첫번째 단 : " + firstdan);
					break;
				}

			} while (true);

			// 끝나는 단
			do {
				if (firstdan == 9) {
					System.out.println("9단에서 시작하므로 9단만 출력합니다.");
					finaldan = 9;
					break;
				}

				System.out.println("몇 단까지 출력하시겠습니까?");
				System.out.print("FinalDan > ");

				try {
					finaldan = Prompt.scanner.nextInt();
					Prompt.scanner.nextLine();

				} catch (Exception e) {
					Prompt.scanner.nextLine();
					System.out.println("오류 발생! 다시 입력해주세요.");
					continue;
				}

				if (finaldan > 9 || finaldan < 1) {
					System.out.println("2 이상 9 이하의 정수를 다시 입력해주세요.");
					continue;
				}

				if (firstdan > finaldan) {
					System.out.println("firstdan 이상 9 이하의 정수를 다시 입력해주세요.");
					continue;
				}

				System.out.println("끝나는 단 : " + finaldan);
				break;

			} while (true);

			do {
				System.out.println("각 단을 얼마만큼 출력하시겠습니까?");
				System.out.print("Size > ");

				try {
					size = Prompt.scanner.nextInt();
					Prompt.scanner.nextLine();
				} catch (Exception e) {
					Prompt.scanner.nextLine();
					System.out.println("오류 발생! 다시 입력해주세요.");
					continue;
				}

				if (size < 1) {
					System.out.println("1 이상의 정수를 다시 입력해주세요.");
					continue;
				}

				else {
					System.out.println("각 단의 출력량 : " + size);
					break;
				}
			} while (true);
			
			
			Dan d = new Dan(firstdan, finaldan, size);
			d.printDan();
			break;

		} while (true);
	}
	
	public void orderHelp() {
		System.out.println("-------------<도움말>--------------------------------------");
		System.out.println();
		System.out.println("1. 1개단 출력");
		System.out.println("  1개단 출력은 입력한 단(2 이상 9이하)만을 *1부터 *9까지 출력합니다.");
		System.out.println("  예) 2 입력 시 2*1, 2*2, ..., 2*9 출력");
		System.out.println("2. 사용자 정의 구구단");
		System.out.println("  사용자 정의 구구단은 입력한 범위 내의 구구단을 원하는 양만큼 출력합니다.");
		System.out.println("  시작하는 단, 끝나는 단, 각 단의 출력량을 모두 지정하실 수 있습니다.");
		System.out.println("  입력하실 때는 2 이상 9 이하의 정수를 입력하셔야하고,");
		System.out.println("  끝나는 단을 설정하실 때 시작하는 단보다 작은 정수를 입력하시면 안 됩니다.");
		System.out.println("  예) 3,7,5 입력시 3*1, 3*2, ... 3*5, 4*1, ... , 7*5 출력");
		System.out.println("h. 입력 시 구구단 프로그램의 도움말을 표시합니다. (현재 창)");
		System.out.println("q. 입력 시 구구단 프로그램을 종료합니다.");
		System.out.println();
		System.out.println("---------------------------------------------------------");	
	}
}
