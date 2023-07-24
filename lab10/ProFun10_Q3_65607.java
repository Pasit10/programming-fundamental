import java.util.Arrays;

public class ProFun10_Q3_65607 {
    public static void main(String[] args){
        int[] arr = {1,3,4,-3,2,-7};
        int[] newarr = negativesToZero(arr);
        System.out.println(Arrays.toString(negativesToZero(newarr)));
    }

    public static int[] negativesToZero(int[] a){
        int[] newarr = new int[a.length];
        negativesToZeroCalcurate(a,newarr,0); 
        return newarr;
    }

    public static int[] negativesToZeroCalcurate(int[] arr,int[] newarr,int idx){   
        if(idx == arr.length){
            return newarr;
        }if(arr[idx] >= 0){
            newarr[idx] = arr[idx];
        }return negativesToZeroCalcurate(arr, newarr, idx+1);
    }
}
