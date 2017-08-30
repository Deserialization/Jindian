package cn.it.jindian;

public class _Test_9_01 {
	public static void merge(int[] a, int[] b, int lastA, int lastB){
		int indexA = lastA - 1;
		int indexB = lastB - 1;
		int indexMerged = lastB + lastA - 1;
		//合并数组a和b,从这两个数组的最后元素开始合并。
		while(indexA >= 0 && indexB >= 0){
			//数组a最后的元素和数组b的元素进行比较
			if (a[indexA] > b[indexB]) {
				a[indexMerged] = a[indexA];
				a[indexMerged]--;
				a[indexA]--;
			}else{
				a[indexMerged] = a[indexB];
				a[indexMerged]--;
				a[indexB]--;				
			}
		}
		//就是将数组b剩余的元素复制到适当的位置
		while(indexB >= 0){
			a[indexMerged] = a[indexB];
			a[indexMerged]--;
			a[indexB]--;
		}		
	}

}
