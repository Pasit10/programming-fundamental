import java.util.Scanner;

public class programing_quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] data = new int[N][M];
        for(int row = 0;row < data.length;row++){
            for(int col = 0;col < data[row].length;col++){
                data[row][col] = sc.nextInt();
            }
        }
        int sortCol = sc.nextInt();
        System.out.println(sortCol);
        sorting(data,sortCol);
        sc.close();
    }

    static void sorting(int[][] arr,int sortCol){
        for(int i = 1;i < arr.length;i++){
            int key = arr[i][sortCol];
            int[] keyarr = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j][sortCol] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = keyarr;
        }
        
        for(int[] ar : arr){
            for(int i = 0;i < ar.length;i++){
                if(i == ar.length-1){
                    System.out.print(ar[i]);
                }else{
                    System.out.print(ar[i] + " ");
                }
            }
            System.out.println();
        }
    }
}