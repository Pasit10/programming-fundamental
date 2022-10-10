class Lab6Q2_265607{
    public static void main(String[] args){
        String str = "10 10 10 01 10 10";
        String[] magnets = str.split(" ");
        int sum = 1;
        for(int i = 0;i < magnets.length-1;i++){
            if(magnets[i].charAt(1) == magnets[i+1].charAt(0)){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
