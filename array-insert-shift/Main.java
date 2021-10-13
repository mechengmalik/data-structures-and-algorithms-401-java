import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 42,8,15,23,42 };
        System.out.println(Arrays.toString(insertShiftArray(arr,16)));
    }

    public static int[] insertShiftArray(int[] arr, int value) {

        int [] newArr = new int[arr.length+1];
        int middle = arr.length % 2 == 0 ? arr.length /2:arr.length /2 +1;

        for (int i = 0; i < newArr.length; i++){
            if (i == middle){
                newArr[i] = value;
            }
            else if (i<middle) {
                newArr[i] = arr[i];
            }else{
                newArr[i] = arr[i-1]; 
            }
        }

        return newArr;
    }

}