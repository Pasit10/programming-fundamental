class Lab6Q2_165607{
    public static void main(String[] args){
        int max = Integer.MIN_VALUE;
        int[] data = {7, 1, 2, -1, 3, 4, 10, -12, 3, 21, -9};
        for(int i:data){
            max = (i > max) ? i:max;
        }
        System.out.println("Max = "+max);
    }
}