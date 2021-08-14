package gugudan;
import java.util.Scanner;

public class Gugudan {
	
	//전역 변수
	
	public static boolean normalinput = true;
	public static int firstdan, finaldan; // 첫단, 마지막단
	public static int[] dan = new int[9]; // 출력하는 단을 담는 배열

	public static void notice() {
		//입력 안내 메소드//		
		System.out.println("이 프로그램은 시작단, 끝단의 숫자를 입력했을 때 해당 범위 내의 구구단을 출력합니다.");
		System.out.println("시작단, 끝단은 2 이상 9 이하의 정수만을 입력할 수 있으며,");
		System.out.println("끝단의 번호는 시작단보다 큰 정수를 입력할 수 없습니다.");
		System.out.println("시작단과 끝단의 값이 같을 경우 해당 단만 출력합니다.\n");
	}

	public static void input() {
		
		//입력부를 담당하는 메소드
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Q1. 몇 단부터 출력하시겠습니까?");
		firstdan = sc.nextInt();
		System.out.println("입력하신 첫번째 단 : "+firstdan+"\n");
		
		System.out.println("Q2. 몇 단까지 출력하시겠습니까?");	
		finaldan = sc.nextInt();
		System.out.println("입력하신 마지막 단 : "+finaldan+"\n");
		
		sc.close();
	}
	
	public static void error_check(int firstdan, int finaldan) {
		//오류 체크 (한계점 : 입력값으로 int 타입이 아닌 값을 입력했을 경우에 대해서는 처리할 수 없음.)
		if (firstdan<2||firstdan>9) normalinput = false;
		if (finaldan<2||finaldan>9) normalinput = false;
		if (firstdan>finaldan) normalinput = false;
	}
	
	public static void print(boolean normalinput) {
		if (normalinput) {
			System.out.print("==========출력 시작 ==========\n");
			for (int k=firstdan; k<=finaldan; k++) {
				System.out.println("------------"+k+"단------------");
				for (int j=0; j<9; j++) {
					dan[j] = k * (j+1);
					System.out.println(k+" * "+(j+1)+" = "+dan[j]);
				}
			}
			System.out.print("==========출력 끝 =========="+"\n");		
		}
		else {
			System.out.println("====================Error====================");
			System.out.println("시작단, 끝단은 2 이상 9 이하의 정수만을 입력할 수 있으며,");
			System.out.println("끝단의 번호는 시작단보다 큰 정수를 입력할 수 없습니다.");
		}
	}
	
	public static void main(String[] args) {
			notice(); // 안내
			input(); //입력부
			error_check(firstdan, finaldan); 
			print(normalinput); // 출력부
			}
	}