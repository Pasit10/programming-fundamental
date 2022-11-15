public class ProFun10_A1_65607 {
    public static void main(String[] args){
        int[] arr = {3,2,3,2,4,2};
        int verifies = 3;
        boolean x = appears(arr, verifies,arr.length-1);
        System.out.println(x);
    }

    public static boolean appears(int[] arr,int n,int idx){
        if(arr[idx] == n){
            return true;
        }if(idx == 0){
            return false;
        }
        return appears(arr, n, idx-1);
    }
}
