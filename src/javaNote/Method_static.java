package javaNote;
//java��"��k"�N�O�禡 �A�R�A����k���ݭn�ϥ�new�X�@�ӷs���������A�N�i�H�ϥ�

class method1{
	static void m1(){ // �� �� static�ŧim2��k
		System.out.println("this is m1 method");
	}
	
}

class method2{
	void m2(){ // ���ϥ�static�ŧi��k
		System.out.println("this is m2 method");
	}
}
public class Method_static {

	public static void main(String[] args) {
		method1.m1(); // method1 �ϥ�static���ݲ��ͪ���N�i�H�ϥΪ��󪺤�k
		method2 m3 = new method2(); // �����ͪ����~�i�H�ϥΤ�k
		m3.m2();

	}

}
