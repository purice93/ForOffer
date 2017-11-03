package top10.task04;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {

        TreeNode rNode = null;

        if (pre == null || in == null || pre.length == 0 || in.length == 0) {
            return null;
        }
        try {
            rNode = construct(pre, in, 0, pre.length - 1, 0, in.length - 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            return rNode;
        }
    }

    private static TreeNode construct(int[] pre, int[] in, int startIndexOfPre,
                                      int endIndexOfPre, int startIndexOfIn, int endIndexOfIn)
            throws Exception {

        int rootVal = pre[startIndexOfPre];
        TreeNode root = new TreeNode(rootVal);
        root.left = root.right = null;

        if (startIndexOfPre == endIndexOfPre) {

            if (endIndexOfIn == startIndexOfIn
                    && pre[startIndexOfPre] == in[endIndexOfIn]) {
                return root;
            } else {
                throw new Exception("Invalid input.");
            }
        }

        int rootIndexOfIn = startIndexOfIn;
        while (rootIndexOfIn <= endIndexOfIn && in[rootIndexOfIn] != rootVal) {
            rootIndexOfIn++;
        }
        if (rootIndexOfIn > endIndexOfIn) {
            throw new Exception("Invalid input.");
        }
        int leftTreeLength = rootIndexOfIn - startIndexOfIn;
        int leftTreePreEndIndex = startIndexOfPre + leftTreeLength;
        if (leftTreeLength > 0) {
            root.left = construct(pre, in, startIndexOfPre + 1,
                    leftTreePreEndIndex, startIndexOfIn, rootIndexOfIn - 1);
        }
        if (leftTreeLength < endIndexOfPre - startIndexOfPre) {
            root.right = construct(pre, in, leftTreePreEndIndex + 1,
                    endIndexOfPre, rootIndexOfIn + 1, endIndexOfIn);
        }
        return root;
    }
}
