import java.util.ArrayList;
import java.util.List;

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
        int[] arr = {2, 4, 6, 8, 3, 7, 4, 4, 6, 8, 2, 6, 11, 17, 19, 21};
        //Create a new list for add duplicate value.
        List<Integer> tmpArr = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++) {
                //Conditions are control even and duplicate number.
                if(arr[i] == arr[j] && arr[i] % 2 == 0) {
                    //tmpArr includes duplicate value, program is not adding to value (arr[i]).
                    if(!isHas(tmpArr, arr[i])) {
                        tmpArr.add(arr[i]);
                        break;
                    }
                }
            }
        }
        System.out.println(tmpArr.toString());
    }
}