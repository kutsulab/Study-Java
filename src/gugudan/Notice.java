package gugudan;

public class Notice {

		public static void introduce() {	
			System.out.println("이 프로그램은 세번에 걸쳐서 출력 구구단의 설정값을 묻고, 입력한 값을 토대로 구구단을 출력합니다.\n");
			System.out.println("1. 시작하는 단");
			System.out.println("2. 끝나는 단");
			System.out.println("3. 각 단의 출력량");
			System.out.println("출력 예 : 2, 7, 3을 순서대로 입력시 2*1, 2*2, 2*3, 3*1, ... 7*3까지 출력\n");
		}
		
		public static void firstdanNotice() {
			System.out.println("시작 단을 설정합니다.");	
			System.out.println("2 이상 9 이하의 정수를 입력하셔야 합니다.");
			System.out.println("9.0과 같이 소숫점이 붙은 형태로 입력할 수 없습니다.");
			System.out.print("몇 단부터 출력하시겠습니까? : ");
		}
		
		public static void finaldanNotice() {
			System.out.println("마지막 단을 설정합니다.");	
			System.out.println(Input.firstdan+" 이상 9 이하의 정수를 입력하셔야 합니다.");
			System.out.println("9.0과 같이 소숫점이 붙은 형태로 입력할 수 없습니다.");
			System.out.print("몇 단까지 출력하시겠습니까? : ");
			}
		
		public static void countNotice() {
			System.out.println("각 단의 출력량을 설정합니다.");
			System.out.println("출력량만큼 각 단이 출력됩니다. (예 : 7 입력시 각 단 출력이 * 7 에서 끝남.)");
			System.out.println("1 이상의 정수를 입력하셔야합니다.");
			System.out.println("9.0과 같이 소숫점이 붙은 형태로 입력할 수 없습니다.");
			System.out.print("몇 단까지 출력하시겠습니까? : ");
		}
		
		public static void errorNotice(String error) {
			System.out.println("========== Error ==========");
			switch (error) {
			
			case "firstdan_Range" :
				System.out.println("값을 잘못 입력하셨습니다.");
				System.out.println("2 이상 9 이하의 정수를 입력하십시오.");
				System.out.println("9.0과 같이 소숫점이 붙은 형태로 입력할 수 없습니다.");
				break;
			
			case "finaldan_Range" :
				System.out.println("값을 잘못 입력하셨습니다.");
				System.out.println(Input.firstdan+" 이상 9 이하의 정수를 입력하십시오.");
				System.out.println("9.0과 같이 소숫점이 붙은 형태로 입력할 수 없습니다.");
				break;
				
			case "count_Range" :
				System.out.println("값을 잘못 입력하셨습니다.");
				System.out.println("1 이상의 정수를 입력하십시오.");
				System.out.println("9.0과 같이 소숫점이 붙은 형태로 입력할 수 없습니다.");
				break;	
			}
			
			
		}
}
