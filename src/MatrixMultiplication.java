import java.util.Scanner;

public class MatrixMultiplication {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main (String[] args ) {
		
		System.out.println("Matrislerde çarpma iþlemi yaparken birinci matrisin	sütun sayýsý ile ikinci matrisin satýr sayýsý eþit olmalýdýr! ");
	
		// Birinci matris için satýr ve sütun sayýlarý alýnýp elemanlar isteniyor.
		System.out.print("Birinci matrisin satýr sayýsýný giriniz:");
		int satirSayisi1 = scan.nextInt();
		System.out.print("Birinci matrisin sütun sayýsýný giriniz:");
		int sutunSayisi1 = scan.nextInt();
		int[][] myArray1 = new int[satirSayisi1][sutunSayisi1];
		myArray1 = createMatrix(sutunSayisi1,satirSayisi1);
		
		// Ýkinci matris için satýr ve sütun sayýlarý alýnýp elemanlar isteniyor.
		System.out.print("Ýkinci matrisin satýr sayýsýný giriniz:");
		int satirSayisi2 = scan.nextInt();
		System.out.print("Ýkinci matrisin sütun sayýsýný giriniz:");
		int sutunSayisi2 = scan.nextInt();
		int[][] myArray2 = new int[satirSayisi2][sutunSayisi2];
		myArray2 = createMatrix(sutunSayisi2,satirSayisi2);
		
		
		printMatrix(multiplcationMatrix(myArray1, myArray2, sutunSayisi1, satirSayisi1, sutunSayisi2, satirSayisi2), sutunSayisi2, satirSayisi1);
		
	}
	public static int[][] multiplcationMatrix(int[][] myArray1,int[][] myArray2, int sutunSayisi1,int satirSayisi1,int sutunSayisi2,int satirSayisi2){
		
		int[][] c = new int[satirSayisi1][sutunSayisi2];
		
		for (int i = 0;i<satirSayisi1 ; i++){
			   for (int j = 0;j<sutunSayisi2 ;j++){
			      for(int k = 0;k<satirSayisi2;k++){
			         c[i][j] = myArray1[i][k]*myArray2[k][j] + c[i][j];
			      }
			   }
			}
		return c;
	}
	
	public static int[][] createMatrix (int sutun, int satir) {
		
		int[][] array = new int[satir][sutun];
		
		for (int i = 0;i<satir;i++) {
			
			for (int j = 0; j<sutun;j++) {
				
				System.out.print(i+". satir "+j+". sutün elemaný:");
				array[i][j]=scan.nextInt();
			}
		}
		
		return array;
	}
	public static void printMatrix (int[][] arr , int sutun, int satir) {
		
		for (int i=0; i<satir;i++) {
			System.out.print("[");
			for (int j =0 ; j<sutun;j++) {
				
				System.out.print(arr[i][j]);
				
				if(j+1!=sutun) {
					System.out.print(" ");
				}
			}
			System.out.println("]");
		}
	}
}
