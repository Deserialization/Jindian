package cn.it.jindian;


/**
 * ����ֵxΪ��׼������ָ�������֣� ����С��x�Ľڵ����ڴ��ڻ��ߵ���x�Ľڵ�֮ǰ
 *ֱ�Ӵ�����������һ��������С��x��Զʤ�ڣ���һ�������Ŵ��ڻ����ǵ���x��Ԫ��
 */
public class _Test_2_04_1 {
	//������������׽ڵ㣬�Լ���Ϊ����ķָ�
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
