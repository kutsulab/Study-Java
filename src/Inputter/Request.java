package Inputter;

interface Request {
	void printRequest();
}

interface Request_int extends Request {
	void print_InputMismatchException();
	boolean isValidInt(int input_int);
	void print_IntRangeException();
}

class Request_sample implements Request_int {
	
	@Override
	public void printRequest() {
		System.out.println("2 이상 9 이하의 정수를 입력하라.");
		System.out.print("> ");
		return;
	}

	@Override
	public void print_InputMismatchException() {
		System.out.println("정수가 아닌 값을 입력했습니다. 정수를 다시 입력하세요.");
		return;
	}

	@Override
	public boolean isValidInt(int input_int) {
		return (input_int <= 9) && (input_int >= 2);
	}

	@Override
	public void print_IntRangeException() {
		System.out.println("잘못 입력했습니다. 2 이상 9 이하의 정수를 다시 입력해주세요.");
	}
}
