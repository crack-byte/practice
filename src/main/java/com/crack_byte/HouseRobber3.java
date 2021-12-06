package com.crack_byte;

import java.util.List;

public class HouseRobber3 {
    // Todo
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.left.right = new TreeNode(6);
        root.left.left = new TreeNode(7);
        int rob = rob(root);
        System.out.print(rob);
    }

    public static int calculateTreeHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(calculateTreeHeight(root.left), calculateTreeHeight(root.right)) + 1;
        }
    }

    public static int rob(TreeNode root) {
        int i = 0, h = calculateTreeHeight(root);
        int[] nums = new int[h == 1 ? 1 : (int) (Math.pow(2, h) - 1)];
//        while (i < h) {
//            heightWiseSum(root, i, list);
//            ++i;
//        }
//        int s1 = 0, s2 = 0;
//        boolean c = true;
//        for (int num : list) {
//            if (c) {
//                s1 += num;
//                s1 = Math.max(s1, s2);
//            } else {
//                s2 += num;
//                s2 = Math.max(s1, s2);
//            }
//            c = !c;
//        }
//        return Math.max(s1, s2);

        return 0;
    }


    public static void heightWiseSum(TreeNode node, int level, List<Integer> sum) {
        if (node == null) {
            sum.add(0);
            return;
        }
        if (level == 0) {
            sum.add(node.val);
        } else {
            heightWiseSum(node.left, level - 1, sum);
            heightWiseSum(node.right, level - 1, sum);
        }
    }
}
