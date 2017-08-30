package javaNote;

// 建構式執行順序 最上層的父類別開始
class Leve1 {

	Leve1() {
		System.out.println("level1");
	}
}

class Level2 extends Leve1 {

	Level2() {
		System.out.println("level2");
	}
}

class Level3 extends Level2 {

	Level3() {
		System.out.println("level3");
	}
}

public class constructor_run {

	public static void main(String[] args) {
		Level3 l3 = new Level3();
	}

}

// 結果
/*
 * 
 * level1 level2 level3
 * 
 */
