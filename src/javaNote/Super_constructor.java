package javaNote;
// 多代繼承 使用super使得子類別不會覆蓋父類別屬性和方法
class Grandfather{
	// constructor
	String hair_color;
	String skin;
	
	Grandfather(){
		hair_color = "black";
		skin = "yellow";
	}
}

class father extends Grandfather{
	// constructor
	String hair_color;
	father(){
		hair_color = "brown";
	}
}

class Son extends father{
//	String hair_color;
	// constructor
	Son(){
		super(); // 呼叫父類別的建構式
//		hair_color = "red";
		
	}
}

public class Super_constructor {

	public static void main(String[] args) {
		Son jack = new Son();
		System.out.println(jack.hair_color);
		System.out.println(jack.skin);
	}
}


/*
brown
yellow
 */
