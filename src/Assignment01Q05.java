import java.util.Arrays;

public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {

        if(i==j){
            return 0;
        }

        int[] dis = new int[m.length];
        dis[i] =1;
        // array to keep the distace

        int path =fsp(m, i, j, dis,0);
        System.out.println(Arrays.toString(dis));
     
        if (path ==1){
            return -1;
        }
        return path-1;
    }

    private static int fsp (int[][] m, int i, int j, int [] dis, int hops){

        if (i ==j){
            // arrived   
            return hops+1;
        }

        for (int k=0; k<m.length; k++){
            if(m[i][k] == 1){
                // got somewhere to go
                if (dis[k] == 0){
                    // not been there yet
                    dis[k] =1;
                    hops = fsp(m,k,j,dis, hops +1);
                }
                else{
                    // already been here -> loop -> need dealing with
                    hops --;
                    
                   

                }
            }
        }

        return hops;

    }


    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 3
    }
}