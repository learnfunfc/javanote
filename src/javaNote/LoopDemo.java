package javaNote;

public class LoopDemo {

	public static void main(String[] args) {
		// for loop
				//sum of 1+..100 
				int total = 0;
				for (int i=1; i<=100;i++){
					total = total + i; // total += i
				}
				
				// while loop
				System.out.println(total);
				int i = 0;
				while (i<=100){
					i++;
					if (i%2==0){
						System.out.print(i+" ");	
					}
				}
				
				
				System.out.print("\n");
				// while infinity loop
				int number = 0;
				while (true){
					if (number>50)	break; // continue 繼續下個迴圈
					number++;
				}
				System.out.print(number);
				
				//do while 至少會做一次 程式碼再檢查while條件
				int k=0;
				do{
					System.out.print(k);
					k++;
				}while (k<0);
	}

}
