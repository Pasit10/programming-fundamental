class Lab5Q3_65607{
    public static void main(String[] args){
        int sum =0;
        for(int num = 1;num <= 199;num++){
            if(num % 10 == 0){
                continue;
            }
            sum += num;
        }
        System.out.println(sum);
    }   
}
