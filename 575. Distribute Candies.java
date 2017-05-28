public class Solution {
    public int distributeCandies(int[] candies) {
    if(candies==null||candies.length==0) return 0;
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int m:candies){
        map.put(m,map.getOrDefault(m,0)+1);
    }
    int num=0;
    for(int m:map.keySet()){
        num+=1;
    }
    return num>candies.length/2?candies.length/2:num;
    }
}

//set method
public class Solution {
    public int distributeCandies(int[] candies) {
    if(candies==null||candies.length==0) return 0;
    HashSet<Integer> set=new HashSet<>();
    for(int m:candies){
        set.add(m);
    }
    return set.size()>candies.length/2?candies.length/2:set.size();
    }
}