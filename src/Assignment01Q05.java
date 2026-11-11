public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {

        if(i==j){
            return 0;
        }

        int[] dis = new int[m.length];
        // array to keep the distace

        dis= fsp(m, i, j, dis);
        int path =0; 
        for (int x=0; x< dis.length; x++){
            if (dis[x] ==1 )path ++;
  
        }
        if (path ==0){
            return -1;
        }
        return path;
    }

    private static int[] fsp (int[][] m, int i, int j, int [] dis){

        if (i ==j){
            // arrived
            dis[j] =1;
            return dis;
        }

        for (int k=0; k<m.length; k++){
            if(m[i][k] == 1){
                // got somewhere to go
                if (dis[k] == 0){
                    // not been there yet
                    dis[k] =1;
                    dis = fsp(m,k,j,dis);

                }
            }
        }

        return dis;

    }


    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}