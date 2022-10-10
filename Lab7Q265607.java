public class Lab7Q265607 {
    public static void main(String[] args){
        int [] data = { 7,2,-1,3,4,10,-12,3,21,-9};
        int max = maxElement(data);
        System.out.println(max);
    }
    static int maxElement(int [] arr){
        int max = arr[0];
        for(int i :arr){
            max = (i > max) ? i:max;
        }
        return max;
    }
}
