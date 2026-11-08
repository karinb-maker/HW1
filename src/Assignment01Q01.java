public class Assignment01Q01 {
    public static void main(String[] args) {
        int len = args.length;
        for (int i =0; i< len; i++){
           char ch = args[i].charAt(0);
           if ((int )ch % 5 ==0) System.out.println(ch);
            

        }
       
    }
}
