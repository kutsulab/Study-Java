import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("몇 단을 입력하시겠습니까?");
			int dan = sc.nextInt();
			
			sc.close();
			
			System.out.println("======"+dan+"단 출력 시작======");
			int n = 1;
			while (n<10) {
				System.out.println(dan+" * "+n+" = "+dan*n);
				n ++;
			}
			System.out.println("======"+dan+"단 출력 끝======");
	}
}