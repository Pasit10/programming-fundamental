import java.util.Scanner;
class Lab5Q5_465607{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 0;
        //ผุ่ม
        for(int count = 1;count <= n;count++) {
            space = (n - (count-1))+3;
            for(int i =1; i <= 4; i++){
                for(int ss = i ; ss < space ;ss++){
                    System.out.print(" "); 
                }
                for(int st = 1; st <=i*2-1;st++){
                    System.out.print("*");
                }
                if(count != 1){
                    int cur = 0;
                    while(cur < count-1){
                        System.out.print("**");
                        cur++;
                    }
                } 
                System.out.println();
            }           
        }
        //ลำต้น
        for(int i = 1; i<=n;i++){
            for(int ss = 1 ; ss < n+2 ;ss++){
                System.out.print(" "); 
            }
            for(int st = 1 ; st <= 3 ;st++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

