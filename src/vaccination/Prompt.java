package vaccination;



public class Prompt {
	public static void runPrompt() {
		
		AllData all = new AllData();
		
		all.addPersonalData("홍길동", "M", 35, "1");
		all.addPersonalData("이상화", "F", 27, "2");
		all.addPersonalData("김인경", "M", 25, "3");
		
	
		while (true) {
			
			String order;
			Registration r = new Registration();
			
			System.out.println("==========================================");
			System.out.println(":       A사 사원 백신 접종 현황 Home");
			System.out.println(": [1] 조회");
			System.out.println(": [2] 등록");
			System.out.println(": [3] 개인 정보 수정(미완성)");
			System.out.println(": [4] 개인 정보 삭제(미구현)");
			System.out.println(": [h] Home 도움말");
			System.out.println(": [q] 종료");
			System.out.println("==========================================");
			
			System.out.println("명령을 입력해주세요. (1,2,3,4,h,q)");
			System.out.print("ORDER >");
			order = Input.sc.nextLine();

			if (order.equals("1")) Search.searchMain(all);
			else if (order.equals("2")) r.registrationMain(all);
			else if (order.equals("3")) Edit.editMain(all);
			else if (order.equals("4")) System.out.println("삭제 기능은 이후 지원할 예정입니다.");
			else if (order.equals("h")) promptHelp();
			else if (order.equals("q")) break;
			else {
				System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
				continue;	
			}
		}
		
		System.out.println("프로그램을 끝낼거에요. 안뇽~~");
	}
	
	private static void promptHelp() {
		System.out.println("==========================================");
		System.out.println(":          백신 접종 현황 기능 도움말");
		System.out.println(": [1] 조회 : 원하는 방식으로 사원들의 정보를 조회합니다.");
		System.out.println(": [2] 등록 : 새로 사원의 정보를 등록합니다.");
		System.out.println(": [3] 개인 정보 수정 : 사원의 정보를 수정합니다.");
		System.out.println(": [4] 개인 정보 삭제(미구현) : 특정 사원의 정보를 삭제합니다.");
		System.out.println(": [h] Home 도움말 : 백신 접종 현황 창의 도움말을 보여줍니다.");
		System.out.println(": [q] 종료");
		System.out.println("==========================================");
	}
}
