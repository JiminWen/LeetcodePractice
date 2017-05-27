public class Solution {
    public int countComponents(int n, int[][] edges) {
    if(n==0||n==1) return n;
    HashSet<Integer> visited=new HashSet<>();
    int cc=0;
    HashMap<Integer,List<Integer>> map=new HashMap<>();
    for(int i=0;i<n;++i){
        map.put(i,new ArrayList<Integer>());
    }
    for(int[] m:edges){
        map.get(m[0]).add(m[1]);
        map.get(m[1]).add(m[0]);        
    }
    for(int i=0;i<n;++i){
        if(!visited.contains(i)){
            cc++;
            DFS(i,map,visited);
        }    
    }   
    return cc;
    }
    private void DFS(int v, HashMap<Integer,List<Integer>> map, HashSet<Integer> visited){
    for(int j:map.get(v)){
        if(!visited.contains(j)){
            visited.add(j);
            DFS(j,map,visited);
        }
    }
    }
}