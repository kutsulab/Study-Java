
package vaccination;

public class PersonalData {
	private String name, gender, vaccine;
	private int age;
	
	PersonalData() {}
		
	PersonalData(String name, String input_gender, int age, String input_vaccine) {
		
			this.name = name;
			
			if (input_gender.contentEquals("M")) this.gender = "남자";
			else this.gender = "여자";
			
			this.age = age;
			
			if (input_vaccine.equals("1")) this.vaccine = "화이자";
			else if (input_vaccine.equals("2")) this.vaccine = "모더나";
			else this.vaccine="얀센";
	}
	
	
	//Setter
		public void setName(String name) {this.name = name;}
		public void setGender(String gender) {this.gender = gender;}
		public void setAge(int age) {this.age = age;}
		public void setVaccine(String vaccine) {this.vaccine = vaccine;}
	
	//Getter
	
		public String getName() {return name;}
		public String getGender() {return gender;}
		public int getAge() {return age;}
		public String getVaccine() {return vaccine;}
	
		@Override
		public String toString() {
			return name+ "	" + gender + "	" + age + "	" + vaccine;
		}
	
}
