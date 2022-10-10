public class Fun {
    public static void main(String[] args){
        double sum = 0,numPow = 0;
        double mean = 0;
        double standardDeviation;
        double[] data = new double[args.length];
        for(int i = 0;i < args.length;i++){
            data[i] = Double.parseDouble(args[i]);
            sum += data[i];
        }
        double count = data.length;
        mean = sum/count;
        System.out.printf("mean = %.2f",mean);       
        for(int i = 0;i< data.length;i++){
            numPow += Math.pow((data[i]-mean), 2);
        }
        standardDeviation = Math.sqrt(numPow/count);
        System.out.printf("\nstandardDeviation = %.2f",standardDeviation);
    }
}
