import java.util.*;
public class ProFun09_Q3_65607 {
    public static void main(String[] args) {
        // int[][] mineMap = {{0,0,9,0,0,0,0,9,0,0,0,0,0},
        //                    {0,0,0,0,0,0,0,9,9,9,0,0,0},
        //                    {0,9,9,0,9,0,0,0,0,0,0,0,0},
        //                    {0,9,0,0,9,9,0,0,9,0,9,0,0},
        //                    {0,9,0,0,9,9,0,0,9,9,9,0,0},
        //                    {0,0,0,0,0,0,0,0,0,0,9,0,0},
        //                    {0,0,0,0,0,0,0,9,9,9,0,0,0},
        //                    {0,0,0,0,0,0,0,9,9,0,0,0,9}};
        int[][] mineMap = new int[8][13];
        MakeMap(mineMap);
        bMap(mineMap);
        for(int row = 0;row < mineMap.length;row++){
            System.out.println(Arrays.toString(mineMap[row]));
        }
    }
    
    static int[][] bMap(int[][] bMap){
        for(int row = 0;row < bMap.length;row++){
            for(int column = 0;column < bMap[row].length;column++){
                if(bMap[row][column] == 9){
                    for(int row_1 = row-1;row_1 <= row+1;row_1++){
                        for(int column_1 = column-1;column_1 <= column+1;column_1++){   
                            if(row_1 > -1 && column_1 > -1 && row_1 < bMap.length && column_1 < bMap[row].length){
                                if(bMap[row_1][column_1] != 9){
                                    bMap[row_1][column_1]++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bMap;
    }

    static int[][] MakeMap(int[][] arr){
        Random rand = new Random();
        int countmine = 0;
        int[][] map = new int[arr.length][arr[0].length];
        for(int row = 0;row < map.length;row++){
            for(int column  = 0;column < map[row].length;column++){
                map[row][column] = rand.nextInt(100);
            }
        }
        for(int row = 0;row < map.length;row++){
            for(int column  = 0;column < map[row].length;column++){
                if(map[row][column] >= 80){
                    arr[row][column] = 9;
                    countmine++;

                }
            }
        }
        System.out.println("bomb = "+ countmine);
        return arr;
    }
}