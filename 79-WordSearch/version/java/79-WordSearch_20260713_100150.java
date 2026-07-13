// Last updated: 7/13/2026, 10:01:50 AM
1class Solution {
2
3    public boolean exist(char[][] board, String word) {
4
5        int rows = board.length;
6        int cols = board[0].length;
7
8        for (int i = 0; i < rows; i++) {
9            for (int j = 0; j < cols; j++) {
10
11                if (dfs(board, word, i, j, 0)) {
12                    return true;
13                }
14
15            }
16        }
17
18        return false;
19    }
20
21    public boolean dfs(char[][] board, String word, int row, int col, int index) {
22        if (index == word.length()) {
23            return true;
24        }
25        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length) {
26            return false;
27        }
28
29        if (board[row][col] != word.charAt(index)) {
30            return false;
31        }
32
33        char temp = board[row][col];
34        board[row][col] = '#';
35        boolean found =
36                dfs(board, word, row + 1, col, index + 1) ||
37                dfs(board, word, row - 1, col, index + 1) ||
38                dfs(board, word, row, col + 1, index + 1) ||
39                dfs(board, word, row, col - 1, index + 1);
40        board[row][col] = temp;
41        return found;
42    }
43}