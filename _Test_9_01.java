package cn.it.jindian;

public class _Test_9_01 {
	public static void merge(int[] a, int[] b, int lastA, int lastB){
		int indexA = lastA - 1;
		int indexB = lastB - 1;
		int indexMerged = lastB + lastA - 1;
		//�ϲ�����a��b,����������������Ԫ�ؿ�ʼ�ϲ���
		while(indexA >= 0 && indexB >= 0){
			//����a����Ԫ�غ�����b��Ԫ�ؽ��бȽ�
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
		//���ǽ�����bʣ���Ԫ�ظ��Ƶ��ʵ���λ��
		while(indexB >= 0){
			a[indexMerged] = a[indexB];
			a[indexMerged]--;
			a[indexB]--;
		}		
	}

}
