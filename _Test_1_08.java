package cn.it.jindian;
 
/**
 * ����ת�ַ��� �ɼ���ǲ���Ϊ�����ַ������Ӵ���
 *
 */
public class _Test_1_08 {
	public boolean isRotate(String s1,String s2){
		int len = s1.length();
		if (len == s2.length() && len > 0) {
			String s1s1 = s1 + s1;
			return isSubstring(s1s1,s2);
		}
		return false;
	}

	private boolean isSubstring(String s1s1, String s2) {
		// TODO Auto-generated method stub
		//s1s1.substring(2,7);		
		return false;
	}

}
