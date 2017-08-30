package cn.it.jindian;

import java.util.Hashtable;
import java.util.LinkedList;

/**
 * ��д���룬�Ƴ�ĩ����������ظ��ڵ�
 * ǰ���һ��ʱ�临�Ӷ���o(n),����nΪ����Ľڵ���Ŀ
 * ����ķ����ǲ���������Ļ�����������������ָ����������
 * current����������������runner���ڼ������Ľڵ��Ƿ��ظ�
 * �����ʱ�临�Ӷ���o(N^2),����ʱ�临�Ӷ���o(1).
 */
public class _Test_2_01 {
/*	public static void deleteDups(LinkedListNode n){
		Hashtable hashtable = new Hashtable();
		LinkedListNode previous = null;
		while(n != null){
			if (hashtable.contains(n.value)) {
				previous.next = n.next;
			}else{
				hashtable.put(n.value, true);
				previous = n;
			}
			n = n.next;
		}
	}*/
	
	
	public static void deleteDups(LinkedListNode head){
		if (head == null) {
			return;
		}
		LinkedListNode current = head;
		while(current != null){
			//�Ƴ�����ֵ��ͬ�����нڵ�
			LinkedListNode runner = current;
			while(runner.next != null){
				if (runner.next.value == current.value) {
					runner.next = runner.next.next;
				}else{
					runner = runner.next;					
				}
			}
			current = current.next;
		}
	}
}
