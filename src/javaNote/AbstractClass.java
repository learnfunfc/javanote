package javaNote;
// 抽象的類別不能使用new來產生一個實體

abstract class Animal1 {
	// 抽象方法沒有實作
	abstract void eating();

	// 可以含有實作的方法
	public void barking() {
		System.out.println("wawa....");
	}
}

class Cat extends Animal1 {
	void eating() {
		System.out.println("chwchw....");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		Cat d1 = new Cat();
		d1.barking();
		d1.eating();
	}

}

/*
wawa....
chwchw....
 */
