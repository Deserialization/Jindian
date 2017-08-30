package cn.it.jindian;

import java.util.Arrays;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;


/**
 * 给定两个字符串，请编写程序，确定其中一个字符串的字符重新
 * 排列后，能否编程另外一个字符串。
 *若两个字符串互为变位词，那么他们就拥有同一组字符。只不过是顺序不同，
 */
public class _Test_1_03 {
	//法一
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
	//法二：
	public boolean permutation(String s, String t){
		if(s.length() != t.length()){
			return false;
		}
		
		int[] letters = new int[256];//假设条件
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
