package vaccination;

import java.util.ArrayList;

public class AllData {
	
	
	//인스턴스 변수
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
	
	public int getPersonalIndex(String name) {
		
		int index = -1;
		
		for (int i=0; i < allData.size(); i++) {
			if (getPersonalName(i).equals(name)) {
				index = i;
			}
		}
		
		return index;
	}
	
	// 특정인의 존재성 확인
	public boolean isThisPersonHere(String name) {
		
		if (getPersonalIndex(name)!=-1) return true;
		else return false;
	}
	
	
	//개별 데이터의 특정 데이터를 반환//
	public String getPersonalName(int index) 
		{return allData.get(index).getName();}
	
	public String getPersonalGender(int index)
		{return allData.get(index).getGender();}
	
	public int getPersonalAge(int index)
		{return allData.get(index).getAge();}
	
	public String getPersonalVaccine(int index)
		{return allData.get(index).getVaccine();}
	
	
	//개별 데이터의 득정 데이터를 수정//
	public void editPersonalName(int index, String editname) {
		PersonalData p = new PersonalData();
		p.setName(editname);
		p.setGender(getPersonalGender(index));
		p.setAge(getPersonalAge(index));
		p.setVaccine(getPersonalVaccine(index));
		
		allData.set(index, p);
		return;
	}
	
	public void editPersonalGender(int index, String editgender) {
		PersonalData p = new PersonalData();
		
		p.setName(getPersonalName(index));
		p.setGender(editgender);
		p.setAge(getPersonalAge(index));
		p.setVaccine(getPersonalVaccine(index));
		
		allData.set(index, p);
		return;
	}
	
	public void editPersonalAge(int index, int editage) {
		PersonalData p = new PersonalData();
		
		p.setName(getPersonalName(index));
		p.setGender(getPersonalGender(index));
		p.setAge(editage);
		p.setVaccine(getPersonalVaccine(index));
		
		allData.set(index, p);
		return;
	}

	public void editPersonalVaccine(int index, String editvaccine) {
		PersonalData p = new PersonalData();
		
		p.setName(getPersonalName(index));
		p.setGender(getPersonalGender(index));
		p.setAge(getPersonalAge(index));
		p.setVaccine(editvaccine);
		
		allData.set(index, p);
		return;
		}
	
	public void editPersonalAll(int index, String name, String input_gender, int age, String input_vaccine) {
		allData.set(index, new PersonalData(name, input_gender, age, input_vaccine));
		return;
	}
	
}


