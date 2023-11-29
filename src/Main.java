import Algorithm.Search.Search;
import Algorithm.Sorting.Sorting;

public class Main {
    public static void main(String[] args) {

        //BINARY SEARCH TEST
        int [] myArr = new int[]{1,2,5,6,7,9};
        int target = 9;

        int found = Search.binarySearch(myArr, target);

        System.out.println("----------------Binary Search Test----------------");
        System.out.println("The target is found " + found);

        //SELECTION SORT TEST
        int[] unsortedArr = new int[]{2,8,1,3,20,4};

       int[] sortedArray =  Sorting.selectionSort(unsortedArr);


        System.out.println("----------------SELECTION SORT Test----------------");
        for(int i: sortedArray){

            System.out.println(i);
        }



    }

}