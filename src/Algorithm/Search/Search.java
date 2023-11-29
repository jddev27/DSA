package Algorithm.Search;

public class Search {

    public static int binarySearch(int [] arr, int target){

        int lowIndex = 0;
        int highIndex = arr.length -1;

        while(lowIndex <= highIndex){
            int middleIndex = (lowIndex + highIndex)/2;
            int middleVal = arr[middleIndex];

            if(middleVal == target){
                return target;
            }

            if(middleVal > target){
                highIndex = middleIndex - 1;
            }
            else{
                lowIndex = middleIndex + 1;
            }
        }

        return -1;
    }
}
