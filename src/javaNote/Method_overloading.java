package javaNote;
// ��k�h�� �ۦP����k�W�١A�ھڤ޼ƫ��A�өI�s�۹������禡

class Method_over{
	// ��ƫ��A�޼�
	static void add(int a, int b){
		System.out.println(a+b);
	}
	// �r�ꫬ�A���޼�
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
