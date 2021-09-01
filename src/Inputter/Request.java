package Inputter;

interface Request {
	public abstract void request();
}


//Sample
class GuGuDanRequest implements Request {
	
	@Override
	public void request() {
		System.out.println("2이상 9이하의 정수를 입력해주세요.");
	}
	
}