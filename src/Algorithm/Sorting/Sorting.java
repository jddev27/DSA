package Algorithm.Sorting;

public class Sorting {

    public static int[] selectionSort(int[] arr){
        int minIndex =0;

        for(int currentIndex = 0; currentIndex < arr.length - 1; currentIndex++){

            minIndex = currentIndex;

            for (int nextIndex = currentIndex + 1; nextIndex < arr.length; nextIndex++){

                if(arr[nextIndex] < arr[minIndex]){
                    minIndex = nextIndex;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex]= arr[currentIndex];
            arr[currentIndex]= temp;
        }

        return arr;
    }
}
