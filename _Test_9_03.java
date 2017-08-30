package cn.it.jindian;

public class _Test_9_03 {

	public int search(int a[], int left, int right, int x){
		int mid = (left + right) >> 2;
		if (x == a[mid]) {
			return mid;
		}
		if (left > right) {
			return -1;			
		}
		if (a[left] < a[right]) {
			//ǰ����������������������Ұ�����
			return ((x >= a[left] && x <= a[mid]) ? search(a, left, mid - 1, x) : search(a, left, mid + 1, x));
		}else if (a[mid] < a[left]) {
			//ǰ�������Ұ������������������
			return ((x >= a[left] && x <= a[right]) ? search(a, mid + 1, right, x) : search(a, left, mid - 1, x));
		}else if (a[left] == a[mid]) {//��ʾ�Ķ����ظ���Ԫ��
			//�����ʾ�����ұ�Ԫ�ز�ͬ��
			if (a[mid] != a[right]) {
				return search(a, mid + 1, right, x);//�����ұ�				
			}else{
				int result = search(a, left, mid - 1, x);
				return result == -1 ? search(a, mid + 1, right, x) :result;
			}
		}
		return -1;
	}

}



