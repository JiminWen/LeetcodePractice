public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
    if(matrix==null||matrix.length==0||matrix[0].length==0){
        return 0;
    }    
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    for(int i=0;i<matrix.length;++i){
        for(int j=0;j<matrix[0].length;++j){
            pq.offer(matrix[i][j]);
        }
    }
    int temp=0;
    while(k!=0){
        temp=pq.poll();
        k--;
        
    }
    return temp;
    }
}