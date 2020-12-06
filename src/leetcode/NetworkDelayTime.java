package leetcode;

import java.util.*;

class NetworkDelayTime {
    Map<Integer, Integer> dist;

    public int networkDelayTime(int[][] times, int N, int K) {

        // 准备数据,构造图结构
        // 1.起点到所有点的最短路径表
        // 2.是否遍历过某个节点 -> 数组seen来维护是否操作过

        Map<Integer, List<int[]>> graph = new HashMap();
        for (int[] edge : times) {
            if (!graph.containsKey(edge[0]))
                graph.put(edge[0], new ArrayList<int[]>());
            graph.get(edge[0]).add(new int[]{edge[1], edge[2]});
        }

        dist = new HashMap(); // 起点k到某个点的最短路径
        for (int node = 1; node <= N; node++) {
            dist.put(node, Integer.MAX_VALUE);
        }

        dist.put(K, 0);
        boolean[] seen = new boolean[N + 1]; // 是否处理过某点

        while (true) {
            int canNode = -1;
            int candDist = Integer.MAX_VALUE;
            for (int i = 1; i <= N; i++) {
                if (!seen[i] && dist.get(i) < candDist) { // 找最便宜的节点
                    candDist = dist.get(i);
                    canNode = i;
                }
            }

            if (canNode < 0) break; // 所有节点都处理过，可以推出循环
            seen[canNode] = true;
            if (graph.containsKey(canNode)) { // 判断节点是否有出边
                for (int[] info : graph.get(canNode)) {
                    dist.put(info[0], Math.min(dist.get(info[0]), dist.get(canNode) + info[1]));
                }
            }
        }

        int ans = 0;
        for (int cand : dist.values()) {
            if (cand == Integer.MAX_VALUE) return -1;
            ans = Math.max(ans, cand);
        }

        return ans;
    }
}