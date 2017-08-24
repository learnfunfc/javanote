package javaNote;

public class Compare {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 14;
		//if else if syntax
		if (num1>num2){
			System.out.println("num1 is bigger!");
		}
		else if (num1<num2){
			System.out.println("num2 is bigger!");
		}
		else if (num2 == num1){
			System.out.println("both are the equal!");
		}
		else{
			System.out.println("error!");
		}
		
	// switch case syntax
	switch(num2 % 2){
	case 0:
		System.out.println("is even!");
		break; // have to have break;
	case 1:
		System.out.println("is odd!");
		break;

	}

	}
}
