package cn.it.jindian;

public class _Test_2_06 {
	LinkedListNode findBegin(LinkedListNode pHead){
		LinkedListNode fast = pHead;
		LinkedListNode slow = pHead;
		//�ҳ���ײ���������������loop-k����λ��
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}			
		}
		//���ӳ���Ľ�׳�ԣ������飬ûӴ��ײ����Ҳ��û�л�·��
		if (fast == null || fast.next == null) {
			return null;
		}
	/*	��slowָ���ײ���fastָ����ײ�������߾��뻷·��ʼ��k��������������ͬ��
		�ٶ��ƶ�����������ײ��һ��*/
		slow = pHead;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		//�������߾�ָ��·����ʼ��
		return fast;
	}

}
