import java.util.*;

class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
        }
        
        int[] vis = new int[V];
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                if (dfs(i, adj, vis)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean dfs(int node, List<List<Integer>> adj, int[] vis) {
        vis[node] = 1;
        for (int neighbor : adj.get(node)) {
            if (vis[neighbor] == 1) {
                return true;
            }
            if (vis[neighbor] == 0 && dfs(neighbor, adj, vis)) {
                return true;
            }
        }
        vis[node] = 2;
        return false;
    }
}
