//확장된 for문(for each)
public class Ex08 {

	public static void main(String[] args) {
		int[] score = { 88, 97, 53, 62, 92, 68, 82 };
		int max = score[0];

		for (int i : score) {
			if (i > max)
				max = i;
		}
		System.out.println(max);

	}

}
