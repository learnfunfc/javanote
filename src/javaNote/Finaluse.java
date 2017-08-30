package javaNote;

// 有三個類別
class A {
	A() {
		System.out.println("A");
	}

}

/*
 * final class B extends A C類別將無法繼承B 所以將上final後將無法被繼承 18行會出錯
 */
class B extends A {
	B() {
		System.out.println("B");
	}

}

class C extends B {
	C() {
		System.out.println("C");
	}

}

public class Finaluse {

	public static void main(String[] args) {
		new C();
	}
}

/*
A
B
C
 */
