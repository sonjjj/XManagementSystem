public class Matrix {

	public static void main(String[] args) {
		int[][] matrix1 = {{1, 0, 2}, {-1, 3, 1}};
		int[][] matrix2 = {{3, 1}, {2, 1}, {1, 0}};
		int[][] result = new int[2][2];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				for(int k = 0; k < 3; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(result[i][j] + " ");
			}
		System.out.println();
		
		}

	}

}
