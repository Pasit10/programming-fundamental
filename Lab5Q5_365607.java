import java.util.Scanner;
public class Lab5Q5_365607 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i <= n+1;i++){
            for(int j = i;j<= n;j++){
                System.out.print(" ");
            }
            for(int k = 1;k <= 2*i-1;k++){
                System.out.print("P");
            }
            System.out.println();
        }
        sc.close();
    }
}
