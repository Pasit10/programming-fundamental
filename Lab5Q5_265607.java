import java.util.Scanner;
public class Lab5Q5_265607 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        for(int i = 0;i < n;i++){
            for(int j = i;j < n;j++){
                System.out.print(x+" ");
                x--;
            }
            x = n;
            System.out.println();
        }
        sc.close();
    }
}
