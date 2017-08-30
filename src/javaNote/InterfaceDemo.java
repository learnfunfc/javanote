package javaNote;

// 介面宣告
interface walking {
	// 如果有資料成員必須要給初始值
	int age = 12;
	public void walk();// 介面裡面的方法一定沒有內容

}

class Personp {
	void eat() {
		System.out.println("恩恩...");
	}
}

// Male類別 繼承Personp 執行 walking 介面
class Male extends Personp implements walking {

	public void eat() {
		System.out.println("好吃...");
	}

	// 一定要覆寫 walking中的 walk()方法
	public void walk() {
		System.out.println("我正在走路");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Male m = new Male();
		System.out.println(walking.age); // 注意  介面.資料成員使用

		m.eat();
		m.walk();

	}

}

/*
12
好吃...
我正在走路
 */
