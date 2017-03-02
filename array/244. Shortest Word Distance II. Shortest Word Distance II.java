public class WordDistance {
    HashMap<String,List<Integer>> map;
    public WordDistance(String[] words) {
        map=new HashMap<String,List<Integer>>();
        for(int i=0;i<=words.length-1;++i){
            if(!map.containsKey(words[i])){
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(i);
                map.put(words[i],temp);
            }
            else{
                map.get(words[i]).add(i);
            }
        }
    }
    
    public int shortest(String word1, String word2) {
        if(!map.containsKey(word1)||!map.containsKey(word2)) return 0;
        List<Integer> l1=map.get(word1);
        List<Integer> l2=map.get(word2);
        int min=Integer.MAX_VALUE;
        int p1=0,p2=0;
        while(p1<l1.size()&&p2<l2.size()){
            min=Math.min(min,Math.abs(l2.get(p2)-l1.get(p1)));
            if(l1.get(p1)<l2.get(p2)){
                
                p1++;
            }   
            else{
               // min=Math.min(min,l1.get(p1)-l2.get(p2));
                p2++;
            }
        }
        while(p1<l1.size()){
            min=Math.min(min,Math.abs(l1.get(p1)-l2.get(l2.size()-1)));
            p1++;    
        }
        while(p2<l2.size()){
            min=Math.min(min,Math.abs(l1.get(l1.size()-1)-l2.get(p2))  );
            p2++;
        }
        return min;
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(words);
 * int param_1 = obj.shortest(word1,word2);
 */