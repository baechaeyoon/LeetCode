package String;

import java.util.HashMap;

/**
 * LeetCode
 * title : Roman to Integer
 * author : baechaeyoon
 * package : String
 * */

public class romanToInteger {

    public static void main(String[] args){
        String s = "LVIII";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s){

        int answer = 0;

        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        answer += map.get(s.charAt(0));
        for(int i =1; i<s.length(); i++){
            int cur = map.get(s.charAt(i));
            int pre = map.get(s.charAt(i-1));
            if(pre < cur) answer -= pre*2;
            answer += cur;
        }

        return answer;
    }
}
