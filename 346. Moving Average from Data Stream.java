public class MovingAverage {
    int cap;
    Queue<Integer> list;
    double sum;
    int count;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        cap=size;
        list=new LinkedList<Integer>();
        sum=0;
        count=0;
    }
    
    public double next(int val) {
        list.offer(val);
        count++;
        sum+=val;
        if(count>cap){
            count=cap;
            sum-=list.poll();
        }
        return sum/count;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */