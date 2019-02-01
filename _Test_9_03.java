package cn.it.jindian;

public class _Test_9_03 {
	//二分递归查找某个数
	public int search(int a[], int left, int right, int x){
		int mid = (left + right) >> 1;
		if(x < a[left] || x > a[right]){
			return -1;
		}
		if(x < a[mid]){
			return search(a, left, mid - 1, x);
		}else if(x > a[mid]){
			return search(a, mid + 1, right, x);
		}else{
			return a[mid];
		}
			
	}
	public int search(int a[], int left, int right, int x){
		left = 0;
		right = a.length - 1;
		if(x < a[left] || x > a[right]){
			return -1;
		}
		while(left <= right){
			int mid = (left + right) >> 1;
			if(mid == a[mid]){
				return a[mid];
			}else if(x < a[mid]){
				right = mid - 1;
			}else{
				left = mid + 1;
			}
		}
		return -1;
	}

}
