//Use a bucket to record all the entries in the hashmap
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
    List<Integer>[] buckets=new List[nums.length+1];
    HashMap<Integer,Integer> map=new HashMap<>();
    if(nums==null||nums.length==0){
        return null;
    }
    for(int i:nums){
        if(!map.containsKey(i)){
            map.put(i,1);
        }
        else{
            map.put(i,map.get(i)+1);
        }
    }
    
    for(int i:map.keySet()){
        if(buckets[map.get(i)]==null){
            buckets[map.get(i)]=new LinkedList<>();
        }   
        buckets[map.get(i)].add(i);
    }
    List<Integer> res=new LinkedList<>();
    for(int i=nums.length;i>=1&&k!=0;--i){
        if(buckets[i]!=null){
            res.addAll(buckets[i]);
            k-=buckets[i].size();
        }
    }
    return res;
    }
}

// use maxHeap. Put entry into maxHeap so we can always poll a number with largest frequency
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
           
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = 
                         new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }
        
        List<Integer> res = new ArrayList<>();
        while(res.size()<k){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res.add(entry.getKey());
        }
        return res;
    }
}
// use treeMap. Use freqncy as the key so we can get all freqencies in order
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        
        TreeMap<Integer, List<Integer>> freqMap = new TreeMap<>();
        for(int num : map.keySet()){
           int freq = map.get(num);
           if(!freqMap.containsKey(freq)){
               freqMap.put(freq, new LinkedList<>());
           }
           freqMap.get(freq).add(num);
        }
        
        List<Integer> res = new ArrayList<>();
        while(res.size()<k){
            Map.Entry<Integer, List<Integer>> entry = freqMap.pollLastEntry();
            res.addAll(entry.getValue());
        }
        return res;
    }
}