package cn.it.jindian;
 

/**
 * 
 * 实现一个方法，将字符串中的空格全部替换成“%20”。嘉定该字符串尾部有足够
 * 空间存放新增字符，并且知道字符串的真是长度。
 *
 * 解法：既是将会进行两次扫描。第一次扫描先输出字符串中有多少个空格，
 * 从而算出最终字符串中有多长，第二次扫面才是真正的开始反向编辑字符串，
 * 检测到空格则将把%20复制到下一个位置，若不是空格，就复制原先的字符。
 */
public class _Test_1_04 {
	public void replaceSpaces(char[] cs,int length){
		int spaceCont = 0, newLength, i;
		for(i = 0;i < length;i++){
			if (cs[i] == ' ') {
				spaceCont++;
			}
		}
		newLength = length + spaceCont * 2;
		cs[newLength] = '\0';
		for (i = length - 1;i >= 0; i--) {
			if (cs[i] == ' ') {
				cs[newLength - 1] = '0';
				cs[newLength - 2] = '2';
				cs[newLength - 3] = '%';
				newLength = newLength - 3;				
			}else{
				cs[newLength - 1] = cs[i];
				newLength = newLength - 1;
			}
		}		
	}
}
