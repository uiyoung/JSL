import java.util.Arrays;
import java.util.Scanner;

//다섯개 입력받아 최대값, 최소값
public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input 5 values >>");

		int[] arr = new int[5];
		int max = 0;
		int min = 100;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];

		}
		System.out.println(Arrays.toString(arr));
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}

}
