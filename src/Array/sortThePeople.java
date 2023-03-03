package Array;

/**
 * LeetCode
 * title : Sort The People
 * author : baechaeyoon
 * package : Array
 * */

import java.util.Arrays;

public class sortThePeople {
    public static void main(String[] args){
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        System.out.println(Arrays.toString(solution(names,heights)));
    }

    public static String[] solution(String[] names, int[] heights) {
        int n = heights.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; ++i) {
            arr[i] = new int[] {heights[i], i};
        }
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
        String[] ans = new String[n];
        for (int i = 0; i < n; ++i) {
            ans[i] = names[arr[i][1]];
        }
        return ans;
    }
}

