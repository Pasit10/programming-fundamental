class Lab6Q2_265607{
    public static void main(String[] args){
        String str = "01 01 10 10";
        String[] num = str.split(" ");
        int sum = 0;
        for(int i = 0;i < num.length-1;i++){
            if(num[i].charAt(1) != num[i + 1].charAt(0)){
                sum ++;
            }
        }
        System.out.println(sum);
    }
}