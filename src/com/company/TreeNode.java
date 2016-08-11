package com.company;

/**
 * Created by mattmartin on 11/08/2016.
 */
public class TreeNode {
    String name;
    int depth = 0;
    TreeNode[] children;
    TreeNode parent;

    public TreeNode(String name, int depth, TreeNode[] children) {
        this.name = name;
        this.depth = depth;
        this.children = children;
    }

    public void addParent(TreeNode parent){
        this.parent = parent;
    }

    public TreeNode getParent(){
        return this.parent;
    }

    public String getName(){
        return this.name;
    }

    public TreeNode[] getChildren(){
        return this.children;
    }
}
