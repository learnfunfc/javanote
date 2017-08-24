package javaNote;
import java.util.Scanner; // ¶×¤JScannerÃþ§O®w
public class InputMethod {

	public static void main(String[] args) {
		
			String word;
			// new¤@­Ó scnª«¥ó
			Scanner scn = new Scanner(System.in);
			// nextLine()¥i¥H¿W¤J¤@­Ó§t¦³ªÅ¥Õ¦r¤¸ªº¦r¦ê
			System.out.print("please intput string:");
			word = scn.nextLine();
			System.out.println(word);
			
			// ¦P®É¨Ï¥Înext() nextLine()¥²¶·­nª`·N"\n"²£¥Íªº¼vÅT
			//next()Åª¤J¤@­Ó¦r¦ê
			System.out.print("please intput string:");
			word = scn.next();
			System.out.println(word);
			
			//Åª¤J¤@­Ó¾ã¼Æªº­È •¸
			System.out.print("please intput number:");
			int num = scn.nextInt();
			System.out.println(num);
			
			//Åª¤J¤@­Ó¤p¼ÆÂIªº­È•¸
			System.out.print("please intput float:");
			float fnum = scn.nextFloat();
			System.out.println(fnum);
			
			//Åª¤J¤@­Óbooleanªº­È
			System.out.print("please intput boolean:");
			boolean a = scn.nextBoolean();
			System.out.println(a);

	}

}
