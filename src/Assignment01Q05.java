public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        // max distance = N -> N = tot nodes in graph
        // if distance > N -> loop
         if(i==j){
            return 0;
        }
        int N = m.length;

        int dis = dis(m, i, j, N, N, new int[N]);
        if (dis< N+1){return dis;}


       

       
        return -1;
        
    }

    public static int dis(int[][]m, int i, int j, int hops, int next, int[]visited){
          if(i==j){
            return hops;
        }
        int path =m.length+1; 
        for (int k=0; k< m.length-1; k++){

            if (m[i][k] ==1 && visited[k] ==0 ){
                visited[k] =1;
                path = dis(m, next,  j,hops+1, k, visited);
                if (path >hops){
                    path = hops;
                }
            }
        }

        
        return Math.min (m.length+1, path);


    }




 

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{1,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}