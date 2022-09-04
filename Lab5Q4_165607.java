public class Lab5Q4_165607 {
    public static void main(String[] args){
        int w = 0;
        int m = 0;
        String str = "WWWWMMMMWMWMWMWMMMWWWWWM";
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == 'W'){
                w ++;
            }else{
                m++;
            }
        }
        System.out.printf("Studens W = %d : Studens M = %d",w,m);
    }
}
