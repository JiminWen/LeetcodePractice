public class Solution {
    public List<List<String>> groupStrings(String[] strings) {
    List<List<String>> list=new ArrayList<List<String>>();
    if(strings==null||strings.length==0){
        return list;
    }
    HashMap<String,List<String>> map=new HashMap<String,List<String>>();
    for(String str:strings){
        int dif=str.charAt(0)-'a';
        String key=new String();
        for(char c:str.toCharArray()){
            c=(char)(c-dif);
            if(c<'a'){
                c+=26;
            }
            key+=c;
        }
        if(!map.containsKey(key)){
            List<String> temp=new ArrayList<>();
            temp.add(str);
            map.put(key,temp);
        }
        else{
            map.get(key).add(str);
        }
    }
    
    for(String key:map.keySet()){
        List<String> out=map.get(key);
        Collections.sort(out);
        list.add(out);
    }
    return list;
    }
}                                   