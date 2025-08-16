package org.interviewproblems;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOccurance {
    public static void main(String[] args) {
        countCharOccurance("autmation");
    }

    public static void countCharOccurance(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(char c: str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
}
