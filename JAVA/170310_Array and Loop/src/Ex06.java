import java.util.Arrays;

//selection sort renshu2
public class Ex06 {
	public static void main(String[] args) {
		int[] arr = { 8, 3, 5, 2, 1, 9,};

		int min, temp;
		for (int i = 0; i < arr.length - 1; i++) {
			min = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
