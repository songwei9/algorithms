package com.example.algorithms;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    /** 给定 n 门课程 & 先修关系 prerequisites，判断是否可能修完所有课程。
     *  最优解：用 图 + 拓扑排序／DFS 检测 cycle；时间 O(V+E)、空间 O(V+E) */
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses < 0) throw new IllegalArgumentException("numCourses cannot be negative");
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            graph.get(pre[1]).add(pre[0]);
        }
        int[] visited = new int[numCourses];  // 0 = unvisited, 1 = visiting, 2 = visited
        for (int i = 0; i < numCourses; i++) {
            if (dfs(i, graph, visited)) return false;
        }
        return true;
    }

    private static boolean dfs(int node, List<List<Integer>> graph, int[] visited) {
        if (visited[node] == 1) return true;  // cycle found
        if (visited[node] == 2) return false;
        visited[node] = 1;
        for (int nei : graph.get(node)) {
            if (dfs(nei, graph, visited)) return true;
        }
        visited[node] = 2;
        return false;
    }
}
