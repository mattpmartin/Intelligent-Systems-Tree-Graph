package com.company;

/**
 * Created by mattmartin on 11/08/2016.
 */
public class TreeNode {
    String name;
    int depth = 0;
    TreeNode[] children;

    public TreeNode(String name, int depth, TreeNode[] children) {
        this.name = name;
        this.depth = depth;
        this.children = children;
    }

    public String getName(){
        return this.name;
    }

    public TreeNode[] getChildren(){
        return this.children;
    }
}
