package javaNote;

public class Variable {

	public static void main(String[] args) {
		
			// 變數宣告
			int a=5; // 宣告一個變數名稱為a 為整數型別
			float b=2.33F; //浮點型態數值後面需要加上F
			double c=1.55; //小數點 double型態
			String d="hello java"; 
			char e ='J';
			//boolean value
			boolean f = true; // false
			
			System.out.println("a+b=" + (a+b)); 
			System.out.println(d);
			System.out.println((int)b); //(int)將b浮點強制轉成整數型別
			System.out.println(e+"hello"); // 使用+號來串接字串和數值
			System.out.println(f);
			//格式化輸出
			System.out.printf("a+b=%f",a+b); // 使用printf()函式做格式化輸出 
			
		}
	}


