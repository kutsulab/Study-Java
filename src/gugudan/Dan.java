																																																																																																																																																																																																																								package gugudan;

public class Dan {
	
	int firstdan;
	private int[][] danlist;
	
	Dan(int firstdan, int finaldan, int size) {
		this.firstdan = firstdan;
		danlist = new int[finaldan-firstdan+1][size];
		
		for (int i=0; i < danlist.length; i++) {
			for (int j=0; j<danlist[i].length; j++) {
				danlist[i][j] = (firstdan+i) * (j+1);
			}
		}
	}
	
	public void printDan() {
		System.out.println("========== 출력 시작 ==========");
		for (int i=0; i < danlist.length; i++) {
			System.out.println("------------"+(firstdan+i)+"단------------");
			for (int j=0; j<danlist[i].length; j++) {
				System.out.printf("%d * %d = %d\n", (firstdan+i), (j+1), danlist[i][j]);
			}
		}
		System.out.print("========== 출력 끝! ==========\n");
	}
	
}