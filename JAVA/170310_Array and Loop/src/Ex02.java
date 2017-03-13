import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		String[] japanese = { "学生", "愛", "JAVA", "幸せ", "未来" };
		String[] korean = { "학생", "사랑", "자바", "행복한", "미래" };

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("日本語の単語を入力してください >> ");
			String input = sc.nextLine();
			if (input.equals("exit")) {
				System.out.println("終了");
				break;
			}
			int i;
			for (i = 0; i < japanese.length; i++) {
				if (input.equals(japanese[i])) {
					System.out.println(korean[i]);
					break;
				}
			}
			if (i == japanese.length) {
				System.out.println("そんな単語はありません。");
			}

		}

	}
}
