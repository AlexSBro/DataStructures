package com.company;

/**
 * Created by AlexBrown on 2017-01-23.
 */
public class BTNode extends Node {

    private int value;

    private BTNode parent;
    private BTNode lesserChild;
    private BTNode greaterChild;

    public BTNode(int value,BTNode parent, BTNode lesserChild, BTNode greaterChild) {
        this.value = value;
        this.parent = parent;
        this.lesserChild = lesserChild;
        this.greaterChild = greaterChild;
    }

    //Setters
    @Override
    public void setValue(int value) {
        this.value = value;
    }
    public void setParent(BTNode parent) {
        this.parent = parent;
    }
    public void setLesserChild(BTNode lesserChild) {
        this.lesserChild = lesserChild;
    }
    public void setGreaterChild(BTNode greaterChild) {
        this.greaterChild = greaterChild;
    }
    public void setTo(BTNode replacementNode,BTNode newParent){
        this.value = replacementNode.getValue();
        this.parent = newParent;
        this.lesserChild = replacementNode.getLesserChild();
        this.greaterChild = replacementNode.getGreaterChild();
    }

    //Getters
    @Override
    public int getValue() {
        return value;
    }
    public BTNode getParent() {
        return parent;
    }
    public BTNode getLesserChild() {
        return lesserChild;
    }
    public BTNode getGreaterChild() {
        return greaterChild;
    }

}
