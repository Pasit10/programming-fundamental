public class ProFun08_Q2_65607{
    public static void main(String...args){
        int[] arr = new int[args.length];
        for(int i = 0;i < arr.length;i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Maximun contiguous sum is "+ kadane(arr));
    }    
    static int kadane(int[] a){
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for(int i = 0;i < a.length;i++){
            max_ending_here += a[i];
            if(max_so_far < max_ending_here){
                max_so_far = max_ending_here;
            }
            if(max_ending_here < 0){
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
}

