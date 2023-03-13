package Array;

/**
 * LeetCode
 * title : Single Number
 * author : baechaeyoon
 * package : Array
 * */

public class singleNumber {

    public static void main(String[] args){
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums){
        int len = nums.length;

        if(len == 1) return nums[0];

        for(int i = 1; i<len; i++){
            nums[i] = nums[i-1]^nums[i];
        }

        return nums[len-1];
    }
}
