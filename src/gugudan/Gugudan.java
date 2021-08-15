package gugudan;

public class Gugudan {

	public static void main(String[] args) {

			Notice.introduce(); 
			// 프로그램 소개

			Input.input();
			//시작단, 마지막단, 출력량을 설정하는 입력부. 
		    //조건에서 벗어날 경우 잘못 입력됐다는 메세지를 출력하지만
			//현재 기술 수준으로는 정수가 아닌 문자열에 대해서 예외 처리할 수 없음.
			
			if (Input.normalinput) { 			
				Print p = new Print (Input.firstdan, Input.finaldan, Input.count);
				p.printDan(); //입력값에 따라 값을 출력하는 출력부
			}

		}
	}