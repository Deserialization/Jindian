package cn.it.jindian;

import java.util.Hashtable;
import java.util.LinkedList;

/**
 * 编写代码，移除末排序链表的重复节点
 * 前面第一个时间复杂度是o(n),其中n为链表的节点数目
 * 后面的方法是不借助额外的缓冲区，可以用两个指针来迭代：
 * current迭代访问整个链表，runner用于检查后续的节点是否重复
 * 后面的时间复杂度是o(N^2),但是时间复杂度是o(1).
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
			//移除后续值相同的所有节点
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
