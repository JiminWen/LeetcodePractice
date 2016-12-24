//my slow solution
public class Solution {
    public boolean repeatedSubstringPattern(String str) {
	    if(str==null||str.length()==0){
	        return true;
	    } 
	    String s=null;
	    for(int i=0;2*i<str.length()-1;++i){
	    	
	        if(str.substring(0,i+1).equals(str.substring(str.length()-1-i) )  ){
	        	if(check(str,str.substring(0,i+1))){
	        		return true;
	        	}
	           
	        }
	    }
	    return false;
	    }
	private boolean check(String str,String s){
		if(s==null||str.length()%s.length()!=0){
	        return false;
	    }
	    
	    int temp=str.length()/s.length();
	    for(int i=0;i<=temp-1;i+=s.length()){
	      
	    	if(!str.substring(i,i+s.length()).equals(s)){
	            return false;
	        }
	    }   
	    return true;
	}
    
}

//fast solution
public boolean repeatedSubstringPattern(String str) {
        int len = str.length();
    	for(int i=len/2 ; i>=1 ; i--) {
    		if(len%i == 0) {
    			int m = len/i;
    			String subS = str.substring(0,i);
    			int j;
    			for(j=1;j<m;j++) {
    				if(!subS.equals(str.substring(j*i,i+j*i))) break;
    			}
    			if(j==m)
    			    return true;
    		}
    	}
    	return false;
    }