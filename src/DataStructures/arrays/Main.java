package DataStructures.arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Array declaration

        int[] myArray = new int[]{1,2,3,4,5};

        //loop through an array


        System.out.println("--------looping Array-----------");
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");

        }

        System.out.println();


        System.out.println("--------Looping Array with foreach-----------");

        for(int i : myArray){
            System.out.print(i + " ");
        }
        System.out.println();

        //Two dimensional arrays

        int[][] my2dArray = new int[][]{{1,2,3,4},{5, 6, 7, 8 }, { 9, 10, 11, 12 } };


        System.out.println("--------Looping 2d Array-----------");

        for(int i = 0 ; i < my2dArray.length; i++ ){
            for(int j = 0; j < my2dArray[i].length; j++){
                System.out.print(my2dArray[i][j]);
            }
        }

        System.out.println();

        //printing 2 dimensional array in rowsR

        System.out.println("--------Looping 2d Array with foreach-----------");
        for(int[] i : my2dArray){
            System.out.println(Arrays.toString(i));
        }

        //SORTING AN ARRAY

        System.out.println("--------Sorting Array-----------");

       int[] unsortedArray= new int[]{5,6,3,1,9,87,21,4};

        System.out.print("unsorted array is: ");
       for(int i : unsortedArray){
           System.out.print(i + ", ");
       }
        Arrays.sort(unsortedArray);

        System.out.println();

        System.out.print("sorted arrary is: ");
        for(int i = 0; i < unsortedArray.length; i++){
            System.out.print(unsortedArray[i]+", ");
        }
        System.out.println();

        System.out.println("--------Copying Array-----------");

        int[] myArrayCopy = new int[myArray.length];
        System.arraycopy(myArray, 0, myArrayCopy, 0, myArray.length);

        for (int i = 0 ; i < myArrayCopy.length; i++){
            System.out.print(myArrayCopy[i] + ", ");
        }

        System.out.println();

        int[] mySeconClone = myArrayCopy.clone();

        for(int i : mySeconClone){
            System.out.print(i +", ");
        }


        System.out.println();
        System.out.println("--------Searching item in Array-----------");

       int index =  Arrays.binarySearch(myArray, 8);
       if(index > 0){
           System.out.println("number exist");
       }else{
           System.out.println("number doesn't exist");
       }

        System.out.println("--------Missing number function test-----------");

       int[] missArr = new int[]{9,6,4,2,3,5,7,0,1};
       int missingNumber = ArrayUtil.missingNumber(missArr);
        System.out.println("The missing number is: " + missingNumber);

        System.out.println("--------Missing number with xor function test-----------");
        int missNumber = ArrayUtil.MissingNumberWithXor(missArr);
        System.out.println("The missing number is: " + missNumber);

        System.out.println("--------Removing duplicates from array function test-----------");

        int[] arrayWithDuplicates = new int[]{5,1,2,6,4,5};

        int[] arrWithoutDuplicates = ArrayUtil.findDuplicates(arrayWithDuplicates);

        for(int value : arrayWithDuplicates){
            System.out.print(value + ", ");
        }



    }

}
