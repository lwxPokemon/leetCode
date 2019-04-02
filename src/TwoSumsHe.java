public class TwoSumsHe {
    public int[] twoSum(int[] nums, int target) {
        /*
        两数之和
         */
        int[] index = new int[2];
        int[] temp = new int[2];
        for(int i = 0; i < nums.length; i++){
            temp[0] = nums[i];
            index[0] = i;
            temp[1] = target - temp[0];
            for(int j = i+1; j <nums.length; j++){
                index[1] = j;
               if(temp[1] == nums[j]){
                   return index;
               }
            }
        }
        return new int[2];
        /*for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }*/
    }
}
