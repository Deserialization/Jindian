package cn.it.jindian;

import java.util.Stack;


/**
 * @author Administrator
 * ʱ�临�Ӷ���O(N^2) �ռ临�Ӷ���o(N)
 */
public class _Test_2_08 {
	
    public static Stack<Integer> sort(Stack<Integer> s){
    	Stack<Integer> h = new Stack<Integer>();//����ĸ���ջ
    	while(!s.isEmpty()){
    		int temp = s.pop();//��sջ��ջ��Ԫ�ط���һ����ʱ������
    		while(!h.isEmpty() && h.peek() > temp){//�������ջ��ջ��Ԫ�ش���ԭջ��temp.�򵯳����ص�sջ�У�
    			s.push(h.pop());//ֱ��С��temp
    		}
    		h.push(temp);//ѹ�뵽����ջ��
    	}
    	return h;
    }
}
