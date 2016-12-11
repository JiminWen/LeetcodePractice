public class MinStack {
    LinkedList<Integer> minstack=new LinkedList<>();
    LinkedList<Integer> stack=new LinkedList<>();
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        stack.push(x);
        if(minstack.isEmpty()||x<=minstack.peek()){
            minstack.push(x);
        }
    }
    
    public void pop() {
        if(!minstack.isEmpty()&&stack.peek()==getMin()){
                // if(minstack.getLast()==stack.getLast()){

            minstack.pop();
            
        }
        if(!stack.isEmpty()){
        stack.pop();
        }
    }
    
    public int top() {
        if(!stack.isEmpty()){
        return stack.peek();
        }
        return 0;
    }
    
    public int getMin() {
        if(!minstack.isEmpty()){
        return minstack.peek();
        }
        return 0;
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