package cn.it.jindian;
 

/**
 *����ʵ��һ���㷨��ȷ��һ���ַ����������ַ��Ƿ�ȫ����ͬ��
 *��ʹ������ʹ�ö�������ݽṹ��
 *
 *�ⷨ�����ǹ���һ������ֵ�����飬����ֵi��Ӧ�ı��ָʾ���ַ����Ƿ�����ĸ��ʾ
 *��i���ַ���������ַ����ֵڶ��Σ�����������false��
 *������������ʱ�临�Ӷ���o(n)������nΪ�ַ����ĳ��ȣ��ռ临�Ӷ���o(1).
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
