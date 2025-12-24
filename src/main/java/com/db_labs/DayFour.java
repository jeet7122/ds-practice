package com.db_labs;

import java.util.*;
import java.util.stream.Collectors;

public class DayFour {
    public int returnFirstDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int n : nums) {
            if (unique.contains(n)) {
                return n;
            } else {
                unique.add(n);
            }
        }
        return -1;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (map.containsKey(remaining)) {
                return new int[]{map.get(remaining), i};
            } else {
                map.put(nums[i], i);
            }

        }
        return new int[]{-1, -1};
    }

    public boolean isSubSequence(String s1, String s2) {
        int s1Pos = 0;
        int match = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s1.charAt(s1Pos) == s2.charAt(i)) {
                match = match + 1;
                s1Pos++;
            }
        }
        return match == s1.length();
    }

    public int[] returnProductOfArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        System.out.println("Result after prefix " + Arrays.toString(result));

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            System.out.println("Suffix: " + suffix);
            suffix = suffix * nums[i];
        }
        return result;
    }

    public int strictAsc(int[] arr) {
        if (arr.length == 0 || arr.length == 1) return 0;
        int steps = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                steps = steps + ((arr[i - 1] + 1) - arr[i]);
                arr[i] = (arr[i - 1] + 1);
            }
        }
        return steps;
    }

    public int lengthOfLongestSubstring(String str) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < str.length(); right++) {
            char current = str.charAt(right);

            while (set.contains(current)) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(current);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^/a-zA-Z]\\s", " ").toLowerCase();
        int right = cleaned.length() - 1;
        for (int left = 0; left < cleaned.length(); left++) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            right--;
        }
        return true;
    }

    public int totalStep(int[] arr) {
        if (arr.length == 0 || arr.length == 1) return 0;
        int moves = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                moves += (arr[i - 1] + 1) - arr[i];
                arr[i] = (arr[i - 1] + 1) - arr[i];
            }
        }
        return moves;
    }

    public int longestSub(String str) {
        Set<Character> window = new HashSet<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < str.length(); right++) {
            char current = str.charAt(right);
            while (window.contains(current)) {
                window.remove(str.charAt(left));
                left++;
            }
            window.add(current);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }


    public int AllPossibleSums(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int currentSum = 0;
        int total = 0;
        for (int n : arr) {
            currentSum += n;
            if (map.containsKey(target - currentSum)) {
                total = map.get(target - currentSum);
            }
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        return total;
    }

    public String longestWord(String str) {
        String[] split = str.split(" ");
        int index = 0;
        for (int i = 0; i < split.length; i++) {
            index = Math.max(split[index].length(), split[i].length());
        }
        return split[index];
    }

    public static String longestCommonPrefix(String[] arr) {
        int prefix = arr[0].length() - 1;
        String firstPos = arr[0];
        for (int i = 0; i < arr.length; i++) {
            while (!arr[i].startsWith(firstPos)) {
                firstPos = firstPos.substring(0, prefix - 1);
                prefix--;
            }
        }
        return firstPos;
    }



    public static void main(String[] args) {
        String[] strings = {"Flower", "Flood", "Florida"};
        DayFour d4 = new DayFour();
        String res = d4.longestCommonPrefix(strings);
        System.out.println(res);
    }

}
