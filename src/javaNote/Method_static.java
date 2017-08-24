package javaNote;
//java的"方法"就是函式 ，靜態的方法不需要使用new出一個新的物件實體，就可以使用

class method1{
	static void m1(){ // 使 用 static宣告m2方法
		System.out.println("this is m1 method");
	}
	
}

class method2{
	void m2(){ // 不使用static宣告方法
		System.out.println("this is m2 method");
	}
}
public class Method_static {

	public static void main(String[] args) {
		method1.m1(); // method1 使用static不需產生物件就可以使用物件的方法
		method2 m3 = new method2(); // 須產生物件後才可以使用方法
		m3.m2();

	}

}
