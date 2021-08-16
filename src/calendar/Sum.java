package calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		//입력부 : 두 수를 입력받는다. (예 : 2 10)
		System.out.println("두 수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		String s1 = scanner.next(), s2 = scanner.next();
		int a = Integer.parseInt(s1), b = Integer.parseInt(s2), sum = a+b;

		scanner.close();
		
		//출력부 (입력한 두 수의 합을 구한다.)
		System.out.printf("%d와 %d의 합은 %d입니다.",a,b,sum);
	}
}
