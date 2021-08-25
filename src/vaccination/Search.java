package vaccination;

public class Search {
	
	
	public static void searchMain(AllData all) {
		
		
		System.out.println("==========================================");
		System.out.println(":          어떤 방식으로 조회하시겠습니까?");
		System.out.println(": [1] 전체 조회");
		System.out.println(": [2] 성명으로 찾기");
		System.out.println(": [3] 성별로 찾기");
		System.out.println(": [4] 연령 범위");
		System.out.println(": [5] 접종 백신으로 조회");
		System.out.println(": [h] 도움말 [q] 종료");
		System.out.println("==========================================");
		
	while (true) {
			
			String order;
			System.out.println("조회 방식을 입력해주세요. (1,2,3,4,5,h,q)");
			System.out.print("Search > ");
			order = Input.sc.nextLine();

			if (order.equals("1")) searchAll(all);
			else if (order.equals("2")) searchName(all);
			else if (order.equals("3")) searchGender(all);
			else if (order.equals("4")) searchAge(all);
			else if (order.equals("5")) searchVaccine(all);
			else if (order.equals("h")) System.out.println("도움말 기능은 추후 구현하겠습니다.");
			else if (order.equals("q")) break;
			else continue;	
		}
		System.out.println("검색을 종료합니다.");
	
	}
	
	public static void searchAll(AllData all) {
		System.out.println("==========================================");
		System.out.printf("%s	%s	%s	%s%n","이름","성별","나이","접종백신");
		System.out.println("------------------------------------------");
		for (int i=0; i< all.getAllData().size(); i++) {
			System.out.print(all.getPersonalName(i)+"	");
			System.out.print(all.getPersonalGender(i)+"	");
			System.out.print(all.getPersonalAge(i)+"	");
			System.out.print(all.getPersonalVaccine(i)+"\n");
		}
		System.out.println("==========================================");
	}
	
	private static void searchName(AllData all) {
		System.out.println("찾으시려는 성명을 입력해주세요.");
		System.out.print("SearchName > ");
		String searchName = Input.sc.nextLine();
		
		System.out.println("==========================================");
		System.out.printf("%s	%s	%s	%s%n","이름","성별","나이","접종백신");
		System.out.println("------------------------------------------");
		for (int i=0; i < all.getAllData().size(); i++) {
			
			if (all.getPersonalName(i).contains(searchName)) {
				System.out.print(all.getPersonalName(i)+"	");
				System.out.print(all.getPersonalGender(i)+"	");
				System.out.print(all.getPersonalAge(i)+"	");
				System.out.print(all.getPersonalVaccine(i)+"\n");
			}
		}
		System.out.println("==========================================");
	}
	
	private static void searchGender(AllData a) {
		System.out.println("미구현 상태입니다.");
	}
	
	private static void searchAge(AllData a) {
		System.out.println("미구현 상태입니다.");
	}
	
	private static void searchVaccine(AllData a) {
		System.out.println("미구현 상태입니다.");
	}
}
