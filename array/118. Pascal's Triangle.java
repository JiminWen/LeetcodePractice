public class Solution {
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    if(numRows<1){
        return res;
    }
    ArrayList<Integer> temp=new ArrayList<Integer>();
    temp.add(1);
    res.add(temp);
    for(int i=1;i<numRows;++i){
        temp=new ArrayList<Integer>();
        temp.add(1);
        for(int j=1;j<=i-1;++j){
        int t=res.get(i-1).get(j-1)+res.get(i-1).get(j);
        temp.add(t);
        }
        temp.add(1);
        res.add(temp);
    }
    return res;
    }
}