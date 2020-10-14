class Solution {
    public int islandPerimeter(int[][] grid) {
        int count=0;
        int[][] map = new int[grid.length+2][grid[0].length+2];
        for (int i=1; i<grid.length+1;i++) {
            for (int j=1; j<grid[0].length+1;j++) {
                map[i][j] = grid[i-1][j-1];
            }
        }
        for (int i=1; i<grid.length+1;i++) {
            for (int j=1; j<grid[0].length+1;j++) {
                if (map[i][j] ==1) {
                    count =count+ 4-(map[i+1][j] + map[i-1][j]+map[i][j+1]+map[i][j-1]);
                }
            }
        }
        return count;
    }
}
