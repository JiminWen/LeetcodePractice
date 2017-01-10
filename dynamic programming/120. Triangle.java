public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
    if(triangle==null||triangle.size()==0){
        return 0;
    }    
    int[] sum=new int[triangle.size()];
    sum[0]=triangle.get(0).get(0);
    for(int i=1;i<=triangle.size()-1;++i){
        sum[i] = sum[i-1]+triangle.get(i).get(i);  
        for(int j=i-1;j>=1;j--)  
        {  
            sum[j] = (sum[j]<sum[j-1]?sum[j]:sum[j-1]) + triangle.get(i).get(j);  
        }  
        sum[0] = sum[0]+triangle.get(i).get(0);  
    }
    int min=sum[0];
    for(int i=1;i<=sum.length-1;++i){
        if(sum[i]<min){
            min=sum[i];
        }
    }
    return min;
    }
}

public int minimumTotal(List<List<Integer>> triangle) {  
    if(triangle.size() == 0)  
        return 0;  
    int[] res = new int[triangle.size()];  
    for(int i=0;i<triangle.size();i++)  
    {  
        res[i] = triangle.get(triangle.size()-1).get(i);  
    }  
    for(int i=triangle.size()-2;i>=0;i--)  
    {  
        for(int j=0;j<=i;j++)  
        {  
            res[j] = Math.min(res[j],res[j+1])+triangle.get(i).get(j);   
        }  
    }  
    return res[0];  
}  