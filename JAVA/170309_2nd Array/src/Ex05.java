public class Ex05 {
	public static void main(String[] args) {
		int[][] twoD = new int[4][];
		twoD[0] = new int[4];
		twoD[1] = new int[3];
		twoD[2] = new int[2];
		twoD[3] = new int[1];

		

		int i, j, k = 9;
		for (i = twoD.length-1; i > 0; i--) {
			for (j = twoD[i].length-1; j > 0; j--) {
				twoD[i][j] = k;
				k--;
			}
		}
		for (i = 0; i < twoD.length; i++) {
			for (int val : twoD[i]) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		//System.out.println(twoD[3][1]);
	}
}
