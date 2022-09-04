public class Lab5Q4_265607 {
    public static void main(String[] args){
        String s1 = "I am happy"; // 0 with s1 = s1.toLowerCase();
        String s2 = "xyz"; // -1
        s1 = s1.toLowerCase();
        int idx_s1 = 0,idx_s2 = 0;
        for(int i = 0;i < s1.length();i++){
            if(s1.charAt(i) == 'a'||s1.charAt(i) == 'e'||s1.charAt(i) == 'i'||s1.charAt(i) == 'o'||s1.charAt(i) == 'u'){
                idx_s1 = i;
                break;
            }else{
                idx_s1 = -1;
            }
        }
        for(int i = 0;i < s2.length();i++){
            if(s2.charAt(i) == 'a'||s2.charAt(i) == 'e'||s2.charAt(i) == 'i'||s2.charAt(i) == 'o'||s2.charAt(i) == 'u'){
                idx_s2 = i;
                break;
            }else{
                idx_s2 = -1;
            }
        }
        System.out.println("s1 = "+idx_s1+"\ts2 = "+idx_s2);
    }
}
