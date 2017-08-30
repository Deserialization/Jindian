package cn.it.jindian;


/**
 * ����ֵxΪ��׼������ָ�������֣� ����С��x�Ľڵ����ڴ��ڻ��ߵ���x�Ľڵ�֮ǰ
 *ֱ�Ӵ�����������һ��������С��x��Զʤ�ڣ���һ�������Ŵ��ڻ����ǵ���x��Ԫ��
 */
public class _Test_2_04 {
	//������������׽ڵ㣬�Լ���Ϊ����ķָ�
	public LinkedListNode partition(LinkedListNode node, int x) {
		LinkedListNode beforeStart = null;
		LinkedListNode beforeEnd = null;
		LinkedListNode afterStart = null;
		LinkedListNode afterEnd = null;
		//�ָ�����
		while (node != null) {
			LinkedListNode next = node.next;
			node.next = null;
			if (node.value < x) {
				//���������before����
				if (beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.next = node;
					beforeEnd = node;
				}
			} else {
				//���������after����
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
		//�ϲ�����
		beforeEnd.next = afterStart;
		return beforeStart;
	}
}
