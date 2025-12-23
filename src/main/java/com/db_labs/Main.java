package com.db_labs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DayTwo d2 = new DayTwo();
        int num = 25;
        int[] move = {1,2,3,4,0,6};
//        int[] numsArr = {3, 6, -2, -5, 7, 3};
//        String[] arr = {"Flower", "Flood", "Flow"};
//        TwoSum twoSum = new TwoSum();
//        int result = twoSum.addNumber(num);
//        int year = 1800;
//        int res = twoSum.returnCentury(year);
//        System.out.println("Century: " + res);
//        String check = "a";
//        boolean valid = twoSum.isPalindrome(check);
//        System.out.println("Is Palindrome: " + valid);
//        System.out.println(result);
//        String prefix = twoSum.longestCommonPrefix(arr);
//        System.out.println("Prefix: " + prefix);
//
//        int[] moved = twoSum.moveZeroes(move);
//        System.out.println(Arrays.toString(moved));
//        int highest = twoSum.highestAdjacentProducts(numsArr);
//        int high = d2.MaxElement(move);
//        System.out.println("Highest Element: " + high);
//        System.out.println("Highest: " + highest);
//
//        int sum = d2.sumOfArray(move);
//        System.out.println("Sum: " + sum);
//
//        int evenCount = d2.countEvenNumbers(move);
//        System.out.println("Even Count: " + evenCount);
//
//        String demo = "dam";
//        String reversed = d2.reverseString(demo);
//        System.out.println( "Reversed : " + reversed);
//
//        int[] findFirstDup = {1,2,2,3,3,4,5,5,6};
//        int firstDup = d2.findFirstDuplicate(findFirstDup);
//        System.out.println("First Duplicate: " + firstDup);
//
//        int[] checkSort = {1,5,3,4,8};

//        System.out.println("Contains Duplicate: " + duplicate);
//
//        boolean isSorted = d2.isArraySorted(checkSort);
//        System.out.println("Boolean: " + isSorted);
//
//        String sentence = "We will see if these works or not";
//        String longestWord = d2.longestWord(sentence);
//        System.out.println("Longest Word: " + longestWord);

        DayThree d3 = new DayThree();
        String s1 = "Listen";
        String s2 = "Silent";
        boolean isAnagram = d3.isAnagram(s1, s2);
        System.out.println("Is Anagram: " + isAnagram);
        String s3 = "husshh";
        char firstDuplicate = d3.firstRepeatedChar(s3);
        System.out.println(firstDuplicate);
        int[] arr = {1,3,8,5,9,4,6};
        int target = 10;
        int[] result = d3.twoSumArr(arr, target);
        System.out.println(Arrays.toString(result));

        String[] anagrams = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> group = d3.groupAnagrams(anagrams);
        System.out.println(group);

        String para = "bob hit a ball, the hit ball flew far after it was hit.";
        String [] banned = {"hit"};
        String resultPara = d3.mostCommonWord(para, banned);

        int[] nums = {1, 2, 1, 3, 4};
        int[] resultSet = d3.solution(nums);
        System.out.println(Arrays.toString(resultSet));
    }
}