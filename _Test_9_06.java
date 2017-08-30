package cn.it.jindian;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Administrator
 *�и��������ַ������飬����ɢ����һЩ���ַ�������дһ���������ҳ������ַ�����λ�á�
 */
public class _Test_9_06 {


	public static Set<String> generateParens(int remaining){
		Set<String> set = new HashSet<String>();
		if (remaining == 0) {
			set.add("");			
		}
		else{
			Set<String> prev = generateParens(remaining - 1);
			for (String string : prev) {
				for (int i = 0; i < string.length(); i++) {
					if (string.charAt(i) == '(') {
						String string2 = insetInside(string, i);
						set.add(string2);
					}
				}
				if (! set.contains("()" + string)) {
					set.add("()" + string);
				}
			}
		}
		return set;
	}

	private static String insetInside(String string, int leftindex) {
		// TODO Auto-generated method stub
		String left = string.substring(0, leftindex + 1);
		String right = string.substring(leftindex + 1, string.length());
		return left + "()" + right            ;
	}
}



