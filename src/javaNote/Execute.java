package javaNote;

//constructor 
class Car1{
	// initialize variable
	private double gas =0;
	private String color ="";
	
	// constructor no argument
	Car1(){
		gas = 100;
		color = "white";
	}
	
	Car1(int gas, String color){
		this.gas = gas;
		this.color = color;
		
	}
	
	void show(){
		System.out.println("目前油量:"+gas+"\t"+"car color:"+color);
	}
	
	
}

public class Execute {

	public static void main(String[] args) {
		Car1 car1 = new Car1(); //use no-argument constructor
		car1.show();
		Car1 car2 = new Car1(80,"Red");//use constructor with arguments
		car2.show();

	}

}
