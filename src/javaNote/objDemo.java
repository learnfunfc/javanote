package javaNote;

class Car{
	private double gas = 0;
	public double speed = 0;
	
	void set_gas(double vol){
		gas= vol;
		
	}
	
	double getgas(){
		return gas;
	}
	
	void showSpeed(){
		System.out.println("目前速度"+speed);
	}
}
public class objDemo {

	public static void main(String[] args) {
		Car car1 = new car();
		car1.speed = 40;
		System.out.println("目前速度:"+car.speed);

	}

}
