package cn.it.jindian;

import java.awt.Container;

/**
 * �����ַ��ظ����ֵĴ�������дһ��ѹ�����ܣ�
 * ���磺aabccccccaa����a2b1c6a2.
 * ��ѹ�����ַ���û�б�̣��򷵻�ԭ�ȵ��ַ�����
 */
public class _Test_1_05 {
	
	//��һ��
/*	public String compressBad(String string){
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
	}*/
	
	String compressBetter(String string){
		int size = countCompression(string);
		if (size >= string.length()) {
			return string;
		}
		StringBuffer myStringBuffer = new StringBuffer();
		char last = string.charAt(0);
		int count = 1;
		for (int i = 1; i < string.length(); i++) {
			if (string.charAt(i) == last) {//�ҵ��ظ����ַ�
				count++;				
			}else{
				//�����ַ�����Ŀ������last�ַ�
				myStringBuffer.append(last);
				myStringBuffer.append(count);
				last = string.charAt(i);
				count = 1;
			}
			
		}
		myStringBuffer.append(last);
		myStringBuffer.append(count);
		return myStringBuffer.toString();
	}

	private int countCompression(String string) {
		// TODO Auto-generated method stub
		if (string == null || string.isEmpty()) {
			return 0;
		}
		char last = string.charAt(0);
		int size = 0;
		int count = 1;
		for (int i = 1; i < string.length(); i++) {
			if (string.charAt(i) == last) {
				count++;				
			}else{
				last = string.charAt(i);
				size += 1 + string.valueOf(count).length();
				count = 1;
			}
		}
		size += 1 + string.valueOf(count).length();
		return size;
	}
	
}
