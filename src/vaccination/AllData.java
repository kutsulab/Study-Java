package vaccination;

import java.util.ArrayList;

public class AllData {
	
	private ArrayList<PersonalData> allData = new ArrayList<PersonalData>();
	
	public void addPersonalData(String name, String input_gender, int age, String input_vaccine) {
		PersonalData p = new PersonalData(name, input_gender, age, input_vaccine);
		allData.add(p);
	}
	
	// 전체 데이터에 개별 데이터를 추가//
	public void addPersonalData(PersonalData p) {allData.add(p);}
	
	//전체 데이터를 반환//
	public ArrayList<PersonalData> getAllData() {return allData;}
	
	
	//개별 데이터 1개를 전체 반환//
	public PersonalData getPersonalData(int index) {return allData.get(index);}
	
	
	//개별 데이터의 특정 데이터를 반환//
	
	public int getPersonalIndex(String name) {
		
		int index = -1;
		
		for (int i=0; i < allData.size(); i++) {
			if (getPersonalName(i).equals(name)) {
				index = i;
			}
		}
		
		return index;
	}
	
	
	
	public String getPersonalName(int index) 
		{return allData.get(index).getName();}
	
	public String getPersonalGender(int index)
		{return allData.get(index).getGender();}
	
	public int getPersonalAge(int index)
		{return allData.get(index).getAge();}
	
	public String getPersonalVaccine(int index)
		{return allData.get(index).getVaccine();}
	
	

	
}
