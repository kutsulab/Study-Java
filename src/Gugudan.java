import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("몇 단부터?");
			int firstdan = sc.nextInt();
			System.out.println("몇 단까지?");
			int finaldan = sc.nextInt();
			
			sc.close();
			
			System.out.println("++++++ 출력 시작 ++++++");
			System.out.println();
			for (int k=firstdan ; k<= finaldan ; k++) {
				System.out.println("======"+k+"단======");
				for (int j=1; j < 10; j++) {
					System.out.println(k+" * "+j+" = "+(k*j));
				}
			}
			System.out.println();
			System.out.println("++++++ 출력 끝 ++++++");
	}
}