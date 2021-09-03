package calendar;

public class Calendar {
	
	//멤버변수
	int year, month, day;

	
	//생성자
	Calendar (int year, int month, int day) {
		this.year = year;
		this.month = month;
	}
	
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	
	private static boolean isLeapYear(int year) {

		// 서력 기준 년도가
		// 4의 배수 中
		// 1. 4의 배수 이고 400의 배수이면 윤년
		// 2. 4의 배수 이고 100의 배수이고 400의 배수가 아니면 평년
		// 3. 4의 배수 중 100의 배수가 아니면 윤년

		// 윤년의 조건 : 4의 배수 중 100의 배수 중 400의 배수이거나, 4의 배수 중 100의 배수가 아닌 것

		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	private int getMaxDaysOfMonth(int year, int month) {

		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}
	}

	private int getWeekday(int year, int month, int day) {

		// 기준일 0001-01-01 월요일 (그레고리력 기준)

		int standardyear = 1;
		int standardWeekday = 1;

		int daycount = 0;

		// 기준일 기준 해당 년도 첫날까지의 날짜 경과
		for (int i = standardyear; i < year; i++) {
			int variance = (isLeapYear(i)) ? 366 : 365;
			daycount += variance;
		}

		// 해당 월 첫날 전까지의 날짜 경과
		for (int i = 1; i < month; i++) {
			int variance = getMaxDaysOfMonth(year, i);
			daycount += variance;
		}

		// 해당 날까지의 날짜 경과
		daycount += day - 1;

		return (standardWeekday + (daycount % 7)) % 7;
	}

	
	
	void printCalendar() {
		
		System.out.printf("=======<<%4d년%3d월>>========\n", year, month);
		System.out.printf("%3s %3s %3s %3s %3s %3s %3s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
		System.out.println("----------------------------");

		int maxDays = getMaxDaysOfMonth(year, month);
		int monthFirstweekday = getWeekday(year, month, 1);

		// 공백 입력부
		if (monthFirstweekday >= 1) {
			for (int i = 1; i <= monthFirstweekday; i++) {
				System.out.printf("%3s ", "");
			}
		}

		// 출력부
		for (int i = 1; i <= maxDays; i++) {
			System.out.printf("%3d ", i);

			// 7-monthFirstweekday와 비교하면 안 되는 이유
			// 시작하는 날짜가 일요일이 되버리면
			// monthFirstweekday=0인데, 이 경우 줄 바꾸는 날짜는 7, 14, 21, 28이지만
			// 줄바꿈 날짜%7 = 0이고, 7-monthFirstweekday는 7이 되버림.
			// 따라서 7-monthFirstweekday를 다시 또 7로 나눴을 때의 값과 비교해야 일반화 가능함

			// 날짜를 7로 나눈 나머지가 (7-monthFirstweekday)를 7로 나눈 나머지와 같을 때
			if ((i % 7) == (7 - monthFirstweekday) % 7) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("----------------------------");
	}   
}