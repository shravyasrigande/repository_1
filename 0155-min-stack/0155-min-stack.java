class MinStack {
    Stack<Integer> st = new Stack<>();
    int mi = Integer.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(val<=mi){
            st.push(mi);
            mi=val;
        }st.push(val);
        
    }
    
    public void pop() {
        if(st.pop()==mi){
            mi = st.pop();
        }
        
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return mi;
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