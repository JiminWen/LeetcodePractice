public class Solution {
    public String frequencySort(String s) {
    if(s.length()<3){
        return s;
    }
    HashMap<Character,Integer> map=new HashMap<>();
    for(char c:s.toCharArray()){
        if(!map.containsKey(c)){
            map.put(c,1);
        }
        else{
            map.put(c,map.get(c)+1);
        }
    }
    PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
    for(char m:map.keySet()){
        pq.offer(m);
    }
    StringBuilder sb=new StringBuilder();
    while(!pq.isEmpty()){
        char temp=pq.poll();
        int count=map.get(temp);
        for(int i=0;i<=count-1;++i){
            sb.append(temp);
        }
    }
    return sb.toString();
    }
}

//Use bucket
public class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        List<Character> [] bucket = new List[s.length() + 1];
        for (char key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        StringBuilder sb = new StringBuilder();
        for (int pos = bucket.length - 1; pos >=0; pos--) {
            if (bucket[pos] != null) {
                for (char num : bucket[pos]) {
                    for (int i = 0; i < map.get(num); i++) {
                        sb.append(num);
                    }
                }
            }
        }
        return sb.toString();
    }
}