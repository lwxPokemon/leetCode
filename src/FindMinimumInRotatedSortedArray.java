public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        /*
        寻找旋转排序数组中的最小值
         */
        int low = 0 ; int high = nums.length - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(nums[mid] > nums[high]){
                low = mid + 1;
            }else if(nums[mid] == nums[high]){
                high = high - 1;
            }else{
                high = mid - 1;
            }
        }
        return nums[low];
    }
}
