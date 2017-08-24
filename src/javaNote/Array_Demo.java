package javaNote;

public class Array_Demo {

	public static void main(String[] args) {
		// 陣列的宣告語法
				// 方法一
				int num[ ] = new int[5];
				num[0] =12;
				num[1] =13;
				num[2] =14;
				num[3] =15;
				num[4] =16;
				//方法二
				int num2[] = new int[ ]{12,13,14,15,16};
				// 呼叫陣列中的值
				for (int i=0; i<5; i++){
					System.out.print(num[i]+" ");
				}
				
				// 迭代 類似python for i in listobject
				for (int i : num2){ 
					System.out.print(i+" ");
				}
				
				// 二維陣列宣告 兩種語法
				int [ ][ ] twoD={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
				int twoD2[ ][ ] = new int[][] 
							{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
				for (int i=0;i<3;i++){ // 巢狀print out values of 2D array 
					for(int j=0;j<4; j++){
						System.out.print(twoD[i][j]+" ");
					}
					System.out.print("\n");
				}
				
				// array size可用變數來改變大小
						int size = 3;
						int n=0;
						int changeArray[]= new int [size];
						for(int k=0; k<size;k++){
							changeArray[k] = n;
							n++;
				}
			}

	}


