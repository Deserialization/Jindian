package cn.it.jindian;


/**
 * 剑指offer上的第13题在o(n)时间删除链表的节点
 * 可以分3步：1、就是要删除的节点不是尾节点；
 * 2.链表中只有一个节点，删除头节点(也是尾节点)
 * 3、链表中有多个节点，删除尾节点，
 */
public class _Test_2_03 {
	public static boolean deteleNode(LinkedListNode n){
		if (n == null || n.next == null) {
			return false;
		}
		LinkedListNode next = n.next;
		n.value =next.value;
		n.next = next.next;
		return true;
	}
	
}
