package cn.it.jindian;
 
/**
 * ��дһ���㷨����M*N������ĳ��Ԫ��Ϊ0.�������ڵ��к������㣬
 * 
 * �ⷨ������������������ֱ���¼������Ԫ�ص������к��У��ڶ��α��������ʱ��
 * �������л����б��Ϊ�㣬�򽫸�Ԫ����Ϊ��
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
