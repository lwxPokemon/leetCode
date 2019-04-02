public class PeakIndexInAMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        /*
        山脉数组的峰顶索引
         */
       int left = 0,right = A.length-1,mid = 0;
       while(left <= right){
           mid = left + (right - left)/2;
           if(A[mid] > A[mid+1] && A[mid] > A[mid-1]){
               return mid;
           }
           else if(A[mid] < A[mid+1] && A[mid] > A[mid-1]){
               left = mid + 1;
           }
           else if(A[mid] > A[mid+1] && A[mid] < A[mid-1]){
               right = mid - 1;
           }
       }
       return -1;
    }
}
