class Tv {
	String color;
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}

public class TvTest {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1のチャネルは" + t1.channel + "です。");
		System.out.println("t2のチャネルは" + t2.channel + "です。");

		t1.channel = 7;
		System.out.println("t1のチャネルを7に変えました。");

		System.out.println("t1のチャンネルは" + t1.channel + "です。");
		System.out.println("t2のチャンネルは" + t2.channel + "です。");
	}
}
