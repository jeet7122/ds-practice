package com.db_labs;

import java.util.Arrays;

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

        int sum = d2.sumOfArray(move);
        System.out.println("Sum: " + sum);

        int evenCount = d2.countEvenNumbers(move);
        System.out.println("Even Count: " + evenCount);

        String demo = "dam";
        String reversed = d2.reverseString(demo);
        System.out.println( "Reversed : " + reversed);

        int[] findFirstDup = {1,2,2,3,3,4,5,5,6};
        int firstDup = d2.findFirstDuplicate(findFirstDup);
        System.out.println("First Duplicate: " + firstDup);

        int[] checkSort = {1,5,3,4,5,8};
        boolean isSorted = d2.isArraySorted(checkSort);
        System.out.println("Boolean: " + isSorted);

        String sentence = "We will see if these works or not";
        String longestWord = d2.longestWord(sentence);
        System.out.println("Longest Word: " + longestWord);
    }
}