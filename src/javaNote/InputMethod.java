package javaNote;
import java.util.Scanner; // �פJScanner���O�w
public class InputMethod {

	public static void main(String[] args) {
		
			String word;
			// new�@�� scn����
			Scanner scn = new Scanner(System.in);
			// nextLine()�i�H�W�J�@�ӧt���ťզr�����r��
			System.out.print("please intput string:");
			word = scn.nextLine();
			System.out.println(word);
			
			// �P�ɨϥ�next() nextLine()�����n�`�N"\n"���ͪ��v�T
			//next()Ū�J�@�Ӧr��
			System.out.print("please intput string:");
			word = scn.next();
			System.out.println(word);
			
			//Ū�J�@�Ӿ�ƪ��� ��
			System.out.print("please intput number:");
			int num = scn.nextInt();
			System.out.println(num);
			
			//Ū�J�@�Ӥp���I���ȕ�
			System.out.print("please intput float:");
			float fnum = scn.nextFloat();
			System.out.println(fnum);
			
			//Ū�J�@��boolean����
			System.out.print("please intput boolean:");
			boolean a = scn.nextBoolean();
			System.out.println(a);

	}

}
