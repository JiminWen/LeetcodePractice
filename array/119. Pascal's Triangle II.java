public class Solution {
    public List<Integer> getRow(int rowIndex) {
    List<Integer> res=new ArrayList<>();
    if(rowIndex<0){
        return res;
    }
    for(int i=0;i<=rowIndex;++i){
         
        for(int j=i-1;j>=1;--j){
            res.set(j,res.get(j-1)+res.get(j));
            
        }
        res.add(1);
    }
    return res;
    }
}