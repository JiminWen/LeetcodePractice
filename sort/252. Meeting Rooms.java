/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public boolean canAttendMeetings(Interval[] intervals) {
    if(intervals==null||intervals.length==0){
        return true;
    }    
    PriorityQueue<Interval> pq=new PriorityQueue<>((a,b)->(a.start-b.start));
    for(Interval i:intervals){
        pq.add(i);
    }
    Interval temp=pq.poll();
    while(!pq.isEmpty()){
        Interval cur=pq.poll();
        if(temp.end>cur.start){
            return false;
        }
        temp=cur;
    }
    return true;
    }
}


//Array sort
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public boolean canAttendMeetings(Interval[] intervals) {
    if (intervals == null)
    return false;

  // Sort the intervals by start time
  Arrays.sort(intervals, (a,b)->(a.start-b.start));
  
  for (int i = 1; i < intervals.length; i++)
    if (intervals[i].start < intervals[i - 1].end)
      return false;
  
  return true;
    }
}