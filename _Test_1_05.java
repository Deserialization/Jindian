package cn.it.jindian;

import java.awt.Container;

/**
 * 利用字符重复出现的次数，编写一个压缩功能，
 * 比如：aabccccccaa会编程a2b1c6a2.
 * 若压缩的字符串没有变短，则返回原先的字符串，
 */
public class _Test_1_05 {
	
	//法一：
/*	public String compressBad(String string){
		String mystr = "";
		int count = 1;
		char last = string.charAt(0);
		for (int i = 1; i < string.length(); i++) {
			if (string.charAt(i) == last) {
				//找到重复字符
				count++;
			}else{
				//插入字符的数目，更新last字符。
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
			if (string.charAt(i) == last) {//找到重复的字符
				count++;				
			}else{
				//插入字符的数目，跟新last字符
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
