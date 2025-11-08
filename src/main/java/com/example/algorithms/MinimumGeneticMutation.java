package com.example.algorithms;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class MinimumGeneticMutation {
    /** 给定起始基因串 start 、目标基因串 end 和基因库 bank ，每次可改变一个字符且改变后的基因必须在库中，求最少变化次数。
     * 最优解：BFS 在状态空间字符串图中找最短路径，时间 O(N * L * 4)（N = 库大小，L = 串长），空间 O(N). */
    public static int minMutation(String start, String end, String[] bank) {
        if (start == null || end == null || bank == null) {
            throw new IllegalArgumentException("Inputs cannot be null");
        }
        Set<String> bankSet = new HashSet<>();
        for (String gene : bank) {
            bankSet.add(gene);
        }
        if (!bankSet.contains(end)) return -1;
        char[] choices = new char[]{'A','C','G','T'};
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        int steps = 0;
        Set<String> visited = new HashSet<>();
        visited.add(start);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                String cur = queue.poll();
                if (cur.equals(end)) return steps;
                char[] arr = cur.toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    char old = arr[i];
                    for (char c : choices) {
                        arr[i] = c;
                        String next = new String(arr);
                        if (!visited.contains(next) && bankSet.contains(next)) {
                            visited.add(next);
                            queue.offer(next);
                        }
                    }
                    arr[i] = old;
                }
            }
            steps++;
        }
        return -1;
    }
}
