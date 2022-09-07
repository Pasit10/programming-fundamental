public class CsLab5a {
    public static void main(String[] args){
        int[][] prices = { { 250, 400, 350 }, { 400, 600,350 }, { 200, 400, 250 } };
        String[] city_d = { "Denver", "Edmonto", "Fargo" };
        int n = prices.length;
        int dest_Aus = 0,dest_Bos = 0,dest_Chi = 0;
        int minCost = 0;
        int tmp = 0; // can remove later
        for (int if_Go_i = 0; if_Go_i < n; if_Go_i++) {
            for (int if_Go_j = 0; if_Go_j < n; if_Go_j++) {
                for (int if_Go_k = 0; if_Go_k < n; if_Go_k++) {
                    /* q3 caseCost = */
                    /* q1 */if((if_Go_i != if_Go_j) && (if_Go_i != if_Go_k)){
                        continue;
                    }
                    System.out.printf("%d, Aus goes %s,Bos goes %s, Chi goes %s%n",++tmp, city_d[if_Go_i],city_d[if_Go_j], city_d[if_Go_k]);
                    /* q2 */ 
                    /* q4 */
                    dest_Aus = if_Go_i;
                    dest_Bos = if_Go_j;
                    dest_Chi = if_Go_k;
                    /* q5 */
                    // } /* end q4 */ } /* end q1 */
                } // k
            } // j
        } // i
        System.out.printf("Ans = Aus goes %s,Bos goes %s, Chi goes %s for %d%n",city_d[dest_Aus], city_d[dest_Bos],city_d[dest_Chi], minCost);
    }
}
