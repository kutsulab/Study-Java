import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
			
			boolean normalinput = true; // 이후 입력부에서 잘못 입력한 경우 false로 갱신

			Scanner sc = new Scanner(System.in);
			System.out.println("이 프로그램은 시작단, 끝단의 숫자를 입력했을 때 해당 범위 내의 구구단을 출력합니다.");
			System.out.println("시작단, 끝단은 2 이상 9 이하의 정수만을 입력할 수 있으며,");
			System.out.println("끝단의 번호는 시작단보다 큰 정수를 입력할 수 없습니다.");
			System.out.println("시작단과 끝단의 값이 같을 경우 해당 단만 출력합니다.\n");
			
			
			//입력부//
			System.out.println("Q1. 몇 단부터 출력하시겠습니까?");
			
			int firstdan = sc.nextInt();
			if (firstdan<2||firstdan>9) normalinput = false;
			
			System.out.println("Q2. 몇 단까지 출력하시겠습니까?");
			
			int finaldan = sc.nextInt();
			if (finaldan<2||finaldan>9||firstdan>finaldan) normalinput = false;	
			
			sc.close();	
			
			//출력부
			
			if (normalinput) {
				System.out.print("==========출력 시작 ==========\n");
				
				for (int k=firstdan ; k<= finaldan ; k++) {
					
					System.out.println("------------"+k+"단------------");
					
					for (int j=1; j < 10; j++) {
						System.out.print(k+" * "+j+" = "+(k*j)+"\n");
						}
				}
					
				System.out.print("==========출력 끝 =========="+"\n");
			}
			
			// 예외 처리 (한계점 : 입력값으로 int 타입이 아닌 값을 입력했을 경우에 대해서는 처리할 수 없음.)
			
			else {
				System.out.println("====================Error====================");
				System.out.println("시작단, 끝단은 2 이상 9 이하의 정수만을 입력할 수 있으며,");
				System.out.println("끝단의 번호는 시작단보다 큰 정수를 입력할 수 없습니다.");
			}

	}
}