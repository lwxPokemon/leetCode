public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
      /*  for(int i = 0; i < nums.length;i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;*/


      /*
      搜索插入位置
       */
        int first = 0;
        int last = nums.length - 1;
        int mid = 0;

        while (first < last) {
            mid = (first + last) / 2;
            if (nums[mid] < target) {
                first = mid + 1;
            } else if (nums[mid] > target) {
                last = mid - 1;
            } else {
                return mid;
            }
        }

        if (nums[first] < target)
            return (first + 1);
        else
            return first;
    }
}
