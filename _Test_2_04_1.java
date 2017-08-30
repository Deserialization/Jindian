package cn.it.jindian;


/**
 * 给定值x为基准将链表分割成两部分， 所有小于x的节点排在大于或者等于x的节点之前
 *直接创建两个链表：一个链表存放小于x的远胜于，另一个链表存放大于或者是等于x的元素
 */
public class _Test_2_04_1 {
	//传入的链表手首节点，以及作为链表的分割
	public LinkedListNode partition(LinkedListNode node, int x) {
		LinkedListNode beforeStart = null;
		LinkedListNode afterStart = null;
		while(node != null){
			LinkedListNode next = node.next;
			if (node.value < x) {
				node.next = beforeStart;
				beforeStart = node;
			}else{
				node.next = afterStart;
				afterStart = node;
			}
			node = next;
		}
		if (beforeStart == null) {
			return afterStart;
		}
		LinkedListNode head = beforeStart;
		while(beforeStart.next != null){
			beforeStart = beforeStart.next;
		}
		beforeStart.next = afterStart;
		return head;
	}
}
