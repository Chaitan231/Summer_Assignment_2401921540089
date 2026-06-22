import java.util.Stack;

public class MinStack {
    Stack<Integer> stk,auxStk;
    public MinStack() {
        this.stk=new Stack<>();
        this.auxStk=new Stack<>();
    }
    
    public void push(int val) {
        this.stk.push(val);
        if(auxStk.isEmpty() || val<=auxStk.peek()){
            this.auxStk.push(val);
        }
       
    }
    
    public void pop() {
        if(this.top()==this.getMin()){
            this.auxStk.pop();
        }
        this.stk.pop();
    }
    
    public int top() {
        return this.stk.peek();
    }
    
    public int getMin() {
        return this.auxStk.peek();
       
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
    

