package cn.it.jindian;

public class _Test_2_05 {
	LinkedListNode addLists(LinkedListNode l1,LinkedListNode l2,int carry){
		if (l1 == null && l2 == null && carry == 0) {
			return null;
		}
		LinkedListNode result = new LinkedListNode();
		
		int value = carry;
		if (l1 != null) {
			value += l1.value;			
		}
		if (l2 != null) {
			value += l2.value;			
		}
		result.value = value % 10;//求和结果是各位
		LinkedListNode more = addLists(l1 ==null ? null : l1.next, l2 ==null ? null : l2.next, 
						value >= 10 ? 1 : 0);
		result.setNext(more);
		return result;		
	}

}
