package vaccination;

public class Edit {
	
	public static void editMain(AllData all) {
		
		System.out.println("==========================================");
		System.out.println(":          어떤 방식으로 수정하시겠습니까?");
		System.out.println(": [1] 해당인의 정보를 지우고, 타인의 데이터로 대체 (미구현)");
		System.out.println(": [2] 이름 수정");
		System.out.println(": [3] 성별 수정 (미구현)");
		System.out.println(": [4] 나이 수정 (미구현)");
		System.out.println(": [5] 접종백신 수정 (미구현)");
		System.out.println(": [h] 도움말(미구현) [q] 종료");
		System.out.println("==========================================");
		
		while (true) {
			
			String order;
			System.out.println("수정 방식을 입력해주세요. (1,2,3,4,5,h,q)");
			System.out.print("Edit > ");
			order = Input.sc.nextLine();

			if (order.equals("1")) editAll(all);
			else if (order.equals("2")) editName(all);
			else if (order.equals("3")) editGender(all);
			else if (order.equals("4")) editAge(all);
			else if (order.equals("5")) editVaccine(all);
			else if (order.equals("h")) System.out.println("도움말 기능은 추후 구현하겠습니다.");
			else if (order.equals("q")) break;
			else continue;	
		}
		System.out.println("수정을 종료합니다.");
		
	}
	
	public static void editAll(AllData all) {
		System.out.println("미구현 상태입니다.");
		return;
	}
	
	private static void editName(AllData all) {

			System.out.println("변경하시려는 성명을 입력해주세요. ");
			System.out.print("Name > ");
			String beforeName = Input.sc.nextLine();
			
			System.out.println(beforeName+"님이 존재하는 지 조회합니다.");
			
			if (!all.isThisPersonHere(beforeName)) {
				System.out.println(beforeName+"님은 명단에 존재하지 않습니다.");
				System.out.println("이름 수정 기능을 종료합니다.");
				return;
			}
			
			else {
				System.out.println(beforeName+"님이 확인됐습니다.");
				int index = all.getPersonalIndex(beforeName);

				System.out.println(beforeName+"님의 성명을 무엇으로 변경하시겠습니까?");
				System.out.print("EditName >");
				String editName = Input.sc.nextLine();

				boolean run = true;
				
				do {
					System.out.println(beforeName+"님의 성명을 정말로 '"+editName+"'으로 변경하시겠습니까?");
					System.out.println("[1] 네네 / [2] 아니오아니오");
					System.out.println("Really? >");
					String really = Input.sc.nextLine();
					
					switch (really) {
					
					default : 
						System.out.println("잘 못 입력하셨습니다.");
						break;
					case "2" :
						System.out.println(beforeName+"님의 성명을 수정하지 않습니다.");
						run = false;
						break;
					case "1" :
						all.editPersonalName(index, editName);
						System.out.println(beforeName+"님의 성명이 '"+editName+"'으로 변경되었습니다.");
						run = false;
						break;
					}
					
				} while (run);
				
				System.out.println("이름 수정 기능을 종료합니다.");
				return;
				
			}
	}
	
	private static void editGender(AllData all) {
		System.out.println("미구현 상태입니다.");
		return;
	}
	
	private static void editAge(AllData all) {
		System.out.println("미구현 상태입니다.");
		return;
	}
	
	private static void editVaccine(AllData all) {
		System.out.println("미구현 상태입니다.");
		return;
	}
}
