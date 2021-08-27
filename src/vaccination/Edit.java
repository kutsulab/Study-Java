package vaccination;

public class Edit {
	
	public static void editMain(AllData all) {
		
		System.out.println("==========================================");
		System.out.println(":          어떤 방식으로 수정하시겠습니까?");
		System.out.println(": [1] 특정인의 모든 정보 수정");
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
			
			// 앞까지는 기존 코드 재활용했고 여기서부터는 정상 입력상황 가정 테스트 (예외처리 아직 안 함)
			String beforeGender = all.getPersonalGender(index);
			int beforeAge = all.getPersonalAge(index);
			String beforeVaccine = all.getPersonalVaccine(index);
			
			System.out.println(beforeName+"님의 성명을 무엇으로 변경하시겠습니까?");
			System.out.print("EditName >");
			String editName = Input.sc.nextLine();
			
			System.out.println(beforeName+"님의 성별을 무엇으로 변경하시겠습니까?");
			System.out.print("EditGender >");
			String input_editGender = Input.sc.nextLine();
			
			String editGender;
			if (input_editGender.equals("M")) editGender = "남자";
			else editGender = "여자";
			
			System.out.println(beforeName+"님의 연령을 몇 세로 변경하시겠습니까?");
			System.out.print("EditAge >");
			int editAge = Input.sc.nextInt();
			Input.sc.nextLine();
			
			System.out.println(beforeName+"님의 백신 접종 상태를 무엇으로 변경하시겠습니까?");
			System.out.print("EditVaccine >");
			String input_editVaccine = Input.sc.nextLine();
			
			String editVaccine;
			
			if (input_editVaccine.equals("1")) editVaccine = "화이자";
			else if (input_editVaccine.equals("2")) editVaccine = "모더나";
			else editVaccine="얀센";
			
			boolean run = true;
			
			do {
				System.out.println(beforeName+"님의 정보를 정말로 다음과 같이 변경하시겠습니까?");
				System.out.printf("%7s	%s	%s	%s	%s%n","       ","이름","성별","나이","백신");
				System.out.printf("%7s	%s	%s	%d	%s%n","변경 전 : ",beforeName,beforeGender,beforeAge,beforeVaccine);
				System.out.printf("%7s	%s	%s	%d	%s%n","변경 후 : ",editName,editGender,editAge,editVaccine);
				
				System.out.println("[1] 네네 / [2] 아니오아니오");
				System.out.println("Really? >");
				String really = Input.sc.nextLine();
				
				switch (really) {
				
				default : 
					System.out.println("잘못 입력하셨습니다.");
					break;
				case "2" :
					System.out.println(beforeName+"님의 정보를 수정하지 않습니다.");
					run = false;
					break;
				case "1" :
					all.editPersonalAll(index, editName,input_editGender,editAge,input_editVaccine);
					System.out.println(beforeName+"님의 정보가 변경되었습니다.");
					run = false;
					break;
				}
				
			} while (run);
			
			}

			
			
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
					System.out.print("Really? >");
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
		System.out.println("변경하시려는 분의 성명을 입력해주세요. ");
		System.out.print("Name > ");
		String beforeName = Input.sc.nextLine();
		
		System.out.println(beforeName+"님이 존재하는 지 조회합니다.");
		
		if (!all.isThisPersonHere(beforeName)) {
			System.out.println(beforeName+"님은 명단에 존재하지 않습니다.");
			System.out.println("성별 수정 기능을 종료합니다.");
			return;
		}
		
		
		else {
				System.out.println(beforeName+"님이 확인됐습니다.");
				int index = all.getPersonalIndex(beforeName);
	
				boolean run = true;
				String input_Gender;
				String editGender = "무성";
				
				do {
					System.out.println(beforeName+"님의 성별을 무엇으로 변경하시겠습니까? (M, F)");
					System.out.print("EditGender >");
					
					input_Gender = Input.sc.nextLine();
					
					switch (input_Gender) {
					default :
						break;
					case "M" : 
						editGender = "남자";
						run = false;
						break;
					case "F" : 
						editGender = "여자";
						run = false;
						break;

					}
					
				} while (run);
			
				
				run = true;
				
				do {
					System.out.println(beforeName+"님의 성별을 정말로 '"+editGender+"'로 변경하시겠습니까?");
					System.out.println("[1] 네네 / [2] 아니오아니오");
					System.out.print("Really? >");
					String really = Input.sc.nextLine();
					
					switch (really) {
					
					default : 
						System.out.println("잘 못 입력하셨습니다.");
						break;
					case "2" :
						System.out.println(beforeName+"님의 성별을 수정하지 않습니다.");
						run = false;
						break;
					case "1" :
						all.editPersonalGender(index, editGender);
						System.out.println(beforeName+"님의 성별이 '"+editGender+"'으로 변경되었습니다.");
						run = false;
						break;
					}
					
				} while (run);
			
			System.out.println("성별 수정 기능을 종료합니다.");
			return;
		}
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
