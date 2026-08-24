// Last updated: 8/24/2026, 2:41:25 PM
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3
4        int[] indegree = new int[numCourses];
5
6        for (int[] p : prerequisites) {
7            indegree[p[0]]++;
8        }
9        int[] queue = new int[numCourses];
10        int front = 0;
11        int rear = 0;
12
13        for (int i = 0; i < numCourses; i++) {
14            if (indegree[i] == 0) {
15                queue[rear++] = i;
16            }
17        }
18
19        int count = 0;
20
21        while (front < rear) {
22
23            int course = queue[front++];
24            count++;
25            for (int[] p : prerequisites) {
26
27                if (p[1] == course) {
28
29                    indegree[p[0]]--;
30
31                    if (indegree[p[0]] == 0) {
32                        queue[rear++] = p[0];
33                    }
34                }
35            }
36        }
37
38        return count == numCourses;
39    }
40}