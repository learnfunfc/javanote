package javaNote;

class Iterarray{
	//以陣列當作引數
	static void iter(int [] array){
		for(int i =0 ;i<array.length ;i++)
			System.out.println(array[i]);
	}
}

public class Array_Call {

	public static void main(String[] args) {
		int array1[] ={1,2,3,4,5};
		Iterarray.iter(array1);

	}

}
