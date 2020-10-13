/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static int count=0;
     public static void main(String []args){
        System.out.println("Hello World");
        int[][] arr = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        rec(arr);
        System.out.println(count);
     }
     public static void rec(int[][] arr) {
         for (int i=0;i<arr.length;i++) {
             for (int j=0; j<arr[i].length;j++) {
                 if (arr[i][j] ==1) {
                     if (i==0 && j==0) {
                         count =count+4-(arr[i+1][j]+arr[i][j+1]);
                     } else if (i==0 && j==arr[i].length-1) {
                         count =count+ 4-(arr[i+1][j] +arr[i][j-1]);
                     } else if (i==arr.length-1 && j==0) {
                         count =count+ 4-(arr[i-1][j]+arr[i][j+1]);
                     } else if (i==arr.length-1 && j==arr[i].length-1) {
                         count =count+ 4-(arr[i-1][j]+arr[i][j-1]);
                     } else if (i==0) {
                         count =count+ 4-(arr[i+1][j] + 0+arr[i][j+1]+arr[i][j-1]);
                     } else if (j==0) {
                         count =count+ 4-(arr[i+1][j] + arr[i-1][j]+arr[i][j+1]);
                     } else if (i==arr.length-1) {
                         count =count+ 4-(arr[i-1][j]+arr[i][j+1]+arr[i][j-1]);
                     } else if (j==arr[i].length-1) {
                         count =count+ 4-(arr[i+1][j] + arr[i-1][j]+arr[i][j-1]);
                     } else {
                        count =count+ 4-(arr[i+1][j] + arr[i-1][j]+arr[i][j+1]+arr[i][j-1]);
                     }
                 }
             }
         }
         //return count;
     }
}
