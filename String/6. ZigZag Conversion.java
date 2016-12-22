public class Solution {
    public String convert(String s, int numRows) {
    if(s==null||s.length()==0){
        return s;
    }
    StringBuilder[] sb=new StringBuilder[numRows];
    for(int i=0;i<=sb.length-1;++i){
        sb[i]=new StringBuilder();
    }
    int i=0;
    while(i<=s.length()-1){
        for(int row=0;row<=numRows-1&&i<s.length();++row){
            sb[row].append(s.charAt(i++));
        }
        for(int row=numRows-2;row>=1&&i<s.length();--row){
            sb[row].append(s.charAt(i++));
        }
    }
    for(int row=1;row<=numRows-1;++row){
        sb[0].append(sb[row]);
    }
    return sb[0].toString();
    }
    
}