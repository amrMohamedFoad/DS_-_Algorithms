 /*
	If it's square Matrix then it can be done constant O(1) Space Complexity.
	otherwise in SC : O(m * n) where m and n are number of rows and columns of given Matrix.
	
	To swap upper half of the main diagonal of matrix with the lower half.
	
	We have to traverse only in upper half.
	
	More precisely, if a cell present at (i, j) in upper half of the main diagonal 
	then we can get its corresponding lower half cell at (j, i).
	
	So our main focus should be traversing to upper half of the main diagonal.
	
	While traversing upper half : swap(matrix[i][j], matrix[j][i])
  
  if it is non square matrix transposing it by
  1- create new matrix its size will be mXn if orginal one in nXm
  2- change rows into cols
  
  1 2 3
  4 5 6
  
  will be
  
   1 4
   2 5
   3 6
*/

public int[][] transpose(int[][] A) {
    //Square Matrix
		if (A.length == A[0].length) {
				transpose_square_matrix(A);
				return A;
		}        
    
		int[][] B = new int[A[0].length][A.length];
		for (int i=0; i<A.length ; i++) {
				for (int j=0; j<A[0].length ; j++) {
						B[j][i] = A[i][j];
				}
		}        
		return B;
}

private void transpose_square_matrix(int[][] A) {
		int col = 0;
		for (int i = 0; i<A.length ; i++) {
				for (int j = col ; j < A[0].length ; j++) {
						int temp = A[i][j];
						A[i][j] = A[j][i];
						A[j][i] = temp;
			}
				col++;
	}
}
