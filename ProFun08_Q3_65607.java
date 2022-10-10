import java.util.*;
public class ProFun08_Q3_65607{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[10];
        while(n > 0){
            topK(arr,n);
            n = sc.nextInt();
        }
        sc.close(); 
    }

    static void topK(int[] intArr,int n){
        for(int i = 0;i < intArr.length;i++){
            if(n >= intArr[i]){
                for(int j = intArr.length-1;j > i;j--){
                    intArr[j] = intArr[j-1];
                }
                intArr[i] = n;
                break;
            }
        }
        System.out.println(Arrays.toString(intArr));
    }
}