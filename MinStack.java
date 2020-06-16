import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> stackMin;

    /** initialize your data structure here. */
    public MinStack() {
        stack=new Stack<>();
        stackMin=new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(stackMin.isEmpty() || x<=getMin()){
            stackMin.push(x);
        }
    }

    public void pop() {
        int result=stack.pop();
        if(result==getMin()){
            stackMin.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stackMin.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */