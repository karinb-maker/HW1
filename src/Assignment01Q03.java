public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

    
        int numOdd = 0;
        int curr =1;
        int prev =0;
        for (int i = 0; i < x; i++) {
            if (i < x ) {
                System.out.print(curr + " "); // Make sure we don't print a trailing space
                curr += prev;
                prev = curr - prev;
                if (prev %2 == 1){
                    numOdd++;
                }
            }

        }
        System.out.println();
        
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
