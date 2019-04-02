public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        /*
        删除排序数组中的重复项
         */
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
