package javaNote;

//public and private variable
class Car{
	private double gas = 0;
	public double speed = 0;
	
	void set_gas(double vol){
		gas= vol;
		
	}
	
	double getgas(){
		return gas;
	}
	
	double showSpeed(){
		return speed;
	}
}
public class objDemo {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.speed = 40; // speed variable is public
		System.out.println("目前速度:"+car1.speed);
		
		//car1.gas = 100; // get error because gas is private
		// build setter and getter method to set and get private gas variable
		car1.set_gas(100);
		System.out.println(car1.getgas());

	}

}