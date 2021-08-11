import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("몇 단을 입력하시겠습니까?");
			int dan = sc.nextInt();
			
			sc.close();
			
			System.out.println("//////"+dan+"단//////");
			System.out.println();
			int n;
			
			n=1;
			System.out.println(dan+" * "+n+" = "+dan*n);
			n=2;
			System.out.println(dan+" * "+n+" = "+dan*n);
			n=3;
			System.out.println(dan+" * "+n+" = "+dan*n);
			n=4;
			System.out.println(dan+" * "+n+" = "+dan*n);
			n=5;
			System.out.println(dan+" * "+n+" = "+dan*n);
			n=6;
			System.out.println(dan+" * "+n+" = "+dan*n);
			n=7;
			System.out.println(dan+" * "+n+" = "+dan*n);
			n=8;
			System.out.println(dan+" * "+n+" = "+dan*n);
			n=9;
			System.out.println(dan+" * "+n+" = "+dan*n);
			
			System.out.print("//////"+dan+"단 출력 끝//////");
	}
}