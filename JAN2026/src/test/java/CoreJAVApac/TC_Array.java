package CoreJAVApac;

public class TC_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = new int[10];
		int a[] = {1,2,3};
		
		int twoD [][] = new int[4][5];

		
		int[] num1 = {1,2,3,4,5};
		System.out.println(num1[3]);
		System.out.println("Length: "+num1.length);
		for(int i =0; i<num1.length; i++) {
			System.out.println(num1[i]);
		}
		
		for(int value : num1) {
			System.out.println("Value: " + value);;
		}
		
		int[] num2 = new int[5];
		num2[0] = 100;
		
		int[][] matrix = {{1,2,3},{4,5,6}};
		System.out.println(matrix[1][2]);
		System.out.println("lenght: " + matrix.length);
	}

}
