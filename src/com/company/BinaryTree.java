package com.company;

/**
 * Created by AlexBrown on 2017-01-23.
 */
public class BinaryTree {

    private BTNode root = null;

    public void addValue(int value){
        if(root == null){
            root = new BTNode(value,null,null,null);
        }else{
            BTNode currentNode = root;
            while(true){
                if(value == currentNode.getValue()){
                    break;
                }else if(value < currentNode.getValue()){
                    if(currentNode.getLesserChild() == null){
                        currentNode.setLesserChild(new BTNode(value,currentNode,null,null));
                        break;
                    }else {
                        currentNode = currentNode.getLesserChild();
                    }
                }else if(value > currentNode.getValue()){
                    if(currentNode.getGreaterChild() == null){
                        currentNode.setGreaterChild(new BTNode(value,currentNode,null,null));
                        break;
                    }else{
                        currentNode = currentNode.getGreaterChild();
                    }
                }
            }
        }
    }
    public boolean findValue(int value){
        boolean exists = false;
        BTNode currentNode = root;

        while(currentNode!=null){
            if(value < currentNode.getValue()) {
                currentNode = currentNode.getLesserChild();
            }else if(value > currentNode.getValue()){
                currentNode = currentNode.getGreaterChild();
            }else if(value == currentNode.getValue()){
                exists = true;
                break;
            }
        }
        return exists;
    }
    public BTNode getMinNode(){
        BTNode currentNode = root;
        while(currentNode.getLesserChild()!=null){
            currentNode = currentNode.getLesserChild();
        }
        return currentNode;
    }
    public void printoutInOrder(){

        boolean finished = false;

        BTNode currentNode = getMinNode();

        System.out.print(String.valueOf(currentNode.getValue() + " "));

        if((currentNode.getLesserChild() == null) && (currentNode.getGreaterChild() == null) && (currentNode.getParent() != null)){
            System.out.print(" (1) ");
            currentNode = currentNode.getParent();
            if(currentNode.getParent() != null){
                currentNode.getParent().setLesserChild(currentNode);
            }else{
                this.root = currentNode;
            }
            currentNode.setLesserChild(null);
        }else if(currentNode.getGreaterChild() != null){
            System.out.print(" (2) ");
            currentNode.setTo(currentNode.getGreaterChild(),currentNode.getParent());
            if(currentNode.getParent() != null) {
                currentNode.getParent().setLesserChild(currentNode);
            }else {
                this.root = currentNode;
            }
        }else if(root.getParent() == null && root.getGreaterChild() != null && root.getLesserChild() != null){
            System.out.print(" (3) ");
            this.root = root.getGreaterChild();
        }else {
            finished = true;
        }

        if(!finished) printoutInOrder();



    }
}
