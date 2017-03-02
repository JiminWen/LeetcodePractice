public class Solution {
    public String largestNumber(int[] nums) {
    if(nums==null||nums.length==0) return "";
    String[] str=new String[nums.length];
    for(int i=0;i<nums.length;++i){
        str[i]=String.valueOf(nums[i]);    
    }
    Arrays.sort(str,new Comparator<String>(){
        @Override
        public int compare(String s1,String s2){
            return (s2+s1).compareTo(s1+s2);
        }
    }
    );
    if(str[0].charAt(0)=='0') return "0";
    StringBuilder sb=new StringBuilder();
    for(String m:str){
        sb.append(m);
    }
    return sb.toString();
    }
}