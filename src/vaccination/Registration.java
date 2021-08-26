package vaccination;

public class Registration {

	private String regName, regGender, regVaccine;
	private int regAge;

	public void registrationMain(AllData all) {
		
		System.out.println("==========================================");
		
		setRegName(all);
		setRegGender();
		setregAge();
		setregVaccine();

		PersonalData p = new PersonalData(regName, regGender, regAge, regVaccine);
		all.addPersonalData(p);
		System.out.println(regName + "님의 백신 접종 현황이 등록되었습니다.");
	}
	
	private void setRegName(AllData all) {

		while (true) {
			System.out.println("등록하실 분의 성명을 입력해주세요.");
			System.out.print("Name > ");
			String tempName = Input.sc.nextLine();

			if (all.isThisPersonHere(tempName)) {
				System.out.println("등록하시려는 분은 이미 존재합니다.");
				continue;
			}

			else {
				regName = tempName;
				break;
			}
		}
	}
	private void setRegGender() {
		boolean run = true;
		
		while (run) {
			System.out.println("성별을 입력해주세요. (M:남성) (F:여성)");
			System.out.print("Gender > ");

			String tempGender = Input.sc.nextLine();
			
			switch(tempGender) {
			case "M" : case "F" :
				regGender = tempGender;
				run = false;
				break;
			default : 
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	
	private void setregAge() {

		int tempAge;
		while (true) {
			System.out.println("나이를 입력해주세요. (0 이상의 정수)");
			System.out.print("Age > ");

			try {
				tempAge = Input.sc.nextInt();
				Input.sc.nextLine();
			} catch (NumberFormatException e) {
				Input.sc.nextLine();
				continue;
			}

			
			if (tempAge<0) continue;
			else break;
		}
		
		regAge = tempAge;
	}

	private void setregVaccine() {
		boolean run = true;
		
		while (run) {
			System.out.println("접종 받은 백신에 해당하는 번호를 입력해주세요. (1:화이자) (2:모더나) (3:얀센)");
			System.out.printf("Vaccine Number > ");
			String tempVaccine = Input.sc.nextLine();
			
			switch(tempVaccine) {
			case "1" : case "2" : case "3":
				regVaccine = tempVaccine;
				run = false;
				break;
			default : 
				break;
			}
		}
	}
	
}
