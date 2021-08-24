package vaccination;

import java.util.ArrayList;

public class Prompt {
	
	ArrayList<PersonalData> everyone  = new ArrayList<PersonalData>();
	
	void runPrompt() {
		
		everyone.add(new PersonalData("홍길동", "M", 35,"1"));
		everyone.add(new PersonalData("이상화", "F", 27,"2"));
		everyone.add(new PersonalData("김인경", "M", 25,"3"));
		
		while (true) {
			
			String order;
			
			System.out.println("------------------------------------------");
			System.out.println("|          A사 사원 백신 접종 현황");
			System.out.println("| [1] 조회");
			System.out.println("| [2] 등록");
			System.out.println("| [h] 도움말");
			System.out.println("| [q] 종료");
			System.out.println("------------------------------------------");
			
			
			System.out.println("명령을 입력해주세요. (1,2,h,q)");
			System.out.print("ORDER >");
			order = Input.sc.nextLine();

			if (order.equals("1")) Search.searchMain();
			else if (order.equals("2")) Registration.registrationMain();
			else if (order.equals("h")) System.out.println("도움말 기능은 이후 지원할 예정입니다.");
			else if (order.equals("q")) break;
			else continue;	
		}
		
		System.out.println("프로그램을 끝낼거에요. 안뇽~~");
	}
}
