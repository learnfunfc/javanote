package javaNote;

//constructor 
class Car{
	// initialize variable
	private double gas =0;
	private String color ="";
	
	// constructor no argument
	Car(){
		gas = 100;
		color = "white";
	}
	
	Car(int gas, String color){
		this.gas = gas;
		this.color = color;
		
	}
	
	void show(){
		System.out.println("目前油量:"+gas+"\t"+"car color:"+color);
	}
	
	
}

public class obj {

	public static void main(String[] args) {
		Car car1 = new Car(); //use no-argument constructor
		car1.show();
		Car car2 = new Car(80,"Red");//use constructor with arguments
		car2.show();

	}

}
