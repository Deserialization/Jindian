package cn.it.jindian;

import java.util.Stack;

/**
 * @author Administrator
 *解法：就是将慢指针指向中间的时候，快指针刚好就走到了末端，然后慢指针压入到栈中，不过出来的时候，和回文序列的后半部分是一样的
 *接下来，我们只需要迭代链表余下的节点，每次迭代就可以判断是不是回文了。
 */
public class _Test_2_07 {
	
    
    public boolean isPalindrome(LinkedListNode pHead) {
    	LinkedListNode slow = pHead;
    	LinkedListNode fast = pHead;
        Stack<Integer> stack = new Stack<Integer>();
        /*
         * 将链表的前半部分元素入栈，当快速指针到达末端的时候，
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
