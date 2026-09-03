// Last updated: 9/3/2026, 2:01:56 PM
1class Solution {
2    public int sumOfLeftLeaves(TreeNode root) {
3
4        if (root == null) {
5            return 0;
6        }
7
8        int sum = 0;
9
10        if (root.left != null &&
11            root.left.left == null &&
12            root.left.right == null) {
13
14            sum += root.left.val;
15        }
16
17        sum += sumOfLeftLeaves(root.left);
18        sum += sumOfLeftLeaves(root.right);
19
20        return sum;
21    }
22}