package cn.it.jindian;
 

/**
 *就是实现一个算法，确定一个字符串的所有字符是否全部不同，
 *假使不允许使用额外的数据结构，
 *
 *解法：就是构建一个布尔值的数组，索引值i对应的标记指示该字符串是否含有字母表示
 *第i个字符，若这个字符出现第二次，则立即返回false；
 *其中这个代码的时间复杂度是o(n)，其中n为字符串的长度，空间复杂度是o(1).
 */
public class _Test_1_01 {
	public boolean isUniqueChar(String string){
		if (string.length() > 256) 
			return false;
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < string.length(); i++) {
			int val = string.charAt(i);
			if (char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
}
