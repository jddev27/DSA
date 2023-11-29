package Algorithm.Exercises;

import java.util.*;

public class Exercise {

    public static int[] TwoSum(int[] arr, int target) {

        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int compliment = target - arr[i];

            if (myMap.containsKey(compliment)) {
                return new int[]{myMap.get(compliment), i};
            }

            myMap.put(arr[i], i);
        }

        return new int[]{};
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = romanMap.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                result -= romanMap.get(s.charAt(i));
            } else {
                result += romanMap.get(s.charAt(i));
            }
        }

        return result;
    }

    public static long fibonacciRecursive(int n) {

        if (n <= 1) return n;

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static long fibonacci(int n) {
        long firstNumber = 0;
        long secondNumber = 1;
        long thirdNumber = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(firstNumber + ", ");


            thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }
        return thirdNumber;
    }

    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> myMap = new HashMap<>();

        for (int i : array1) {
            myMap.put(i, true);
        }

        for (int j : array2) {
            if (myMap.get(j) != null) return true;
        }

        return false;

    }

    public static List<Integer> findDuplicates(int[] array){

        HashSet<Integer> mySet = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for(int i : array){
            if(mySet.contains(i) && !duplicates.contains(i)){
                duplicates.add(i);
            }else {
                mySet.add(i);
            }
        }

        return duplicates;

    }


}
