package cn.it.jindian;
 
/**
 * @author Administrator
 * ��ת���� 
 * ���ʱ�临�ӶȾ���o(N^2)��Ϊ�κ��㷨����Ҫ��������N^2��Ԫ��
 */
public class _Test_1_06 {
	public void rotate(int[][] matrix,int n){
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; i++) {
				//�洢����
				int offset = i - first;
				int top = matrix[first][i];
				//����
				matrix[first][i] = matrix[last][last - offset];
				//�µ���
				matrix[last - offset][first] = matrix[last][last - offset];
				//�ҵ���
				matrix[last][last - offset] = matrix[i][last];
				//�ϵ���
				matrix[i][last] = top;
			}
		}
	}
}
