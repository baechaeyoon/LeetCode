package HashTable;

/**
 * LeetCode
 * title : Minimum Common Value
 * author : baechaeyoon
 * package : Hash Table
 * */

public class minimumCommonValue {

    public static void main(String[] args){
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,3};
        System.out.println(getCommon(nums1,nums2));
    }

    public static int getCommon(int[] nums1, int[] nums2){

        int n1 = nums1.length;
        int n2 = nums2.length;

        int i =0;
        int j =0;

        while(i < n1 && j < n2){
            if(nums1[i] == nums2[j]){
                return nums1[i];
            }

            if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }

        return -1;
    }
}
