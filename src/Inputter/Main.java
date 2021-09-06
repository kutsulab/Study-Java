package Inputter;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Request_int rqi = new Request_sample();
		
		System.out.println("===rqi test===");
		rqi.printRequest();
		System.out.println();
		rqi.print_InputMismatchException();
		System.out.println("intValidInt(3)의 기댓값  true : "+rqi.isValidInt(3));
		System.out.println("intValidInt(10)의 기댓값  false : "+rqi.isValidInt(10));
		rqi.print_IntRangeException();
		
						
		// <문제상황 : int값을 입력하게 하고, 그 int를 반환한다.>
		// 1. 요구사항의 출력
			
		// 2. 값을 입력받는다.
		// 3. 값을 체크하고 각각의 경우에 해당하는 에러 메세지를 출력한다.
		//		3-1. 입력 과정에서 InputMismatchException 인스턴스가 생성될 경우
		//		3-2. 요구사항의 범위에서 벗어난 값을 입력할 경우
		// 4. 에러에 해당되면 다시 1로 돌아가서 작업을 하도록 한다.
		// 5. 정상적으로 입력됐다면 입력 값을 반환한다.
	}
}