package com.company;

/**
 * Created by AlexBrown on 2017-01-23.
 */
public class LLNode {

    private int value;
    private LLNode childNode;

    public LLNode(int value, LLNode childNode) {
        this.value = value;
        this.childNode = childNode;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void setChildNode(LLNode childNode){
        this.childNode = childNode;
    }

    public int getValue() {
        return value;
    }
    public LLNode getChildNode() {
        return childNode;
    }
}
