public class Solution {
    public int leastBricks(List<List<Integer>> wall) {
    if(wall.size()==0) return 0;
    int max=0;
    HashMap<Integer, Integer> map=new HashMap<>();
    for(int i=0;i<wall.size();++i){
        int sum=0;
        for(int j=0;j<wall.get(i).size()-1;++j){
            sum+=wall.get(i).get(j);
            map.put(sum,map.getOrDefault(sum,0)+1);
            max=Math.max(max,map.get(sum));
        }
    }
    return wall.size()-max;
    }
}