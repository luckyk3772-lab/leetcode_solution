class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1;
        while (left <= right){
           int mid = left + (right - left)/2;
           int row = mid / n;
           int colm = mid % n;
           if ( matrix[row][colm]==target){
            return true;
           }
           else if (matrix[row][colm] < target){
            left = mid + 1;
          }  else{
                right = mid - 1;
            
           }
        }
        return false;
    }
}