package gugudan;

public class Print {
	public static int firstdan, finaldan, count;
	public static int[][] dan;
	
	Print (int firstdan, int finaldan, int count) {
		Print.firstdan = firstdan;
		Print.finaldan = finaldan;
		Print.count = count;
		
		dan = new int[finaldan-firstdan+1][count];
		for (int i = 0; i < dan.length; i++) {
			for (int j = 0; j < count; j++) {
				dan[i][j] = (firstdan+i) * (j+1);
				}
			}
	}
	
	void printDan() {
		System.out.println("========== 출력 시작 ==========\n");
		for (int i = 0; i < dan.length; i++) {
			System.out.println("------------"+(firstdan+i)+"단------------");
			for (int j=0; j < count; j++) {
				System.out.println((firstdan+i)+" * "+(j+1)+" = "+dan[i][j]);
				}
			}
		System.out.print("\n========== 출력 끝 ==========\n");
		}
}