import java.util.Arrays;

public class Array_binary_search {
    public static void main(String[] args) {
        int[] arr = { 1,8,15,23,42 };
        System.out.println(binarySearch(arr,23)); 
    }

    public static int binarySearch(int [] arr,int value){
        int left = 0;
        int right = arr.length-1;
        boolean found = false;
        int index = -1;
        while(left <= right && !found){
            int mid = (left + right) / 2;

            if(arr[mid] == value){
                found = true;
                index = mid;
                break;
            }else if(arr[mid] < value){
              left = mid+1;
            }else{
                right = mid-1;
            }
        }

        return index;
    }
}
