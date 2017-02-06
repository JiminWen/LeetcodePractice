public class Solution {
    public int islandPerimeter(int[][] grid) {
    int island=0,neighbour=0;
    for(int i=0;i<=grid.length-1;++i){
        for(int j=0;j<=grid[i].length-1;++j){
            if(grid[i][j]==1){
                ++island;
                if(i<grid.length-1&&grid[i+1][j]==1) ++neighbour;
                if(j<grid[i].length-1&&grid[i][j+1]==1) ++neighbour;
            }
        }
    }
    return (4*island-2*neighbour);
    }
}