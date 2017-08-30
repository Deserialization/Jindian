package cn.it.jindian;


import java.util.Arrays;
import java.util.Comparator;

	public class _Test_9_02 implements Comparator<String>{
		public String sortChars(String s){
			char[] content = s.toCharArray();
			//套用标准排序，并修改比较器，这个比较器用来指示两个字符串互变位词。
			Arrays.sort(content);
			return new String(content); 
		}
		@Override
		//两个变位词的比较方法就是数一数每个字符串中各个字符出现的次数，两者相同则返回true。
		//或者就是丢两个字符串进行排序，如果是互为变位词，name排序后两者相同。
		public int compare(String s1, String s2) {
			// TODO Auto-generated method stub
			return sortChars(s1).compareTo(sortChars(s2));
		}
	}

