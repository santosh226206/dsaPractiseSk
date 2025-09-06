package graph;

import java.util.*;

public class Bfs {
    public boolean hasCycle(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        ArrayList<Integer> visited = new ArrayList<>(Collections.nCopies(V, 0));

        for (int start = 0; start < V; start++) {
            if (visited.get(start) == 1) continue;

            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{start, -1});
            visited.set(start, 1);

            while (!queue.isEmpty()) {
                int[] pair = queue.poll();
                int current = pair[0];
                int parent = pair[1];

                for (int neighbor : adj.get(current)) {
                    if (visited.get(neighbor) == 0) {
                        visited.set(neighbor, 1);
                        queue.add(new int[]{neighbor, current});
                    } else if (neighbor != parent) {
                        // Visited and not coming from parent => cycle found
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public List<Integer> bfsOfGraph(int V, List<Integer> adj[]) {
        List<Integer> visited=new ArrayList<>(Collections.nCopies(V, 0));
        Queue<Integer> que=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        que.add(0);
        while(!que.isEmpty()){
            int temp=que.poll();
            visited.set(temp, 1);
            ans.add(temp);
            adj[temp].stream().forEach((item)->{
                if(visited.get(temp) == 0){
                    que.add(item);
                }
            });
        }
        return ans;
    }
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
    }
}
