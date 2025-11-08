package com.example.algorithms;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
    /** 给定起点 beginWord、终点 endWord 及字典 wordList，找到从 beginWord 到 endWord 每次改变一个字母的最短路径长度。
     * 最优解：BFS 在单词状态图中，时间 O(N * L * 26)，空间 O(N) */
    public static int ladderLength(String beginWord, String endWord, String[] wordList) {
        if (beginWord == null || endWord == null || wordList == null) {
            throw new IllegalArgumentException("Inputs cannot be null");
        }
        Set<String> dict = new HashSet<>();
        for (String w : wordList) dict.add(w);
        if (!dict.contains(endWord)) return 0;
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        int steps = 1;
        int L = beginWord.length();
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                String word = queue.poll();
                char[] chs = word.toCharArray();
                for (int i = 0; i < L; i++) {
                    char old = chs[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        chs[i] = c;
                        String next = new String(chs);
                        if (next.equals(endWord)) return steps + 1;
                        if (dict.contains(next) && !visited.contains(next)) {
                            visited.add(next);
                            queue.offer(next);
                        }
                    }
                    chs[i] = old;
                }
            }
            steps++;
        }
        return 0;
    }
}
