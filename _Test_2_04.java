package cn.it.jindian;


/**
 * 给定值x为基准将链表分割成两部分， 所有小于x的节点排在大于或者等于x的节点之前
 *直接创建两个链表：一个链表存放小于x的远胜于，另一个链表存放大于或者是等于x的元素
 */
public class _Test_2_04 {
	//传入的链表手首节点，以及作为链表的分割
	public LinkedListNode partition(LinkedListNode node, int x) {
		LinkedListNode beforeStart = null;
		LinkedListNode beforeEnd = null;
		LinkedListNode afterStart = null;
		LinkedListNode afterEnd = null;
		//分割链表
		while (node != null) {
			LinkedListNode next = node.next;
			node.next = null;
			if (node.value < x) {
				//将链表插入before链表
				if (beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.next = node;
					beforeEnd = node;
				}
			} else {
				//将链表插入after链表
				if (afterStart == null) {
					afterStart = node;
					afterEnd = afterStart;
				} else {
					afterEnd.next = node;
					afterEnd = node;
				}
			}
			node = next;
		}
		if (beforeStart == null) {
			return afterStart;
		}
		//合并链表
		beforeEnd.next = afterStart;
		return beforeStart;
	}
}
