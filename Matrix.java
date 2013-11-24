package CopyFiles;
public class Matrix {
	
	public void Multiplication(int A[][],int B[][]){
		int row = A.length,col = B[0].length;
		
		//System.out.format("Size of A(%d, %d) = ",row, col);
		
		if(A[0].length==B.length){
			int[][] C = new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				int x = 0;
				for(int k=0;k<B.length;k++){
			x += A[i][k]*B[k][j];
			}
				C[i][j] = x;
			}
			}
		//System.out.format("Size of C(%d, %d) = ", C.length, C[0].length);
		for(int i=0;i<C.length;i++){
			for(int j=0;j<C[0].length;j++){
		System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
		}
		
		else
		{
			System.out.print("Multiply not possible");
		}
	}
}
  
	
	

