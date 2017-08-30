package javaNote;
// 多型 使用父類別的型態來操作子類別的行為
abstract class Animal3{
	abstract void bark();
}

class Catt extends Animal3{
	void bark(){
		System.out.println("miamia");
	}
}

class Dogg extends Animal3{
	void bark(){
		System.out.println("wawa");
	}
}

class Lion extends Animal3{
	void bark(){
		System.out.println("hoho");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		//宣告 animal3型態 的 a陣列 用來儲存子類別物件
		Animal3 a[] ={new Dogg(), new Catt(), new Lion()};
		
		for (int i=0; i<3; i++){
			a[i].bark();
		}
	}

}
