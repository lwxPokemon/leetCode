import java.util.*;
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        /*
        两个数组的交集
         */
        Set<Integer> numSet = new TreeSet<>();
        List<Integer> list1 = new ArrayList<>();
        for(int tmp:nums1) {
            list1.add(tmp);
        }
        for(int temp:nums2) {
            if(list1.contains(temp)) {
                numSet.add(temp);
            }
        }
        int[] result = new int[numSet.size()];
        Iterator it = numSet.iterator();
        int i = 0;
        while(it.hasNext()){
            result[i++] = Integer.valueOf(it.next().toString());
        }
        return result;
    }
}
