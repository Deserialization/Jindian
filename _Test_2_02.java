package cn.it.jindian;


/**
 * �ҳ����������е�����k���ڵ�
 * �ݹ飺�������������������ִ�ĩ��ʱ���÷�����ش�һ����Ϊ0�ļ�������
 * ֮���ÿ�ε��ö��Ὣ�����������1��������������kʱ����ʾ���Ƿ��ʵ���
 * ��������k��Ԫ�ء�
 * �ڶ��ַ�������ʱ�临�Ӷ���o(n)���ռ临�Ӷ���o(1).
 * 
 */
public class _Test_2_02 {
/*	public static int nthToLast(LinkedListNode head,int k){
		if (head == null) {
			return 0;
		}
		int i = nthToLast(head.next, k) + 1;
		if (i == k) {
			System.out.println(head.data);
		}
		return i;
	}*/
	
	LinkedListNode nthToLast(LinkedListNode head,int k){
		if (k <= 0) {
			return null;
		}
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		for (int i = 0; i < k - 1; i++) {
			if (p2 == null) {
				return null;				
			}
			p2 = p2.next;
		}
		if (p2 == null) {
			return null;
		}
		while(p2.next != null){
			p1 = p1.next;
			p2 = p2.next;
		}		
		return p1;

	}
}
