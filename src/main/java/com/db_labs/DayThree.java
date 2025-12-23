package com.db_labs;

import java.util.*;

public class DayThree {

    public boolean containsDuplicate(int[] arr){
        Set<Integer> unique = new HashSet<>();
        for (int num: arr){
            if (!unique.add(num)){
                return true;
            }
            else {
                unique.add(num);
            }
        }

        return false;
    }

    public boolean isAnagram(String str1, String str2){
        if (str2.length() != str1.length()) return false;
        Map<Character, Integer> str1Map = new HashMap<>();
        Map<Character, Integer> str2Map = new HashMap<>();
        char[] str1CharArray = str1.toLowerCase().toCharArray();
        char[] str2CharArray = str2.toLowerCase().toCharArray();

        int numOfOccurrence = 1;
        for (char s : str1CharArray) {
            if (str1Map.containsKey(s)){
                str1Map.put(s, numOfOccurrence + 1 );
            }
            else {
                str1Map.put(s, numOfOccurrence);
            }
        }
        for (char s : str2CharArray) {
            if (str2Map.containsKey(s)){
                str2Map.put(s, numOfOccurrence + 1 );
            }
            else{
                str2Map.put(s, numOfOccurrence);
            }
        }

        return str1Map.equals(str2Map);
    }

    public char firstRepeatedChar(String str){
        char[] charsArr = str.toLowerCase().toCharArray();
        Set<Character> seen = new HashSet<>();
        for (char c : charsArr) {
            if (!seen.add(c)) {
                return c;
            }
        }
        return 'a';
    }

    public int[] twoSumArr(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            int find = target - arr[i];
            if (map.containsKey(arr[i])){
                return new int[]{map.get(arr[i]), i};
            }
            map.put(find, i);
        }
        return new int[] {-1,-1};
    }

    public int getFirstNonDuplicate(String str){
        char[] charArr = str.toLowerCase().toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : charArr){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for (int i = 0; i < charArr.length; i++) {
            if (map.get(charArr[i]) == 1){
                return i;
            }

        }
        return -1;
    }

    public int removeDuplicated(int[] arr){
        if (arr.length == 0) return 0;
        int write = 1;
        for (int read = 1; read < arr.length; read++){
            if (arr[read] != arr[read - 1]){
                arr[write] = arr[read];
                write++;
            }
        }
        return write;
    }

    public boolean isSubsequence(String s1, String s2){
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()){
            if (s1.charAt(i) == s2.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s1.length();
    }

    public int longestSubString(String str){
        int start = 0;
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
        for (int end = 0; end < str.length(); end++) {
            while (set.contains(str.charAt(end))){
                set.remove(str.charAt(start));
                start++;
            }
            set.add(str.charAt(end));
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }

    public int maxSumArraySum(int[] nums){
        int res = nums[0];
        int currentMax = nums[0];


        // {2, 3, -8, 7, -1, 2, 3};
        /**
         *  iteration 0: res -> 2, currentMax -> 2,
         *  iteration 1: res -> 5, currentMax -> 2 + 3,
         *  iteration 2: res -> 5, currentMax -> 5 > (5 - 8),
         *  iteration 3: res -> 5, currentMax -> 5,
         *  iteration 4: res -> 1
         *  7, currentMax -> 9 + 8,
         */
        for (int i = 1; i < nums.length; i++){
            currentMax = Math.max(currentMax + nums[i], nums[i]);
            res = Math.max(currentMax, res);
        }
        return res;
    }

    public Map<String, List<String>> groupAnagrams(String[] arr){
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s: arr){
            char[] chars = s.toLowerCase().toCharArray();
            Arrays.sort(chars);
            String sorted = String.valueOf(chars);
            map.putIfAbsent(sorted,new ArrayList<>());
            map.get(sorted).add(s);
        }
        return map;
    }

    public int[] moveAllZeros(int[] nums){
        int insertPos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }
        while (insertPos < nums.length){
            nums[insertPos] = 0;
            insertPos++;
        }
        return nums;
    }

    public String longestCommonPrefix(String[] strs){
        if ( strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++){
            while (!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public String mostCommonWord(String paragraph, String[] banned) {
        String cleaned = paragraph.replaceAll("[^a-zA-Z\\s]", " ");
        String[] words = cleaned.toLowerCase().split("\\s+");

        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (!bannedSet.contains(words[i])){
                map.put(words[i], map.getOrDefault(words[i],0) + 1);
            }
        }

        String mostCommon = "";
        int max = 0;
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            if (entry.getValue() > max){
                max = entry.getValue();
                mostCommon = entry.getKey();
            }
        }

        return mostCommon;
    }

    int[] solution(int[] numbers) {
        int[] result = new int[numbers.length - 2];
        int insertPos = 0;

        for (int i = 1; i < numbers.length - 1; i++) {
            int previous = numbers[i - 1];
            int current = numbers[i];
            int next = numbers[i + 1];

            if ((previous < current && current > next) ||
                    (previous > current && current < next)) {
                result[insertPos] = 1;
            } else {
                result[insertPos] = 0;
            }
            insertPos++;
        }
        return result;
    }

}
