import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수는 몇명입니까? >>");
		int[][] score = new int[sc.nextInt()][3];
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				/*System.out.print((i + 1) + "번째 학생의" + (j + 1) + " 번째 점수는 >>");
				score[i][j] = sc.nextInt();*/
				
				System.out.print((i + 1) + "번째 학생의 국어 점수는 >>");
				score[i][0] = sc.nextInt();
				System.out.print((i + 1) + "번째 학생의 영어 점수는 >>");
				score[i][1] = sc.nextInt();
				System.out.print((i + 1) + "번째 학생의 수학 점수는 >>");
				score[i][2] = sc.nextInt();
				break;
			}
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
		}
		System.out.println();
		System.out.printf("%3s %3s %3s %3s %3s %3s %n", "번호", "국어", "영어", "수학", "총점", "평균");
		System.out.println("──────────────────────────────");
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			System.out.printf("%2d", i + 1);
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%5d", score[i][j]);
				sum += score[i][j];
			}
			System.out.printf("%5d %5.1f", sum, (float) (sum / score[i].length));
			System.out.println();
		}
		System.out.printf("총점 : %2d %3d %4d%n", korTotal, engTotal, mathTotal);
		System.out.printf("평균 : %2.1f %3.1f %4.1f", (float)(korTotal/score.length), (float)(engTotal/score.length), (float)(mathTotal/score.length));
	}

}
