class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
       
        for(char ch : s.toCharArray()){
            if(ch != ']'){
                st.push(ch);
            }
            else{
                StringBuilder sub = new StringBuilder();
                while(!st.isEmpty() && st.peek()!='['){
                    sub.insert(0,st.pop());
                }
                st.pop();
                StringBuilder num = new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    num.insert(0,st.pop());
                }
                int k = Integer.parseInt(num.toString());
                String repeStrt = sub.toString().repeat(k);
                for(char c : repeStrt.toCharArray()){
                    st.push(c);
                }

            }
            
            }
        
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
                res.insert(0,st.pop());
        }
        return res.toString();
        
    }
}