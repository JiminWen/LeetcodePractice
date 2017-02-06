public class Solution {
    public boolean isValid(String s) {
    if(s==null||s.length()==0){
        return true;
    }    
    Stack<Character> stack=new Stack<>();
    for(int i=0;i<=s.length()-1;++i){
        if(s.charAt(i)=='('){
            stack.push(')');
        }
        else if(s.charAt(i)=='['){
            stack.push(']');
        }
        else if(s.charAt(i)=='{'){
            stack.push('}');
        }
        else if(stack.isEmpty()||s.charAt(i)!=stack.peek()){
            return false;
        }
        else{
            stack.pop();
        }
    }
    return stack.isEmpty();
    }
}