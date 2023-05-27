public class QuickFind {
//    public static void main(String[] args) {
//    }
    private int[] id;

    public QuickFind(int N){
        id = new int[N];
        for( int i=0; i < N; i++){
            id[i] = i;
        }
    }

    public boolean connected(int p, int q){
        return id[p] == id[q];
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for( int i =0; i< id.length; i++){
            if(id[i] == pid) id[i] = qid;
        }

    }

    //O(N2) -> quadratic algorithms to not scale
    //New computers are 10x fast, 10x much memory - solves problems 10x big.
    //With quadratic algorithm, takes 10x as long!  //too slow for huge problems.

}
