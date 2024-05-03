package array;

public class MultiDimentionalArray {
    public static void main(String[] args) {
      //int[][] a = {{1,2,3},{4,5,6},{7,8,9}};  
      //int[][] arr1=new int[3][3]{a};
      int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
      
      for(int i = 0; i < arr.length; i++){ // Corrected loop condition
        for(int j = 0; j < arr[i].length; j++){ // Corrected loop condition
          System.out.print(arr[i][j] + ""); 
        } // Removed extra semicolon here
        System.out.println();    
      }
    }
  }