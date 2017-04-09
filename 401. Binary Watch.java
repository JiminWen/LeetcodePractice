public class Solution {
    public List<String> readBinaryWatch(int num) {
    List<String> res=new ArrayList<>();
    for(int i=0;i<12;++i){
        for(int j=0;j<60;++j){
            if(Integer.bitCount(i)+Integer.bitCount(j)==num){
                String second=Integer.toString(j).length()==1?new String("0"+Integer.toString(j)):new String(Integer.toString(j));
                res.add(i+":"+second);
            }
        }
    }
    return res;
    }
    
}