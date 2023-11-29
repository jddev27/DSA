package Algorithm.Exercises;


import DataStructures.arrays.ArrayUtil;

import java.util.List;

public class Main {
    public static void main(String[] args){

        int[] myArr = new int[]{3,2,4};
        int target = 6;

        int[] results = Exercise.TwoSum(myArr, target);

        System.out.println("value exist , indexes are:  "+ results[0] + ", " + results[1] );


        int[] resultsTwo = ArrayUtil.twoSumTwoPointer(myArr, target);
        System.out.println("value exist , indexes are:  "+ resultsTwo[0] + ", " + resultsTwo[1] );

       String roman = "LVIII";
       int romanInt = Exercise.romanToInt(roman);
        System.out.println("The integer conversion for roman:  " + roman +  " is: " + romanInt);


        System.out.println("---------"+ "Fibonnaci Recursive" +"---------" );
        System.out.println(Exercise.fibonacciRecursive(6));
        System.out.println("---------"+ "Fibonnaci" +"---------" );
        long number = Exercise.fibonacci(6);
        System.out.println("---------"+ "Fibonnaci number" +"---------" );
        System.out.println(number);


        System.out.println("---------"+ "Common in two arrays" +"---------" );

        int[] array1 = {1,3,5};
        int[] array2 = {1,4,5};

        System.out.println(Exercise.itemInCommon(array1, array2));

        System.out.println("---------"+ "Find duplicates in array" +"---------" );

        int[] nums = {-1, 0, 1, 0, -1, -1, 2, 2};

        List<Integer> duplicates = Exercise.findDuplicates(nums);
        System.out.println(duplicates);
    }
}
