public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        
        int iterations = Integer.parseInt(args[0]);
        double approxPi = 0;
        int mul =1;
        int j;

        for (j = 0; j < iterations; j++) {
            approxPi += mul * 4.0 / (2 * j + 1);
            mul *= -1;
        }
        System.out.println(approxPi + " " + actualPi);
    }
}
