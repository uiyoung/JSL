import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("사전에 등록할 단어의 갯수를 입력해주세요 >> ");
		int size = sc.nextInt();

		String[] eng = new String[size];
		String[] kor = new String[size];

		for (int i = 0; i < size; i++) {
			System.out.print((i + 1) + "번째 사전에 입력할 영단어와 뜻을 입력해 주세요(" + (i + 1) + "/" + size + ") >>");
			eng[i] = sc.next();
			kor[i] = sc.next();
		}
		System.out.println(size + "개의 단어가 등록되었습니다.");

		do {
			System.out.println("┌───────Menu────────┐");
			System.out.println("│1. 등록된 단어 확인   │");
			System.out.println("│2. 단어 검색(한글로)│");
			System.out.println("│3. 단어 검색(영어로)│");
			System.out.println("│4. 종료	            │");
			System.out.println("└───────────────────┘");

			System.out.print("선택 >>");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("────────등록된 단어────────");
				System.out.println("영단어 :" + Arrays.toString(eng));
				System.out.println("뜻       :" + Arrays.toString(kor));
			} else if (choice == 2) {
				System.out.print("검색할 영단어를 한글로 입력해 주세요 >> ");
				String word = sc.next();
				int i = 0;
				for (i = 0; i < size; i++) {
					if (word.equals(kor[i])) {
						System.out.println(kor[i]+"→"+eng[i]);
						break;
					}
				}
				if (i == size) {
					System.out.println("등록되지 않은 단어 입니다.");
				}
			} else if (choice == 3) {
				System.out.print("검색할 뜻을 영어로 입력해 주세요 >> ");
				String word = sc.next();
				int i;
				for (i = 0; i < size; i++) {
					if (word.equals(eng[i])) {
						System.out.println(eng[i]+"→"+kor[i]);
						break;
					}
				}
				if (i == size) {
					System.out.println("등록되지 않은 단어 입니다.");
				}
			} else if (choice == 4) {
				System.out.println("exit");
				break;
			} else
				System.out.println("메뉴를 잘못 고르셨습니다.");

		} while (true);

	}

}
