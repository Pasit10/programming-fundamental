public class Lab4Q465607 {
    public static void main(String[] args){
        int i,num = 1,sum = 0,count = 0;
        while(count < 5){
            sum = 0;
            for(i = 1;i <= num/2 ; i++){
                if(num%i == 0){
                    sum += i;
                }
            }
            if(sum == num && num > 0){
                System.out.printf("%d is perfect number\n",num);
                count++;
            }
            num++;
        }
    }
}


