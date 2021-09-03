package Inputter;

interface Request {
	void request();
}

interface Request_Int extends Request {
	void exceptionMessage();
	boolean int_condition(int i);
	void notValidIntMessage();
}

//Sample
class GuGuDanRequest implements Request_Int {

	@Override
	public void request() {
		System.out.println("=================================");
		System.out.println("2 이상 9 이하의 정수를 입력해주세요.");
		System.out.print("> ");
	}
	
	@Override
	public void exceptionMessage() {
		System.out.println("정수가 아닌 값을 입력했습니다. 정수를 다시 입력하세요.");
		return;
	}
	
	@Override
	public boolean int_condition(int i) {
		return i<=9&&i>=2;
	}
	
	@Override
	public void notValidIntMessage() {
		System.out.println("잘못 입력했습니다. 2 이상 9 이하의 정수를 다시 입력해주세요.");
	}
	
}

