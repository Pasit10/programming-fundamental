import java.util.Scanner;

public class programing_quiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int row = sc.nextInt();
        int startX = 0, startY = 0;
        int endX = 0,endY = 0;
        int[][] maze = new int[row][col];
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                maze[i][j] = sc.nextInt();
                if(maze[i][j] == -1){
                    startX = i;
                    startY = j;
                }if(maze[i][j] == 9){
                    endX = i;
                    endY = j;
                }
            }
        }
        boolean ans = solveMaze(maze, startX, startY, endX, endY);
        if(ans){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }

    static boolean solveMaze(int[][] maze,int stX,int stY,int edX,int edY){
        boolean[][] wasHere = new boolean[maze.length][maze[0].length];
        boolean b = recursiveSolve(maze,stX,stY,edX,edY,wasHere); 
        return b;
    }

    static boolean recursiveSolve(int[][] maze,int x,int y,int endX,int endY,boolean[][] wasHere){
        if (x == endX && y == endY){
            return true;
        }
        if (maze[x][y] == 0|| wasHere[x][y]) {
            return false;
        }
        wasHere[x][y] = true;
        if (x != 0)
            if (recursiveSolve(maze,x-1, y,endX,endY,wasHere)) {
                return true;
            }
        if (x != maze.length - 1)
            if (recursiveSolve(maze,x+1, y,endX,endY,wasHere)) { 
                return true;
            }
        if (y != 0)
            if (recursiveSolve(maze,x, y-1,endX,endY,wasHere)) { 
                return true;
            }
        if (y != maze[0].length - 1)
            if (recursiveSolve(maze,x, y+1,endX,endY,wasHere)) {
                return true;
            }
        return false;
    }
}