package javaNote;
//方法可以透過傳值呼叫和參考呼叫來傳遞

//Person 類別中有一個靜態方法可以傳入一個num數值 傳值呼叫
//具有回傳值整數型態
class Person{
	int weight, hegiht;
	static int say(int num){
		System.out.println(num);
		return num*10;
	}
}

//設定weight height的類別 參考呼叫
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
				System.out.println("回傳值"+num3);

	}

}
