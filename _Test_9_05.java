package cn.it.jindian;

/**
 * @author Administrator
 *�и��������ַ������飬����ɢ����һЩ���ַ�������дһ���������ҳ������ַ�����λ�á�
 */
public class _Test_9_05 {

	public int search(String[] strings, String string, int first, int last){
		if (first > last) {
			return -1;
		}
		int mid = (last + first) >> 2;
		if (strings[mid].isEmpty()) {
			int left = mid - 1;
			int right = mid + 1;
			while(true){
				if (left < first && right > last) {
					return -1;					
				}else if (right <= last && !strings[right].isEmpty()) {
					mid = right;
					break;
				}else if (left >= first && !strings[left].isEmpty()) {
					mid = left;
					break;
				}
				right++;
				left--;
			}
		}
				
		if (string.equals(strings[mid])) {
			return mid;
		}else if (strings[mid].compareTo(string) < 0) {
			return search(strings, string, mid + 1, last);
		}else{
			return search(strings, string, first, mid - 1);
		}		
	}
	public int search(String[] strings, String string){
		if (strings == null || string == null || string == " ") {
			return -1;
		}
		return search(strings, string, 0, strings.length - 1);
	}
}



