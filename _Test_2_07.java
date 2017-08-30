package cn.it.jindian;

import java.util.Stack;

/**
 * @author Administrator
 *�ⷨ�����ǽ���ָ��ָ���м��ʱ�򣬿�ָ��պþ��ߵ���ĩ�ˣ�Ȼ����ָ��ѹ�뵽ջ�У�����������ʱ�򣬺ͻ������еĺ�벿����һ����
 *������������ֻ��Ҫ�����������µĽڵ㣬ÿ�ε����Ϳ����ж��ǲ��ǻ����ˡ�
 */
public class _Test_2_07 {
	
    
    public boolean isPalindrome(LinkedListNode pHead) {
    	LinkedListNode slow = pHead;
    	LinkedListNode fast = pHead;
        Stack<Integer> stack = new Stack<Integer>();
        /*
         * �������ǰ�벿��Ԫ����ջ��������ָ�뵽��ĩ�˵�ʱ��
         * */
        while(fast!=null && fast.next!=null) {
            stack.push(slow.value);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null) {
            slow = slow.next;
        }
        while(slow != null) {
            if(stack.pop() != slow.value) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

}
