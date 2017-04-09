public class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
    if(word==null||abbr==null) return false;
    StringBuilder sb=new StringBuilder();
    int j=0,i=0;
    while(i<abbr.length()&&j<word.length()){
        if(!Character.isDigit(abbr.charAt(i))){
            if(abbr.charAt(i)!=word.charAt(j)) return false;
            sb.append(abbr.charAt(i));
            j++;
            i++;
        } 
        else{
            int num=0;
            if(abbr.charAt(i)=='0') return false;
            while(i<abbr.length()&&Character.isDigit(abbr.charAt(i))){
                num=10*num+abbr.charAt(i)-'0';
                i++;
            }
            if(j+num-1>=word.length()) return false;
            sb.append(word.substring(j,j+num));
            j=j+num;
        }
    }
    if(i!=abbr.length()) return false;
    return sb.toString().equals(word);
    }
}