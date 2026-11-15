

public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {

        if(i==j){
            return 0;
        }
        int N = m.length;

        int[] dis = new int[N];
        for (int k =0; k< N; k++ ){
            dis[k] = Integer.MAX_VALUE;
        }
        dis[i] =0;
       
        // array to keep the distace

        int path =fsp(m, i, j, dis,0);
     
        if (path <= 0 || dis[j] == Integer.MAX_VALUE){
            return -1;
        }
        return path;
    }

    private static int fsp (int[][] m, int i, int j, int [] dis, int hops){

        if (i ==j){
            // arrived   
            return hops;
        }

        int path = Integer.MAX_VALUE;

        for (int k=0; k<m.length; k++){
            if(m[i][k] != 0){
                // got somewhere to go
                int currHop = hops +1;
                if ( dis[k] > currHop ){
                    // not been there yet
                    dis[k] =currHop;
                    path = Math.min(fsp(m,k,j,dis, currHop), path);
                }
            
            }
        }

        return path;

    }


    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{1,1,0,1}, {1,0,0,1}, {0,0,0,0}, {1,0,1,0}}, 0, 2)); // 2
    }
}