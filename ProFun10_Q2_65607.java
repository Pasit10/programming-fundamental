import java.util.Random;
import java.util.Arrays;
public class ProFun10_Q2_65607 {
    public static void main(String[] args){
        int[] arr = /*{2,8,3,3,1,1,2,2,2,2,2,3,3,3,4,4}; */ newArr();
        int verifies = 5;
        int x = occurrences(arr,verifies,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
        System.out.println(x);
    }

    public static int occurrences(int[] a, int n,int idx,int count){
        if(a[idx] == n){
            count++;
        }if(idx == 0){
            return count;
        }
        return occurrences(a, n, idx-1,count);
    }
    // อย่าไปสนใจมันเลยครับ
    static int[] newArr(){
        Random sc = new Random();
        int size = sc.nextInt(20);
        size = (size == 0) ? sc.nextInt(20):size;
        int[] arr = new int[size];
        for(int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt(10);
        }
        return arr;
    }
}
