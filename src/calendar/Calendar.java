package calendar;

public class Calendar {
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

	public static int getMaxDaysOfMonth(int year, int month) {

		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}
	}

	public void printCalendar(int year, int month) {
		System.out.printf("=======<<%4d년%3d월>>========\n", year, month);
		System.out.printf("%3s %3s %3s %3s %3s %3s %3s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
		System.out.println("----------------------------");

		int maxDays = getMaxDaysOfMonth(year, month);

		for (int i = 1; i <= maxDays; i++) {
			System.out.printf("%3d ", i);

			// 7로 나눈 나머지가 0인 경우(7,14,21,28일) 줄바꿈
			if (i % 7 == 0) {
				System.out.println();

			}

		}
		System.out.println();
	}

}
