package DataStructures.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayUtil {

    public static int missingNumber(int [] array){
        int n = array.length;
        int currentSum = 0;
        int expectedSum = (n * (n+1))/2;

        for(int i = 0; i<array.length; i++){
            currentSum += array[i];
        }
        return expectedSum - currentSum;
    }

    public static int MissingNumberWithXor(int [] arr){
        int missing = arr.length;
        for(int i = 0; i < arr.length; i++){
            missing ^= i ^ arr[i];
        }

        return missing;
    }

    public static int[] twoSum(int [] arr, int target){

       Map<Integer, Integer> myMap = new HashMap<>();

       for(int i = 0; i < arr.length; i++){

           int complement = target - arr[i];

           if(myMap.containsKey(complement)){
               return new int[]{myMap.get(complement), i};
           }
           else {
               myMap.put(complement, i);
           }
       }
        return  null;
    }

    public static int[] twoSumTwoPointer(int [] arr,  int target){
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        int totalSum = 0;

        while(low < high){
            totalSum = arr[low] + arr[high];
            if(totalSum == target){
                return new int[]{low, high};
            }
            else if(totalSum < target){
                low++;
            }else {
                high--;
            }
        }

        return new int[]{};

    }

    public static boolean ThreeSum(int [] arr, int target){
        Arrays.sort(arr);
        int low, high, totalSum;

        for(int i = 0; i < arr.length - 2; i++){
            low = i + 1;
            high = arr.length -1;

            while(low < high){
                totalSum = arr[i]+ arr[low]+ arr[high];

                if(totalSum == target){
                    return true;
                }
                else if(totalSum < target){
                    low++;
                }
                else {
                    high--;
                }
            }
        }

        return false;

    }

    public static int[] findDuplicates(int[] arr){

        Arrays.sort(arr);

        int j = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != arr[i+1]){
                arr[j++]= arr[i];
            }
        }
       arr[j++] = arr[arr.length - 1];

        return arr;
    }
}
