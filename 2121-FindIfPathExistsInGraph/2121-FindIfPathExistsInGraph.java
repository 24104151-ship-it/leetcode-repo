// Last updated: 13/08/2026, 15:18:11
class Solution {
    int parent[];
    int rank[];
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        parent=new int[n];
        rank=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            rank[i]=i;
        }
        for(int[] edge:edges){
            union(edge[0],edge[1]);
        }
        return find(source)==find(destination);
    }
    public int find(int x){
        if(parent[x]!=x){
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }
    public void union(int x,int y){
        int rootX = find(x);
    int rootY = find(y);

    if (rootX == rootY) {
        return;
    }

    if (rank[rootX] > rank[rootY]) {
        parent[rootY] = rootX;
    } 
    else if (rank[rootX] < rank[rootY]) {
        parent[rootX] = rootY;
    } 
    else {
        parent[rootY] = rootX;
        rank[rootX]++;}
    }
}