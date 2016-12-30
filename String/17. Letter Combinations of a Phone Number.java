public class Solution {
   public List<String> letterCombinations(String digits) {
		    List<String> list=new ArrayList<>();
		    if(digits==null||digits.length()==0){
		        return list;
		    }
		    String[] str={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		    list.add("");
		    for(int i=0;i<=digits.length()-1;++i){
		        int temp=digits.charAt(i)-'0';
		      //  System.out.println(str[temp]);
		        list=combine(str[temp],list);
		        //System.out.println(list);
		    }
		    return list;
		    }
		    private List<String> combine(String str,List<String> list){
		        List<String> res=new ArrayList<>();
		        for(int i=0;i<=str.length()-1;++i){
		            char c=str.charAt(i);
		          //  System.out.println(c);
		            
		            for(String x:list){
		            	//System.out.println(x);
		                res.add(x+c);
		              //  System.out.println(x+c);
		            }
		        }
		        return res;
		    }
}