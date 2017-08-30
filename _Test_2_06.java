package cn.it.jindian;

public class _Test_2_06 {
	LinkedListNode findBegin(LinkedListNode pHead){
		LinkedListNode fast = pHead;
		LinkedListNode slow = pHead;
		//找出碰撞处，将处于链表的loop-k步的位置
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}			
		}
		//增加程序的健壮性，错误检查，没哟碰撞处，也即没有环路。
		if (fast == null || fast.next == null) {
			return null;
		}
	/*	将slow指向首部，fast指向碰撞处，两者距离环路起始处k步，若两者以相同的
		速度移动，则必须会碰撞在一起*/
		slow = pHead;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		//至此两者均指向环路的起始处
		return fast;
	}

}
