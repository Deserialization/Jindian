package cn.it.jindian;


/**
 * 找出单向链表中倒数第k个节点
 * 递归：会访问整个链表，当链表抵达末端时，该方法会回传一个置为0的计数器，
 * 之后的每次调用都会将这个计数器加1，当计数器等于k时，表示我们访问的是
 * 链表倒数第k个元素。
 * 第二种方法就是时间复杂度是o(n)，空间复杂度是o(1).
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
