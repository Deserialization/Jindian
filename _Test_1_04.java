package cn.it.jindian;
 

/**
 * 
 * ʵ��һ�����������ַ����еĿո�ȫ���滻�ɡ�%20�����ζ����ַ���β�����㹻
 * �ռ��������ַ�������֪���ַ��������ǳ��ȡ�
 *
 * �ⷨ�����ǽ����������ɨ�衣��һ��ɨ��������ַ������ж��ٸ��ո�
 * �Ӷ���������ַ������ж೤���ڶ���ɨ����������Ŀ�ʼ����༭�ַ�����
 * ��⵽�ո��򽫰�%20���Ƶ���һ��λ�ã������ǿո񣬾͸���ԭ�ȵ��ַ���
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
