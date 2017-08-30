package javaNote;
// 繼承語法
class Animal{
	
	String eating(){
		return "chacha..";
	}
	
	String walking(){
		return "bombom..";
	}
}	

// Dog 繼承Animal類別 ，所以有walking()方法
class Dog extends Animal{
	// override(覆寫父類別) eating()方法
	String eating(){ 
		return "chuchu";
	}
		
}

public class Animal_extend {

	public static void main(String[] args) {
		Dog small = new Dog();
		System.out.println(small.eating());
		System.out.println(small.walking());
		
	}

}
