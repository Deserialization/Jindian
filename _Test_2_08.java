package cn.it.jindian;

import java.util.Stack;


/**
 * @author Administrator
 * 时间复杂度是O(N^2) 空间复杂度是o(N)
 */
public class _Test_2_08 {
	
    public static Stack<Integer> sort(Stack<Integer> s){
    	Stack<Integer> h = new Stack<Integer>();//申请的辅助栈
    	while(!s.isEmpty()){
    		int temp = s.pop();//把s栈的栈顶元素放入一个临时变量中
    		while(!h.isEmpty() && h.peek() > temp){//如果辅助栈的栈顶元素大于原栈的temp.则弹出弹回到s栈中，
    			s.push(h.pop());//直到小于temp
    		}
    		h.push(temp);//压入到辅助栈中
    	}
    	return h;
    }
}
