//My poor solution
public class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
    List<String> list=new ArrayList<>();
    if(nums==null||nums.length==0){
        list.add(get(lower,upper));
        return list;
    }
    int low=lower;
    if(nums[0]>lower){
        list.add(get(lower,nums[0]-1));
    }
    low=nums[0];
    for(int i=1;i<=nums.length-1;++i){
        while(i+1<=nums.length-1&&nums[i]-low==1){
            low=nums[i];
            ++i;
        }
        if(nums[i]-low!=1&&nums[i]!=low){
            list.add(get(low+1,nums[i]-1));    
        }
       
        low=nums[i];
    }
    if(nums[nums.length-1]<upper){
        list.add(get(nums[nums.length-1]+1,upper));
    }
    return list;
    }
    private String get(int n1,int n2){
    String str=(n2==n1)?(n2+""):(n1+"->"+n2);
    return str;
    }
}

//sample solution
public List<String> findMissingRanges(int[] a, int lo, int hi) {
  List<String> res = new ArrayList<String>();
  
  // the next number we need to find
  int next = lo;
  
  for (int i = 0; i < a.length; i++) {
    // not within the range yet
    if (a[i] < next) continue;
    
    // continue to find the next one
    if (a[i] == next) {
      next++;
      continue;
    }
    
    // get the missing range string format
    res.add(getRange(next, a[i] - 1));
    
    // now we need to find the next number
    next = a[i] + 1;
  }
  
  // do a final check
  if (next <= hi) res.add(getRange(next, hi));

  return res;
}

String getRange(int n1, int n2) {
  return (n1 == n2) ? String.valueOf(n1) : String.format("%d->%d", n1, n2);
}