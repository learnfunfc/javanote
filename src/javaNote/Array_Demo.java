package javaNote;

public class Array_Demo {

	public static void main(String[] args) {
		// �}�C���ŧi�y�k
				// ��k�@
				int num[ ] = new int[5];
				num[0] =12;
				num[1] =13;
				num[2] =14;
				num[3] =15;
				num[4] =16;
				//��k�G
				int num2[] = new int[ ]{12,13,14,15,16};
				// �I�s�}�C������
				for (int i=0; i<5; i++){
					System.out.print(num[i]+" ");
				}
				
				// ���N ����python for i in listobject
				for (int i : num2){ 
					System.out.print(i+" ");
				}
				
				// �G���}�C�ŧi ��ػy�k
				int [ ][ ] twoD={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
				int twoD2[ ][ ] = new int[][] 
							{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
				for (int i=0;i<3;i++){ // �_��print out values of 2D array 
					for(int j=0;j<4; j++){
						System.out.print(twoD[i][j]+" ");
					}
					System.out.print("\n");
				}
				
				// array size�i���ܼƨӧ��ܤj�p
						int size = 3;
						int n=0;
						int changeArray[]= new int [size];
						for(int k=0; k<size;k++){
							changeArray[k] = n;
							n++;
				}
			}

	}


