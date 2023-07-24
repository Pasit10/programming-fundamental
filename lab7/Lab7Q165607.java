import java.util.Scanner;
public class Lab7Q165607 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = factoral(n);
        System.out.printf("%d! = %1d",n,sum);
        sc.close();
    }
    static long factoral(int n){
        long sum = 1;
        for(long i = n;i >= 1;i--){
            sum *= i;
        }
        return sum;
    }
}
