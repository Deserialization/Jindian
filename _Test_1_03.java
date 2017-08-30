package cn.it.jindian;

import java.util.Arrays;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;


/**
 * ���������ַ��������д����ȷ������һ���ַ������ַ�����
 * ���к��ܷ�������һ���ַ�����
 *�������ַ�����Ϊ��λ�ʣ���ô���Ǿ�ӵ��ͬһ���ַ���ֻ������˳��ͬ��
 */
public class _Test_1_03 {
	//��һ
/*	
 * public String sort(String s){
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	public boolean permutation(String s,String t){
		if (s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}*/
	//������
	public boolean permutation(String s, String t){
		if(s.length() != t.length()){
			return false;
		}
		
		int[] letters = new int[256];//��������
		char[] s_array = s.toCharArray();
		for (char c : s_array) {
			letters[c]++;
		}
		for (int i = 0; i < t.length(); i++) {
			int c = t.charAt(i);
			if (--letters[c] < 0) {
				return false;
			}
		} 		
		return true;
	}	
}
