package cn.it.jindian;


import java.util.Arrays;
import java.util.Comparator;

	public class _Test_9_02 implements Comparator<String>{
		public String sortChars(String s){
			char[] content = s.toCharArray();
			//���ñ�׼���򣬲��޸ıȽ���������Ƚ�������ָʾ�����ַ�������λ�ʡ�
			Arrays.sort(content);
			return new String(content); 
		}
		@Override
		//������λ�ʵıȽϷ���������һ��ÿ���ַ����и����ַ����ֵĴ�����������ͬ�򷵻�true��
		//���߾��Ƕ������ַ���������������ǻ�Ϊ��λ�ʣ�name�����������ͬ��
		public int compare(String s1, String s2) {
			// TODO Auto-generated method stub
			return sortChars(s1).compareTo(sortChars(s2));
		}
	}

