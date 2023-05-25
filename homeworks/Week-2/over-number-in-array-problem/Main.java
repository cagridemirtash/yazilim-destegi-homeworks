import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{
    static boolean isHas(List<Integer> arr, int value) {
        for(int v : arr) {
            if(v == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        //Create a new list for add unique value.
        List<Integer> tmpArr = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++) {
                //Conditions are control equal number of array.
                if(arr[i] == arr[j]) {
                    //tmpArr includes duplicate value, program is not adding to value (arr[i]).
                    if(!isHas(tmpArr, arr[i])) {
                        tmpArr.add(arr[i]);
                        break;
                    }
                }
            }
        }
        //Control whole array which is temp array is including or not element of original array.
        for(int dValue : tmpArr) {
            int count = 0;
            for(int value: arr) {
                if(dValue == value) {
                    count++;
                }
            }
            System.out.println(dValue + " sayısı " + count + " kere tekrar edildi.");
        }
    }
}