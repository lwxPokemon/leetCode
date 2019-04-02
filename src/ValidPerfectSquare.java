public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        /*int left = 0;
        int right = num < 46340 ? num : 46340;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = mid * mid;

            if (value == num) {
                return true;
            } else if (value < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }


        return false;*/

        /*
        有效的完全平方数
         */
        int left = 0,right = num;
        int mid = left + (right - left)/2;
        while(left <= right){
            mid = left + (right - left)/2;
            if(mid == num*1.0/mid){
                return true;
            }
            else if(mid < num*1.0/mid){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return false;
    }
}
