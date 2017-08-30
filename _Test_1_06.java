package cn.it.jindian;
 
/**
 * @author Administrator
 * 旋转矩阵 
 * 这个时间复杂度就是o(N^2)因为任何算法都需要访问所有N^2的元素
 */
public class _Test_1_06 {
	public void rotate(int[][] matrix,int n){
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; i++) {
				//存储上面
				int offset = i - first;
				int top = matrix[first][i];
				//左到上
				matrix[first][i] = matrix[last][last - offset];
				//下到左
				matrix[last - offset][first] = matrix[last][last - offset];
				//右到下
				matrix[last][last - offset] = matrix[i][last];
				//上到右
				matrix[i][last] = top;
			}
		}
	}
}
