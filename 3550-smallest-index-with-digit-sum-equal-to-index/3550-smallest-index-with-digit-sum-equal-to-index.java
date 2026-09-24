class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i <= nums.length-1;i++){
          if(getdigitsum(nums[i]) == i){
           return i;
        }
    }
    return-1;
}
private int getdigitsum(int num){
    int sum = 0;
    while(num>0){
        sum += num % 10;
        num /= 10;
    }
    return sum;
}
}