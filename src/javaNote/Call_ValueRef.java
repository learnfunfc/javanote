package javaNote;
//��k�i�H�z�L�ǭȩI�s�M�ѦҩI�s�Ӷǻ�

//Person ���O�����@���R�A��k�i�H�ǤJ�@��num�ƭ� �ǭȩI�s
//�㦳�^�ǭȾ�ƫ��A
class Person{
	int weight, hegiht;
	static int say(int num){
		System.out.println(num);
		return num*10;
	}
}

//�]�wweight height�����O �ѦҩI�s
class Set{
	void setting(Person p){
		p.weight = 50;
		p.hegiht = 165;
	}
}
public class Call_ValueRef {

	public static void main(String[] args) {
		// call by value
				int num3 = Person.say(2);
				// call by Reference
				Person jack =new Person();
				Set set1 = new Set();
				set1.setting(jack);
				System.out.println(jack.hegiht+" "+jack.weight);
				System.out.println("�^�ǭ�"+num3);

	}

}
