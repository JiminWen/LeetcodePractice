public class Solution {
    public int calculate(String s) {
    LinkedList<Integer> stack=new LinkedList<>();
    char sign='+';
    int num=0;
    for(int i=0;i<s.length();++i){
        if(Character.isDigit(s.charAt(i))){
            num=10*num+s.charAt(i)-'0';
        }
            if(i==s.length()-1||(!Character.isDigit(s.charAt(i))&&s.charAt(i)!=' ')){
            if(sign=='+'){
                stack.push(+num);    
            }   
             if(sign=='-'){
                stack.push(-num);
            }
             if(sign=='*'){
                stack.push(stack.pop()*num);
            }
             if(sign=='/'){
                stack.push(stack.pop()/num);
            }
            sign=s.charAt(i);
            num=0;
        }
        
    }
    int re = 0;
    while(!stack.isEmpty()){
        re += stack.pop();
    }
    return re;
    }
}