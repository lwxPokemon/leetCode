public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
   /*     int[] arr = new int[2];
        for(int i = 0;i < numbers.length;i++){
            arr[0] = i+1;
            for(int j = i+1;j < numbers.length;j++){
                if(target - numbers[j] == numbers[i]){
                    arr[1] = j+1;
                    return arr;
                }
            }
        }
       return arr;*/

    /*
   两数之和II
     */
        int left=0,right=numbers.length-1;
        int sum;
        while(left<right){
            sum=numbers[left]+numbers[right];
            if(sum<target)
                left++;
            else if(sum>target)
                right--;
            else
            {
                int[] res = {left+1,right+1};
                return res;
            }
        }
        return null;
    }
}
