package vaccination;

public class Prompt {
	
	void runPrompt() {
		
		AllData all = new AllData();
		
		all.addPersonalData("홍길동", "M", 35, "1");
		all.addPersonalData("이상화", "F", 25, "2");
		all.addPersonalData("김인경", "M", 25, "3");
		
		while (true) {
			
			String order;
			Search s = new Search();
			Registration r = new Registration();
			
			System.out.println("==========================================");
			System.out.println("|          A사 사원 백신 접종 현황");
			System.out.println("| [1] 조회");
			System.out.println("| [2] 등록");
			System.out.println("| [h] 도움말");
			System.out.println("| [q] 종료");
			System.out.println("==========================================");
			
			
			System.out.println("명령을 입력해주세요. (1,2,h,q)");
			System.out.print("ORDER >");
			order = Input.sc.nextLine();

			if (order.equals("1")) s.searchMain(all);
			else if (order.equals("2")) r.registrationMain(all);
			else if (order.equals("h")) System.out.println("도움말 기능은 이후 지원할 예정입니다.");
			else if (order.equals("q")) break;
			else continue;	
		}
		
		System.out.println("프로그램을 끝낼거에요. 안뇽~~");
	}
}
