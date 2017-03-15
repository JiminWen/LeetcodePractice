public class Solution {
    public String multiply(String num1, String num2) {
    StringBuilder sb=new StringBuilder();
    if(num1==null&&num2==null) return new String();
    if(num1==null||num2==null) return num1+num2;
    int[] path=new int[num1.length()+num2.length()];
    for(int i=0;i<num1.length();++i){
        for(int j=0;j<num2.length();++j){
        int x=num1.charAt(num1.length()-1-i)-'0';
        int y=num2.charAt(num2.length()-1-j)-'0';
        int sum=x*y+path[i+j];
        path[i+j]=sum%10;
        path[i+j+1]+=sum/10;
        }
    }
    int i=num1.length()+num2.length()-1;
    while(i>=0&&path[i]==0){
        i--;
    }
    while(i>=0){
    sb.append(path[i]);
    i--;
    }
    if(sb.length()==0) return "0";
    return sb.toString();    
    }
}