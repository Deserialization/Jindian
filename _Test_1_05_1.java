package cn.it.jindian;

import java.awt.Container;

/**
 * �����ַ��ظ����ֵĴ�������дһ��ѹ�����ܣ�
 * ���磺aabccccccaa����a2b1c6a2.
 * ��ѹ�����ַ���û�б�̣��򷵻�ԭ�ȵ��ַ�����
 */
public class _Test_1_05_1 {
	
	//��һ��
	public String compressBad(String string){
		String mystr = "";
		int count = 1;
		char last = string.charAt(0);
		for (int i = 1; i < string.length(); i++) {
			if (string.charAt(i) == last) {
				//�ҵ��ظ��ַ�
				count++;
			}else{
				//�����ַ�����Ŀ������last�ַ���
				mystr += last + "" + count;
				last = string.charAt(i);
				count = 1;
			}
		}		
		return mystr + last + count;
	}
	
	
}
