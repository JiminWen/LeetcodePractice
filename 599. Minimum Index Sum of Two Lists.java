public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
    if(list1==null||list1.length==0||list2==null||list2.length==0){
        return new String[1];
    } 
    ArrayList<String> res=new ArrayList<>();
    int total=Integer.MAX_VALUE;
    HashMap<String,Integer> map=new HashMap<>();
    for(int i=0;i<list1.length;++i){
        map.put(list1[i],i);
    }
    for(int i=0;i<list2.length;++i){
        if(map.containsKey(list2[i])){
            if(total>i+map.get(list2[i])){
                res=new ArrayList<>();
                total=i+map.get(list2[i]);
                res.add(list2[i]);
            }
            else if(total==i+map.get(list2[i])){
                res.add(list2[i]);
            }
        }
    }
    String[] str=new String[res.size()];
    for(int i=0;i<str.length;++i){
        str[i]=res.get(i);
    }
    return str;
    }
}