package vaccination;

public class PersonalData {
	private String name, gender, vaccine;
	private int age;
	
	PersonalData(String name, String input_gender, int age, String input_vaccine) {
		this.name = name;
		
		if (input_gender.contentEquals("M")) this.gender = "남자";
		else this.gender = "여자";
		
		this.age = age;
		
		if (input_vaccine.equals("1")) this.vaccine = "화이자";
		else if (input_vaccine.equals("2")) this.vaccine = "모더나";
		else this.vaccine="얀센";
	}

	public String getName() {return name;}
	public String getGender() {return gender;}
	public int getAge() {return age;}
	public String getVaccine() {return vaccine;}


	
	
	
}
