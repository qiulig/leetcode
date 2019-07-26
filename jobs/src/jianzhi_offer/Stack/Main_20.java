package jianzhi_offer.Stack;

import java.util.Stack;

/**
 *定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */

/**
 * 解题思路：利用辅助栈来存储现有栈的最小值。在入栈和出栈的时候将现有栈和最小值栈进行比较。
 入栈时，若新值比最小值栈的栈顶还小，则将该值同时push到最小值栈；
 出栈时，若现有栈的栈顶和最小值栈栈顶一致，则同时出栈，
 否则，仅仅现有栈pop；通过这一操作，最小值栈的栈顶将永远是现有栈元素中的最下值。
 */
public class Main_20 {

    public class Solution {

        Stack<Integer> data_stack =new Stack<>();
        Stack<Integer> min_stack = new Stack<>();
        public void push(int node) {
            if(min_stack.isEmpty()||min_stack.peek()>=node){
                min_stack.push(node);
            }else {
                min_stack.push(min_stack.peek());
            }
            data_stack.push(node);
        }
        //出栈
        public void pop() {
            if(data_stack.empty()||min_stack.empty())
            {
                return;
            }
            data_stack.pop();
            min_stack.pop();
        }

        public int top() {
            if(!data_stack.isEmpty())
            {
                return data_stack.peek();
            }
            return 0;
        }

        public int min() {
            if(!min_stack.empty())
            {
                return min_stack.peek();
            }
            return 0;
        }
    }
}
