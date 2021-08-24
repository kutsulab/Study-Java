package vaccination;

public class Search {
	
	public static void searchMain() {
	
		System.out.println("------------------------------------------");
		System.out.println(":          어떤 방식으로 조회하시겠습니까?");
		System.out.println(": [1] 전체 조회");
		System.out.println(": [2] 성명으로 찾기");
		System.out.println(": [3] 성별로 찾기");
		System.out.println(": [4] 연령 범위");
		System.out.println(": [5] 접종 백신으로 조회");
		System.out.println(": [h] 도움말 [q] 종료");
		System.out.println("------------------------------------------");
		
	while (true) {
			
			String order;
			
			System.out.println("조회 방식을 입력해주세요. (1,2,3,4,5,h,q)");
			System.out.println("Search");
			order = Input.sc.nextLine();


			if (order.equals("1")) searchAll();
			else if (order.equals("2")) searchName();
			else if (order.equals("3")) searchGender();
			else if (order.equals("4")) searchAge();
			else if (order.equals("5")) searchVaccine();
			else if (order.equals("h")) System.out.println("도움말 기능은 추후 구현하겠습니다.");
			else if (order.equals("0")) break;
			else continue;	
		}
	
	}
	
	public static void searchAll() {
		
	}
	
	public static void searchName() {
		
	}
	
	public static void searchGender() {
		
	}
	
	public static void searchAge() {
		
	}
	
	public static void searchVaccine() {
		
	}
}
