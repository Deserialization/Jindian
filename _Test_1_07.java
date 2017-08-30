package cn.it.jindian;
 
/**
 * 编写一个算法，若M*N矩阵中某个元素为0.则将其所在的行和列清零，
 * 
 * 解法：就是这里两个数组分贝记录包含零元素的所有行和列，第二次遍历矩阵的时候，
 * 若所有行或者列标记为零，则将该元素清为零
 *
 */
public class _Test_1_07 {
	public void setZeros(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (row[i] || column[j]) {
					matrix[i][j] = 0;
				}
			}
		}
		
	}

}
