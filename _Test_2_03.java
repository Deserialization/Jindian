package cn.it.jindian;


/**
 * ��ָoffer�ϵĵ�13����o(n)ʱ��ɾ������Ľڵ�
 * ���Է�3����1������Ҫɾ���Ľڵ㲻��β�ڵ㣻
 * 2.������ֻ��һ���ڵ㣬ɾ��ͷ�ڵ�(Ҳ��β�ڵ�)
 * 3���������ж���ڵ㣬ɾ��β�ڵ㣬
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
