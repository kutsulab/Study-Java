package vaccination;

public class Delete {

	public static void deleteMain(AllData all) {
		System.out.println("==========================================");
		System.out.println(":          어떤 방식으로 삭제하시겠습니까?");
		System.out.println(": [1] 특정인의 모든 정보 삭제");
		System.out.println(": [h] 삭제 기능 도움말 [q] 종료");
		System.out.println("==========================================");
		
		while (true) {
			
			String order;
			System.out.println("삭제 명령을 입력해주세요. (1,h,q)");
			System.out.print("Delete > ");
			order = Input.sc.nextLine();

			if (order.equals("1")) deleteName(all);
			else if (order.equals("h")) deleteHelp();
			else if (order.equals("q")) break;
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				continue;	
			}
		}
		System.out.println("삭제를 종료합니다.");
	}

	private static void deleteName(AllData all) {

		System.out.println("삭제하시려는 분의 성명을 입력해주세요. ");
		System.out.print("Name > ");
		String Input_Name = Input.sc.nextLine();

		System.out.println(Input_Name + "님이 존재하는 지 조회합니다.");

		if (!all.isThisPersonHere(Input_Name)) {
			System.out.println(Input_Name + "님은 명단에 존재하지 않습니다.");
			System.out.println("삭제 기능을 종료합니다.");
			return;
		}

		else {
			System.out.println(Input_Name + "님이 확인됐습니다.");
			System.out.println("==========================================");
			int index = all.getPersonalIndex(Input_Name);
			System.out.printf("%s	%s	%s	%s%n", "이름", "성별", "나이", "백신");
			System.out.println(all.getPersonalData(index));
			System.out.println("==========================================");
			boolean run = true;

			do {
				System.out.println(Input_Name + "님의 정보를 정말로 삭제하시겠습니까?");
				System.out.println("[1] 네네 / [2] 아니오아니오");
				System.out.print("Really? >");
				String really = Input.sc.nextLine();

				switch (really) {

				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
				case "2":
					System.out.println(Input_Name + "님의 정보를 삭제하지 않습니다.");
					run = false;
					break;
				case "1":
					all.deletePersonalData(index);
					System.out.println(Input_Name + "님의 정보가 삭제되었습니다.");
					System.out.println("==========================================");
					run = false;
					break;
				}

			} while (run);
		}
	}
	
	private static void deleteHelp() {
		System.out.println("================수정 도움말====================");
		System.out.println("[1] 특정인의 모든 정보 삭제 : 입력한 이름에 해당하는 사람의 정보를 삭제합니다.");
		System.out.println("[h] 삭제 기능의 도움말을 봅니다.");
		System.out.println("[q] 삭제 기능을 그만둡니다.");
		System.out.println("==========================================");
	}
}
