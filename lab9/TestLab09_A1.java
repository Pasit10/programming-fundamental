import java.util.Arrays;

public class TestLab09_A1 {
    public static void main(String[] args){
        int[] data = {0,1,0,1,1,0,0,0,1};
        shake(data);
        System.out.println(Arrays.toString(data));
    }

    static void shake(int[] data){
        int zero = 0,get = 0;
        for(int i = 0;i < data.length;i++){
            if(data[i] == data[0])
                zero++;
            if(data[0] != data[i])
                get = data[i];
        }  
        for(int j = 0;j < data.length;j++){
            if(j >= zero){
                data[j] = get;
            }
            else{
                data[j] = data[0];
            }
        }
    }
}