package javaNote;
// よ猭更 よ猭嘿沮ま计篈ㄓ㊣癸莱ㄧΑ

class Method_over{
	// 俱计篈ま计
	static void add(int a, int b){
		System.out.println(a+b);
	}
	// ﹃篈ま计
	static void add(String a, String b){
		System.out.println(a+b);
	}
	
}
public class Method_overloading {

	public static void main(String[] args) {
		Method_over.add(10, 20);
		Method_over.add("10", "20");
	}

}
