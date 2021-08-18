package calendar;

public class Calendar {

	private static final int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static int getMaxDaysOfMonth(int month) {
		return maxDays[month - 1];
	}

	public static void printCalendar(int year, int month) {
		System.out.printf("===<<%4d년%3d월>>====\n", year, month);
		System.out.printf("%s");
		System.out.println("--------------------");

		int maxDays = getMaxDaysOfMonth(month);

		for (int i = 1; i <= maxDays; i++) {
			System.out.printf("%3d", i);

			// 7로 나눈 나머지가 0인 경우(7,14,21,28일) 줄바꿈
			if (i % 7 == 0) {
				System.out.println();

			}

		}
		System.out.println();
	}

}
