package com.db_labs;

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> storage = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int remaining = target - arr[i];
            if (storage.get(remaining) != null){
                return new int[]{storage.get(remaining), i};
            }
            else {
                storage.put(arr[i], i);
            }
        }

        return new int[]{0,0};
    }
    public String longestCommonPrefix(String[] strs) {
        if ( strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++){
            while (!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() -1);

                if (prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

    public int addNumber(int num){
        int sum = 0;
        while (num > 0){
            sum = num % 10 + sum;
            num = num / 10;
        }
        return sum;
    }

    // 1964/100 = 19.64

    public int returnCentury(int year){
        return ((year + 99)/100);
    }

    public boolean isPalindrome(String str){
        int start = 0;
        int end = str.length() - 1;
        if (str.length() <= 1){
            return true;
        }

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
            System.out.println("Start: " + start + " END: " + end);
            i++;
        }
        return true;
    }

    public int[] removeDuplicates(int[] arr){
        Set<Integer> unique = new LinkedHashSet<>();
        for (int a: arr){
            unique.add(a);
        }

        int[] result = new int[unique.size()];
        int index = 0;
        for (int u: unique){
            result[index++] = u;
        }
        return result;
    }

    public int[] moveZeroes(int[] arr){
        // {1,2,0,4,6}
        int insertPos = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != 0){
                arr[insertPos] = arr[i];
                insertPos++;
            }
        }
        while (insertPos < arr.length){
            arr[insertPos] = 0;
            insertPos++;
        }
        return arr;
    }

    public int highestAdjacentProducts(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int highest = 0;
            int current = arr[i] * arr[i + 1];
            result = Math.max(highest, current);
        }
        return result;
    }
}
