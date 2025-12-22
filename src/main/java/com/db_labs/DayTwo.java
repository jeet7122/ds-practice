package com.db_labs;

import java.util.*;

public class DayTwo {
    public int MaxElement(int[] nums){
        int highest = nums[0];
        for (int n: nums){
            int max = Math.max(highest, n);
            highest = max;
        }
        return highest;
    }


    public int sumOfArray(int[] arr){
        return Arrays.stream(arr).sum();
    }

    public int countEvenNumbers(int[] arr){
        int result = 0;
        for (int a: arr){
            if (a % 2 == 0){
                result ++;
            }
        }
        return result;
    }

    public String reverseString(String str){
        char[] splitArr = str.toCharArray();
        int end = splitArr.length - 1;
        for (int i = 0; i < end; i++){
            char temp = splitArr[i];
            System.out.println("Temp" + temp);
            splitArr[i] = splitArr[end];
            System.out.println("Arr at I " + splitArr[i]);
            splitArr[end] = temp;
            System.out.println("Arr at end " + splitArr[end]);
            end--;
        }
        return String.valueOf(splitArr);
    }

    public int findFirstDuplicate(int[] arr){
        Set<Integer> unique = new HashSet<>();
        for (int a : arr){
            if (!unique.add(a)){
                return a;
            }
        }
        return 0;
    }

    public boolean isArraySorted(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            if (!(arr[i] < arr[i + 1])){
                return false;
            }
        }
        return true;
    }

    public String longestWord(String sentence){
        String[] sentenceARR = sentence.split(" ");
        Map<Integer, String[]> map = new HashMap<>();
        for (int i = 0; i < sentenceARR.length - 1; i++) {
            map.put(sentenceARR[i].length(), new String[]{sentenceARR[i]});
        }
        System.out.println(map);
        Integer[] lengths = map.keySet().toArray(new Integer[0]);
        System.out.println(Arrays.toString(lengths));
        int max = lengths[0];
        for (int i = 0; i < lengths.length; i++){
            int comparison = Math.max(max, lengths[i]);
            max = comparison;
        }
        System.out.println("Max: " + max);
        if (map.containsKey(max)){
            return Arrays.toString(map.get(max));
        }
        return null;
    }
}
