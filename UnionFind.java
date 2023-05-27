/*
 * Model the problem.
 * Find an algorithm to solve it.
 * Fast enough? Fits in memory?
 * If not, figure out why.
 * Find a way to address the problem.
 *Iterate until satisfied.
 */

//Dynamic Connectivity
        /*
        UF(int N)
        void union(int p, int q)
        boolean connected(int p, int q)
        int find(int p)
        int count()
         */
public class UnionFind (int N) {
//    public static void main(String[] args) {
        int n = StdIn.readInt();
        UF uf = new UF(N);
        while (!StdIn.isEmpty()){
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(!uf.connected(p, q)){

                uf.union(p, q);
                StdOut.println(p +" "+ q);
            }
        }

}
