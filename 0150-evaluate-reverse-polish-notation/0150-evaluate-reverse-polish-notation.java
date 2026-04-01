class Solution {
    public int evalRPN(String[] tokens) {
         Stack<Integer> st = new Stack<>();

for(String s : tokens){
    if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
        int first = st.pop();
        int second = st.pop();

        if(s.equals("+")){
            st.push(second + first);
        }
        else if(s.equals("-")){
            st.push(second - first);
        }
       else if(s.equals("*")){
            st.push(second * first);
        }
       else if(s.equals("/")){
            st.push(second / first);
        }
    }
    else{
        Integer num = Integer.parseInt(s);
        st.push(num);
    }
}
         
         return st.peek();
    }
}