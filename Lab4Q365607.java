public class Lab4Q365607 {
    public static void main(String...args){
        int amountCharge = 0;
        int hrsPark = 0;
        for(int i = 0;i < args.length;i++){
            hrsPark = Integer.parseInt(args[i]);
            amountCharge = 0;
            if(hrsPark >= 18 && hrsPark <= 24){
                amountCharge = 24;
                hrsPark = 0;
            }
            if(hrsPark > 24){
                int modHrs = hrsPark%24;
                amountCharge = (hrsPark/24)*24;
                hrsPark = modHrs;
            }
            while (hrsPark > 0){
                if(hrsPark>4){
                    amountCharge++;
                    hrsPark--;
                }else if(hrsPark <= 4 && hrsPark > 2){
                    amountCharge+=3;
                    hrsPark--; 
                }else if(hrsPark <= 2){
                    amountCharge+=4;
                    hrsPark-=2;
                }
            }
            System.out.println(amountCharge);//4 7 10 11 24 24 127
        }
    }
}
