package vaccination;

public class Search {
	
	
	public static void searchMain(AllData all) {
		
		
		System.out.println("==========================================");
		System.out.println(":          어떤 방식으로 조회하시겠습니까?");
		System.out.println(": [1] 전체 조회");
		System.out.println(": [2] 성명으로 조회");
		System.out.println(": [3] 성별로 조회");
		System.out.println(": [4] 연령대별 조회");
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
			else if (order.equals("h")) searchHelp();
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
			System.out.println(all.getPersonalData(i));
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
				System.out.print(all.getPersonalData(i)+"\n");
			}
		}
		System.out.println("==========================================");
	}
	
	private static void searchGender(AllData all) {
		String searchGender = "없음", input_Gender;
		boolean run = true;
		
		do {
		System.out.println("찾으시려는 성별을 입력해주세요. [1] 남자 [2] 여자");
		System.out.print("SearchGender > ");
		input_Gender = Input.sc.nextLine();
		
			switch (input_Gender) {
			default :
				System.out.println("잘못 입력하셨습니다.");
				break;
			case "1" :
				searchGender = "남자";
				run = false;
				break;
			case "2" :
				searchGender = "여자";
				run = false;
				break;
			}
		
		} while (run);
		
		System.out.println("==========================================");
		System.out.printf("%s	%s	%s	%s%n","이름","성별","나이","접종백신");
		System.out.println("------------------------------------------");
		for (int i=0; i < all.getAllData().size(); i++) {
			
			if (all.getPersonalGender(i).contains(searchGender)) {
				System.out.print(all.getPersonalData(i)+"\n");
			}
		}
		System.out.println("==========================================");
	}
	
	private static void searchAge(AllData all) {
		int input_Age;
		boolean run = true;
		int searchAge_min = 0;
		int searchAge_max = 10;
		
		do {
			System.out.println("찾으시고자 하는 연령대를 검색해주세요.");
			System.out.println("[0] 0세~9세 [1] 10대 [2] 20대 [3] 30대 [4] 40대");
			System.out.println("[5] 50대 [6] 60대 [7] 70대 [8] 80대 [9] 90대 [10] 100대 이상");
			System.out.print("SearchAge > ");
			
			try {input_Age = Input.sc.nextInt();
				Input.sc.nextLine();
			} catch (Exception e) {
				Input.sc.nextLine();
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			if (input_Age < 0) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
				
			else {
				System.out.println("==========================================");
				System.out.printf("%s	%s	%s	%s%n","이름","성별","나이","접종백신");
				System.out.println("------------------------------------------");
				
				
				if (0<=input_Age&&input_Age<=9) {
					searchAge_min = 10 *input_Age;
					searchAge_max = searchAge_min + 9;
					
					for (int i=0; i < all.getAllData().size(); i++) {
						
						if (searchAge_min<=all.getPersonalAge(i) && all.getPersonalAge(i) <= searchAge_max) {
							System.out.print(all.getPersonalData(i)+"\n");
						}
					}	
 				}
				
				else {
					searchAge_min = 100;
					for (int i=0; i < all.getAllData().size(); i++) {
						
						if (searchAge_min<=all.getPersonalAge(i)) {
							System.out.print(all.getPersonalData(i)+"\n");
							}
						}	
					}
				run = false;	
				}
		} while (run);
		System.out.println("==========================================");
	}
	
	private static void searchVaccine(AllData all) {
		String input_Vaccine;
		String searchVaccine = "없음";
		boolean run = true;
		
		do {
		System.out.println("찾으시려는 분의 백신 접종상태를 입력해주세요. [1] 화이자 [2] 모더나 [3] 얀센");
		System.out.print("SearchVaccine > ");
		input_Vaccine = Input.sc.nextLine();
		
			switch (input_Vaccine) {
			default :
				System.out.println("잘못 입력하셨습니다.");
				break;
			case "1" :
				searchVaccine = "화이자";
				run = false;
				break;
			case "2" :
				searchVaccine = "모더나";
				run = false;
				break;
			case "3" :
				searchVaccine = "얀센";
				run = false;
				break;
			}
		
		} while (run);
		
		System.out.println("==========================================");
		System.out.printf("%s	%s	%s	%s%n","이름","성별","나이","접종백신");
		System.out.println("------------------------------------------");
		for (int i=0; i < all.getAllData().size(); i++) {
			
			if (all.getPersonalVaccine(i).contains(searchVaccine)) {
				System.out.print(all.getPersonalData(i)+"\n");
			}
		}
	}
	
	private static void searchHelp() {
		System.out.println("================조회 도움말====================");
		System.out.println("[1] 전체 조회 : 등록된 모든 사원의 정보를 조회합니다.");
		System.out.println("[2] 성명으로 조회 : 입력한 성명에 해당하는 사원을 조회합니다.");
		System.out.println("[3] 성별로 조회 : 입력한 성별에 해당하는 사원을 조회합니다.");
		System.out.println("[4] 연령대별 조회 : 원하시는 연령대의 사원을 조회합니다.");
		System.out.println("[5] 접종 백신으로 조회 : 입력한 백신을 접종한 사원을 조회합니다.");
		System.out.println("[h] : 조회 기능의 도움말을 봅니다.");
		System.out.println("[q] : 조회를 그만둡니다.");
		System.out.println("==========================================");
	}
}
