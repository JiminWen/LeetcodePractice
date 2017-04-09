public class Solution {
    public String simplifyPath(String path) {
    if(path==null||path.charAt(0)!='/') return null;
    String[] sub=path.split("/");    
    LinkedList<String> stack=new LinkedList<>();
    for(String temp:sub){
        if(temp.equals("..")&&!stack.isEmpty()) stack.pop();
        else if(!temp.equals(".")&&!temp.equals("..")&&!temp.equals("")) stack.push(temp);
    }
    if(stack.isEmpty()) return new String("/");

    StringBuilder sb = new StringBuilder();  
         while (!stack.isEmpty()) {  
         sb.insert(0, "/" + stack.pop());  
         }  
    
    return sb.toString();
    }
}