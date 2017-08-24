package javaNote;
import java.util.Scanner; // 匯入Scanner類別庫
public class InputMethod {

	public static void main(String[] args) {
		
			String word;
			// new一個 scn物件
			Scanner scn = new Scanner(System.in);
			// nextLine()可以獨入一個含有空白字元的字串
			System.out.print("please intput string:");
			word = scn.nextLine();
			System.out.println(word);
			
			// 同時使用next() nextLine()必須要注意"\n"產生的影響
			//next()讀入一個字串
			System.out.print("please intput string:");
			word = scn.next();
			System.out.println(word);
			
			//讀入一個整數的值 ��
			System.out.print("please intput number:");
			int num = scn.nextInt();
			System.out.println(num);
			
			//讀入一個小數點的值��
			System.out.print("please intput float:");
			float fnum = scn.nextFloat();
			System.out.println(fnum);
			
			//讀入一個boolean的值
			System.out.print("please intput boolean:");
			boolean a = scn.nextBoolean();
			System.out.println(a);

	}

}
