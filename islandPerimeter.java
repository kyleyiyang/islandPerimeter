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
        int[][] arr = {{0,1,0,0},{1,1,1,0}};
        rec(arr);
        System.out.println(count);
     }
     public static void rec(int[][] arr) {
         
         for (int i=0;i<arr.length;i++) {
             for (int j=0; j<arr[i].length;j++) {
                 if (arr[i][j] ==1) {
                     int top,left,right,bottom;
                     if (i==0 && j==0) {
                         top=0;left=0;right=arr[i][j+1];bottom=arr[i+1][j];
                         //count =count+4-(arr[i+1][j]+arr[i][j+1]);
                     } else if (i==0 && j==arr[i].length-1) {
                         top=0;right=0;left=arr[i][j-1];bottom=arr[i+1][j];
                         //count =count+ 4-(arr[i+1][j] +arr[i][j-1]);
                     } else if (i==arr.length-1 && j==0) {
                         left=0;bottom=0;right=arr[i][j+1];top=arr[i-1][j];
                         //count =count+ 4-(arr[i-1][j]+arr[i][j+1]);
                     } else if (i==arr.length-1 && j==arr[i].length-1) {
                         right=0;bottom=0;left=arr[i][j-1];top=arr[i-1][j];
                         //count =count+ 4-(arr[i-1][j]+arr[i][j-1]);
                     } else if (i==0) {
                         top=0;left=arr[i][j-1];bottom=arr[i+1][j];right=arr[i][j+1];
                         //count =count+ 4-(arr[i+1][j] + 0+arr[i][j+1]+arr[i][j-1]);
                     } else if (j==0) {
                         left=0;bottom=arr[i+1][j];right=arr[i][j+1];top=arr[i-1][j];
                         //count =count+ 4-(arr[i+1][j] + arr[i-1][j]+arr[i][j+1]);
                     } else if (i==arr.length-1) {
                         bottom=0;right=arr[i][j+1];top=arr[i-1][j];left=arr[i][j-1];
                         //count =count+ 4-(arr[i-1][j]+arr[i][j+1]+arr[i][j-1]);
                     } else if (j==arr[i].length-1) {
                         right=0;top=arr[i-1][j];left=arr[i][j-1];bottom=arr[i+1][j];
                         //count =count+ 4-(arr[i+1][j] + arr[i-1][j]+arr[i][j-1]);
                     } else {
                         top=arr[i-1][j];left=arr[i][j-1];right=arr[i][j+1];bottom=arr[i+1][j];
                        //count =count+ 4-(arr[i+1][j] + arr[i-1][j]+arr[i][j+1]+arr[i][j-1]);
                     }
                     count =count+ 4-(top + bottom+left+right);
                 }
             }
         }
         //return count;
     }
    /* public static void f(int[][] a) {
         count =count+ 4-(arr[i+1][j] + arr[i-1][j]+arr[i][j+1]+arr[i][j-1]); 
     }*/
}
