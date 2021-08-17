package gugudan;

import java.util.Scanner;

public class Input {
	public static int firstdan, finaldan, count;
	public static boolean normalinput = true;
	public static Scanner sc = new Scanner(System.in);
	
	public static void input() {firstdanInput();}
	
	
	public static void firstdanInput() {
		Notice.firstdanNotice();
		firstdan = sc.nextInt();
		System.out.println("입력하신 값 : "+firstdan);
		firstdanCheck();
	}
	
	public static void firstdanCheck() {
		if (firstdan==9) {
			finaldan=firstdan;
			System.out.println("시작단이 9단이므로 마지막단은 시작단과 같은 9단으로 설정됩니다.");
			countInput();
		}
		else {
		if (firstdan <2 || firstdan>9) normalinput = false;
		if (normalinput) finaldanInput();
		else Notice.errorNotice("firstdan_Range");
		}
	}
	
	public static void finaldanInput() {
		Notice.finaldanNotice();
		finaldan = sc.nextInt();
		System.out.println("입력하신 값 : "+finaldan);
		finaldanCheck();
	}
	
	public static void finaldanCheck() {
		if (finaldan <2 || finaldan>9) normalinput = false;
		if (firstdan > finaldan) normalinput = false;
		if (! normalinput) Notice.errorNotice("finaldan_Range");
		else countInput();
	}
	
	
	public static void countInput() {
		Notice.countNotice();
		count = sc.nextInt();
		System.out.println("입력하신 값 : "+count);
		countCheck();
	}
	
	public static void countCheck() {
		if (count < 1) normalinput = false;
		if (! normalinput) Notice.errorNotice("count_Range");
	}
}
