import java.util.Arrays;
public class ProFun09_A1_65607 {
    public static void main(String[] args){ 
        int[] data = {0,1,0,1,1,1,1,0,0,0,0,1};
        shake(data);
        //Arrays.sort(data);
        System.out.println(Arrays.toString(data));
    }

    static void shake(int[] data){
        int i = 0,j= 0;
        int zero = 0,get = 0;
        while(j < data.length){
            if(i < data.length){
                if(data[i] == data[0]){
                    zero++;
                    data[j] = data[0];
                }if(data[0] != data[i]){
                    get = data[i];
                }
            }else{
                j = i - data.length;
                if(j < zero){
                    data[j] = data[0];
                }else if(j < data.length){
                    data[j] = get;
                }
            }
            i++;
        }
    }
}