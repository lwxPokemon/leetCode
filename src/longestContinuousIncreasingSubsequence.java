import java.util.ArrayList;
import java.util.List;

public class longestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        /*
        最长连续递增序列
         */
        if(nums.length == 0)
            return 0;
        int max = 0,count = 1;
        for(int i = 0; i < nums.length; i++){
            if( (i < nums.length-1)&&(nums[i] < nums[i+1]) ){
                count++;
            }
            else{
                count = 1;
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }
}
