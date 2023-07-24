import java.util.*;

public class TestLab09_Q3 {
    public static void main(String[] args){
        int[][] mineMap = {{0,0,9,0,0,0,0,9,0,0,0,0,0},
                           {0,0,0,0,0,0,0,9,9,9,0,0,0},
                           {0,9,9,0,9,0,0,0,0,0,0,0,0},
                           {0,9,0,0,9,9,0,0,9,0,9,0,0},
                           {0,9,0,0,9,9,0,0,9,9,9,0,0},
                           {0,0,0,0,0,0,0,0,0,0,9,0,0},
                           {0,0,0,0,0,0,0,9,9,9,0,0,0},
                           {0,0,0,0,0,0,0,9,9,0,0,0,0}};
        markMap(mineMap);
        for(int row = 0;row < mineMap.length;row++){
            System.out.println(Arrays.toString(mineMap[row]));
        }
    }
    
    static int[][] markMap(int[][] bMap){
        for(int row = 0;row < bMap.length;row++){
            for(int column = 0;column < bMap[row].length;column++){
                if(row == 0 && column == 0){
                    Topleft(bMap, row, column);
                }else if(row == 0 && column == bMap[0].length-1){
                    Topright(bMap, row, column);
                }else if(row == bMap.length-1 && column == 0){
                    Underleft(bMap, row, column);
                }else if(row == bMap.length-1 && column == bMap[0].length-1){
                    Underrigth(bMap, row, column);
                }else if(column == 0){
                    Left(bMap, row, column);
                }else if(column == bMap[row].length-1){
                    Rigth(bMap, row, column);
                }else if(row == 0){
                    Top(bMap, row, column);
                }else if(row == bMap.length-1){
                    Under(bMap, row, column);
                }else{
                    center(bMap, row, column);
                }
            }
        }
        return bMap;
    }

    static void center(int[][] bMap,int row,int column){
        if(bMap[row][column] == 9){
            if(bMap[row+1][column] != 9){
                bMap[row+1][column]++;
            }if(bMap[row+1][column+1] != 9){
                bMap[row+1][column+1]++;
            }if(bMap[row][column+1] != 9){
                bMap[row][column+1]++;
            }if(bMap[row-1][column+1] != 9){
                bMap[row-1][column+1]++;
            }if(bMap[row-1][column] != 9) {
                bMap[row-1][column]++;
            }if(bMap[row-1][column-1]!= 9){
                bMap[row-1][column-1]++;
            }if(bMap[row][column-1]!= 9){
                bMap[row][column-1]++;
            }if(bMap[row+1][column-1]!= 9){
                bMap[row+1][column-1]++;
            }
        }
    }

    static void Topleft(int[][] bMap,int row,int column){
        if(bMap[row][column] == 9){
            if(bMap[row][column+1] != 9){
                bMap[row][column+1]++;
            }if(bMap[row-1][column+1] != 9){
                bMap[row-1][column+1]++;
            }if(bMap[row-1][column] != 9) {
                bMap[row-1][column]++;
            }
        }
    }

    static void Topright(int[][] bMap,int row,int column){
        if(bMap[row][column] == 9){
            if(bMap[row-1][column] != 9) {
                bMap[row-1][column]++;
            }if(bMap[row-1][column-1]!= 9){
                bMap[row-1][column-1]++;
            }if(bMap[row][column-1]!= 9){
                bMap[row][column-1]++;
            }
        }
    }

    static void Underleft(int[][] bMap,int row,int column){
        if(bMap[row][column] == 9){
            if(bMap[row+1][column] != 9){
                bMap[row+1][column]++;
            }if(bMap[row+1][column+1] != 9){
                bMap[row+1][column+1]++;
            }if(bMap[row][column+1] != 9){
                bMap[row][column+1]++;
            }
        }
    }

    static void Underrigth(int[][] bMap,int row,int column){
        if(bMap[row][column] == 9){
            if(bMap[row][column-1]!= 9){
                bMap[row][column-1]++;
            }if(bMap[row+1][column-1]!= 9){
                bMap[row+1][column-1]++;
            }if(bMap[row+1][column] != 9){
                bMap[row+1][column]++;
            }
        }
    }

    static void Top(int[][] bMap,int row,int column){
        if(bMap[row][column] == 9){
            if(bMap[row][column-1]!= 9){
                bMap[row][column-1]++;
            }if(bMap[row+1][column-1]!= 9){
                bMap[row+1][column-1]++;
            }if(bMap[row+1][column] != 9){
                bMap[row+1][column]++;
            }if(bMap[row+1][column+1] != 9){
                bMap[row+1][column+1]++;
            }if(bMap[row][column+1] != 9){
                bMap[row][column+1]++;
            }
        }
    }

    static void Under(int[][] bMap,int row,int column){
        if(bMap[row][column] == 9){
            if(bMap[row][column+1] != 9){
                bMap[row][column+1]++;
            }if(bMap[row-1][column+1] != 9){
                bMap[row-1][column+1]++;
            }if(bMap[row-1][column] != 9) {
                bMap[row-1][column]++;
            }if(bMap[row-1][column-1]!= 9){
                bMap[row-1][column-1]++;
            }if(bMap[row][column-1]!= 9){
                bMap[row][column-1]++;
            }
        }
    }

    static void Left(int[][] bMap,int row,int column){
        if(bMap[row][column] == 9){
            if(bMap[row+1][column] != 9){
                bMap[row+1][column]++;
            }if(bMap[row+1][column+1] != 9){
                bMap[row+1][column+1]++;
            }if(bMap[row][column+1] != 9){
                bMap[row][column+1]++;
            }if(bMap[row-1][column+1] != 9){
                bMap[row-1][column+1]++;
            }if(bMap[row-1][column] != 9) {
                bMap[row-1][column]++;
            }
        }
    }

    static void Rigth(int[][] bMap,int row,int column){
        if(bMap[row][column] == 9){
            if(bMap[row-1][column] != 9) {
                bMap[row-1][column]++;
            }if(bMap[row-1][column-1]!= 9){
                bMap[row-1][column-1]++;
            }if(bMap[row][column-1]!= 9){
                bMap[row][column-1]++;
            }if(bMap[row+1][column-1]!= 9){
                bMap[row+1][column-1]++;
            }if(bMap[row+1][column] != 9){
                bMap[row+1][column]++;
            }
        }
    }
}